package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.repository.PanPoolRepository;
import org.openapitools.service.MerchantService;
import org.openapitools.service.StopAdviceService;
import org.openapitools.service.SubscriptionService;
import org.openapitools.util.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.openapitools.model.Subscription;

import jakarta.validation.Valid;

import java.time.LocalDate;
import java.util.*;

import org.openapitools.model.RejectedInquiryResponse;
import org.openapitools.model.SuccessfulInquiryResponse;
import org.openapitools.model.AccountUpdatesResponse;
import java.util.Collections;

@Controller
public class VauApiController implements VauApi {

    @Autowired
    private MerchantService merchantService;
    @Autowired
    private SubscriptionService subscriptionService;
    @Autowired
    private StopAdviceService stopAdviceService;
    @Autowired
    private PanPoolRepository panPoolRepository;


    private final NativeWebRequest request;

    public VauApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Response> inquiryUsingPOST(@Valid @RequestBody Request inquiryRequest) {
        Response response = new Response();
        response.setAcquirerSegmentId(inquiryRequest.getAcquirerSegmentId());
        response.setMerchantId(inquiryRequest.getMerchantId());
        response.setSubMerchantName(inquiryRequest.getSubMerchantName());
        response.setAcquirerOrMerchantProprietaryInfo("180720216995565000113            XXXXAIBR");

        List<SuccessfulInquiryResponse> successfulResponses = new ArrayList<>();
        List<RejectedInquiryResponse> rejectedResponses = new ArrayList<>();

        for (Inquiry inquiry : inquiryRequest.getInquiries()) {
            String pan = inquiry.getCardholderAccountNumber();
            String expiry = inquiry.getExpirationDate();

            Optional<Subscription> existing = subscriptionService.getByPan(pan);

            if (existing.isPresent()) {
                Subscription sub = existing.get();
                SuccessfulInquiryResponse res = new SuccessfulInquiryResponse();
                res.setOldCardholderAccountNumber(pan);
                res.setOldExpirationDate(expiry);
                res.setNewCardholderAccountNumber(sub.getNewCardholderAccountNumber());
                res.setNewExpirationDate(sub.getNewExpirationDate());
                res.setServiceIdentifier(sub.getServiceIdentifier());
                res.setPreviouslySentFlag("Y");
                successfulResponses.add(res);
            } else {
                try {
                    Subscription newSub = subscriptionService.updateWithNewPan(
                            pan,
                            expiry,
                            inquiryRequest.getMerchantId(),
                            inquiryRequest.getSubMerchantName(),
                            inquiryRequest.getAcquirerSegmentId()
                    );

                    SuccessfulInquiryResponse res = new SuccessfulInquiryResponse();
                    res.setOldCardholderAccountNumber(pan);
                    res.setOldExpirationDate(expiry);
                    res.setNewCardholderAccountNumber(newSub.getNewCardholderAccountNumber());
                    res.setNewExpirationDate(newSub.getNewExpirationDate());
                    res.setServiceIdentifier(newSub.getServiceIdentifier());
                    res.setPreviouslySentFlag("Y");
                    successfulResponses.add(res);
                } catch (RuntimeException e) {
                    RejectedInquiryResponse rej = new RejectedInquiryResponse();
                    rej.setCardholderAccountNumber(pan);
                    rej.setExpirationDate(expiry);
                    rej.setRejectReason("No PANs available");
                    rej.setRejectReasonCode("Z");
                    rejectedResponses.add(rej);
                }
            }
        }

        response.setResponses(successfulResponses);
        response.setRejects(rejectedResponses);

        return ResponseEntity.ok(response);
    }

    @Override
//    public ResponseEntity<MerchantEnrolmentResponse> merchantEnrolmentUsingPOST(@Valid @RequestBody MerchantEnrolmentRequest request, @RequestHeader(value = "Accept", required = false) String accept) {
//        MerchantEnrolmentResponse response = new MerchantEnrolmentResponse();
//        response.setAcquirerSegmentId(2);
//        response.setMerchants(Collections.emptyList());
//
//        RejectedMerchantEnrollmentResponse reject = new RejectedMerchantEnrollmentResponse();
//        reject.rejectReasonCode("M");
//        reject.rejectReason("Merchant Id already exists for this Acquirer Segment");
//
//        //here is where i want to set the merchant id
//        MerchantEnrolmentResponse merchant = new MerchantEnrolmentResponse();
//        merchant.setMerchantId("000000705853");
//        merchant.setMerchantName("GS PERFORMANCE");
//        merchant.setEnrollStatus("Reject"); // or "Success" if applicable
//        merchant.setReject(reject);
//
//        // Add to response
//        response.setMerchants(Collections.singletonList(merchant));
//
//        return ResponseEntity.ok(response);
//    }

    public ResponseEntity<MerchantEnrolmentResponse> merchantEnrolmentUsingPOST(
            @Valid @RequestBody MerchantEnrolmentRequest request,
            @RequestHeader(value = "Accept", required = false) String accept) {

        MerchantEnrolmentResponse response = new MerchantEnrolmentResponse();
        response.setAcquirerSegmentId(request.getAcquirerSegmentId());

        MerchantRequest incoming = request.getMerchants().get(0); // extract the first merchant
        MerchantResponse merchant = new MerchantResponse();
        RejectMerchant reject = new RejectMerchant();

        if (merchantService.merchantExists(incoming.getMerchantId())) {
            reject.setRejectCode("M");
            reject.setRejectMessage("Merchant Id already exists for this Acquirer Segment");
            merchant.setEnrollStatus("Reject");
            merchant.setReject(reject);
        } else {
            merchant.setEnrollStatus("Success");
            merchant.setReject(null);

            // Convert MerchantRequest to Merchant (MongoDB model) and save
            merchantService.saveMerchant(MerchantMapper.fromRequest(incoming));

        }

        merchant.setMerchantId(incoming.getMerchantId());
        merchant.setMerchantName(incoming.getMerchantName());

        response.setMerchants(Collections.singletonList(merchant));
        return ResponseEntity.ok(response);
    }


    @Override
    public ResponseEntity<MerchantSearchResponse> merchantSearchUsingPOST(
            @Valid @RequestBody MerchantSearchRequest request,
            @RequestHeader(value = "Accept", required = false) String accept) {

        String merchantId = request.getMerchants().get(0).getMerchantId();

        MerchantSearchResponse response = new MerchantSearchResponse();
        response.setAcquirerSegmentId(2);

        // Fetch ALL merchants with the given ID
        List<Merchant> foundMerchants = merchantService.findAllByMerchantId(merchantId);

        // Detect duplicates
        if (foundMerchants.size() > 1) {
            // Return 409 Conflict if duplicates exist
            Map<String, Object> error = new HashMap<>();
            error.put("error", "DuplicateMerchantIdException");
            error.put("message", "Multiple merchants found with the same ID: " + merchantId);
            error.put("count", foundMerchants.size());
            return ResponseEntity.status(HttpStatus.CONFLICT).body(null); // or return ResponseEntity.status(409).body(error);
        }

        if (!foundMerchants.isEmpty()) {
            response.setMerchants(Collections.singletonList(foundMerchants.get(0)));
        } else {
            // Return mock rejection if merchant not found
            Merchant rejectMerchant = new Merchant();
            rejectMerchant.setMerchantId(merchantId);
            rejectMerchant.setMerchantStatus("Reject");

            RejectMerchantSearch reject = new RejectMerchantSearch();
            reject.setRejectCode("I");
            reject.setRejectMessage("Merchant ID must be 12 characters");

            rejectMerchant.setReject(reject);
            response.setMerchants(Collections.singletonList(rejectMerchant));
        }

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<StopAdviceResponse> stopAdviceUsingPOST(
            @Valid @RequestBody StopAdviceRequest stopAdviceRequest,
            @RequestHeader(value = "Accept", required = false) String accept) {

        StopAdvice stop = stopAdviceRequest.getStopadvices().get(0); // ✅ Extract first StopAdvice from list
        String pan = stop.getCardholderAccountNumber();

        RejectedStopAdviceResponse reject = new RejectedStopAdviceResponse();
        SuccessfulStopAdviceResponse success = new SuccessfulStopAdviceResponse();
        StopAdviceResponse response = new StopAdviceResponse();
        response.setIssuerSegmentId(stopAdviceRequest.getIssuerSegmentId());

        if (stopAdviceService.exists(pan)) {
            // Return reject if PAN already has a stop advice
            reject.setCardholderAccountNumber(pan);
            reject.setCardAcceptorId(stop.getCardAcceptorId());
            reject.setMerchantName(stop.getMerchantName());
            reject.setStartDate(stop.getStartDate());
            reject.setRejectCode("G");
            reject.setRejectMessage("Stop advice already exists for this PAN");

            response.setRejects(Collections.singletonList(reject));
            response.setResponses(Collections.emptyList());
        } else {
            // Save it to Mongo
            StopAdviceEntry entry = new StopAdviceEntry();
            entry.setCardholderAccountNumber(pan);
            entry.setCardAcceptorId(stop.getCardAcceptorId());
            entry.setMerchantName(stop.getMerchantName());
            entry.setStartDate(stop.getStartDate());
            entry.setIssuerSegmentId(stopAdviceRequest.getIssuerSegmentId());
            entry.setResponseCode("1");
            entry.setResponseMessage("Stop advice applied in both RTVAU and VAU");

            stopAdviceService.save(entry);

            // Return success
            success.setCardholderAccountNumber(pan);
            success.setCardAcceptorId(entry.getCardAcceptorId());
            success.setMerchantName(entry.getMerchantName());
            success.setStartDate(entry.getStartDate());
            success.setResponseCode("1");
            success.setResponseMessage("Stop advice applied in both RTVAU and VAU");

            response.setResponses(Collections.singletonList(success));
            response.setRejects(Collections.emptyList());
        }

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<SubscriptionResponse> subscribeUsingPOST(
            @Valid @RequestBody SubscriptionRequest subscriptionRequest,
            @RequestHeader(value = "Accept", required = false) String accept) {

        SubscriptionRequestAttributes incoming = subscriptionRequest.getSubscriptions().get(0);
        SubscriptionResponseAttributes responseAttr = new SubscriptionResponseAttributes();
        String pan = incoming.getCardholderAccountNumber();

        if (subscriptionService.alreadySubscribed(pan)) {
            // PAN already subscribed → respond with Reject
            RejectedSubscriptionResponse reject = new RejectedSubscriptionResponse();
            reject.setRejectReason("Already Subscribed");
            reject.setRejectReasonCode("DUP");

            responseAttr.setReject(reject);
            responseAttr.setSubscribedStatus("Reject");
        } else {
            // Save new subscription
            Subscription sub = new Subscription();
            sub.setCardholderAccountNumber(pan);
            sub.setExpirationDate(incoming.getExpirationDate());
            sub.setSubscribedStatus("Success");
            sub.setNewExpirationDate("2204"); // mock new date
            sub.setNewCardholderAccountNumber(pan);
            sub.setServiceIdentifier("A");
            sub.setAcquirerOrMerchantProprietaryInfo("180720216995565000113            XXXXAIBR");

            sub.setMerchantId(subscriptionRequest.getMerchantId());
            sub.setSubMerchantName(subscriptionRequest.getSubMerchantName());
            sub.setAcquirerSegmentId(subscriptionRequest.getAcquirerSegmentId());

            subscriptionService.save(sub);

            responseAttr.setSubscribedStatus("Success");
            responseAttr.setExpirationDate(incoming.getExpirationDate());
            responseAttr.setNewExpirationDate("2204");
            responseAttr.setNewCardholderAccountNumber(pan);
            responseAttr.setCardholderAccountNumber(pan);
            responseAttr.setServiceIdentifier("A");
            responseAttr.setAcquirerOrMerchantProprietaryInfo("180720216995565000113            XXXXAIBR");
        }

        SubscriptionResponse response = new SubscriptionResponse();
        response.setMerchantId(subscriptionRequest.getMerchantId());
        response.setSubMerchantName(subscriptionRequest.getSubMerchantName());
        response.setAcquirerSegmentId(subscriptionRequest.getAcquirerSegmentId());
        response.setSubscriptions(Collections.singletonList(responseAttr));

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<SubscriptionDeleteResponse> subscriptionDeleteUsingPOST(
            @Valid @RequestBody SubscriptionDeleteRequest subscriptionDeleteRequest) {

        DeleteSubscriptionAttributes incoming = subscriptionDeleteRequest.getSubscriptions().get(0);
        String pan = incoming.getCardholderAccountNumber();
        String merchantId = subscriptionDeleteRequest.getMerchantId();
        String subMerchantName = subscriptionDeleteRequest.getSubMerchantName();
        Integer acquirerSegmentId = subscriptionDeleteRequest.getAcquirerSegmentId();

        DeleteSubscription responseEntry = new DeleteSubscription();

        if (subscriptionService.alreadySubscribed(pan)) {
            subscriptionService.deleteByPan(pan);
            responseEntry.setCardholderAccountNumber(pan);
            responseEntry.setDeleteStatus("Success");
            responseEntry.setAcquirerOrMerchantProprietaryInfo("180720216995565000113            XXXXAIBR");
        } else {
            RejectedSubscription reject = new RejectedSubscription();
            reject.setRejectReason("PAN not subscribed");
            reject.setRejectReasonCode("404");

            responseEntry.setCardholderAccountNumber(pan);
            responseEntry.setDeleteStatus("Reject");
            responseEntry.setReject(reject);
        }

        SubscriptionDeleteResponse response = new SubscriptionDeleteResponse();
        response.setAcquirerSegmentId(acquirerSegmentId);
        response.setMerchantId(merchantId);
        response.setSubMerchantName(subMerchantName);
        response.setSubscriptions(Collections.singletonList(responseEntry));

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<SubscriptionInquiryResponse> subscriptionInquiryUsingPOST(
            @Valid @RequestBody SubscriptionInquiryRequest subscriptionInquiryRequest,
            @RequestHeader(value = "Accept", required = false) String accept) {

        InquirySubscriptionAttributes incoming = subscriptionInquiryRequest.getSubscriptions().get(0);
        String pan = incoming.getCardholderAccountNumber();

        SubscriptionEnquiryPanStatus responseEntry = new SubscriptionEnquiryPanStatus();

        if (subscriptionService.alreadySubscribed(pan)) {
            Subscription sub = subscriptionService.getByPan(pan).get();

            responseEntry.setCardholderAccountNumber(sub.getCardholderAccountNumber());
            responseEntry.setSubscribedStatus("Success");
            responseEntry.setAcquirerOrMerchantProprietaryInfo(sub.getAcquirerOrMerchantProprietaryInfo());
        } else {
            RejectedSubscription reject = new RejectedSubscription();
            reject.setRejectReason("Account Number not found");
            reject.setRejectReasonCode("4");

            responseEntry.setCardholderAccountNumber(pan);
            responseEntry.setSubscribedStatus("Reject");
            responseEntry.setReject(reject);
        }

        SubscriptionInquiryResponse response = new SubscriptionInquiryResponse();
        response.setMerchantId(subscriptionInquiryRequest.getMerchantId());
        response.setSubMerchantName(subscriptionInquiryRequest.getSubMerchantName());
        response.setAcquirerSegmentId(subscriptionInquiryRequest.getAcquirerSegmentId());
        response.setSubscriptions(Collections.singletonList(responseEntry));

        return ResponseEntity.ok(response);
    }

//    @GetMapping("/vau/issuer-api/v1/search-update")
//    public ResponseEntity<Map<String, Object>> searchUpdateOnly(@RequestParam String pan) {
//        Optional<Subscription> optional = subscriptionService.getByPan(pan);
//
//        if (optional.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                    .body(Map.of("error", "PAN not found"));
//        }
//
//        Subscription sub = optional.get();
//        Map<String, Object> result = new HashMap<>();
//        result.put("pan", sub.getCardholderAccountNumber());
//        result.put("oldExpiry", sub.getExpirationDate());
//
//        if (sub.getNewCardholderAccountNumber() != null &&
//                !sub.getNewCardholderAccountNumber().equals(sub.getCardholderAccountNumber())) {
//
//            result.put("updated", true);
//            result.put("newPan", sub.getNewCardholderAccountNumber());
//            result.put("newExpiry", sub.getNewExpirationDate());
//
//        } else {
//            boolean panAvailable = panPoolRepository.findFirstByUsedFalse().isPresent();
//            result.put("updated", false);
//
//            if (panAvailable) {
//                result.put("message", "Update not yet applied.");
//            } else {
//                result.put("message", "No available PANs in the pool.");
//            }
//        }
//
//        return ResponseEntity.ok(result);
//    }


    @GetMapping("/vau/issuer-api/v1/search-update")
    public ResponseEntity<Map<String, Object>> searchUpdateWithAgeCheck(@RequestParam String pan) {
        Optional<Subscription> optional = subscriptionService.getByPan(pan);

        if (optional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "PAN not found"));
        }

        Subscription sub = optional.get();
        Map<String, Object> result = new HashMap<>();
        result.put("pan", sub.getCardholderAccountNumber());
        result.put("oldExpiry", sub.getExpirationDate());

        // 👇 Parse expiration date YYMM → LocalDate
        String expiry = sub.getExpirationDate();
        if (expiry.length() != 4) {
            result.put("updated", false);
            result.put("message", "Invalid expiration date format.");
            return ResponseEntity.ok(result);
        }

        int year = 2000 + Integer.parseInt(expiry.substring(0, 2));
        int month = Integer.parseInt(expiry.substring(2, 4));
        LocalDate expirationDate = LocalDate.of(year, month, 1);

        boolean dueForUpdate = !expirationDate.isAfter(LocalDate.now());

        if (!dueForUpdate) {
            result.put("updated", false);
            result.put("message", "PAN is not yet due for update (still valid).");
            return ResponseEntity.ok(result);
        }


        // 👇 Already updated?
        if (sub.getNewCardholderAccountNumber() != null &&
                !sub.getNewCardholderAccountNumber().equals(sub.getCardholderAccountNumber())) {

            result.put("updated", true);
            result.put("newPan", sub.getNewCardholderAccountNumber());
            result.put("newExpiry", sub.getNewExpirationDate());
            return ResponseEntity.ok(result);
        }

        // 👇 Try to assign from PAN pool
        Optional<PanPool> availablePan = panPoolRepository.findFirstByUsedFalse();
        if (availablePan.isEmpty()) {
            result.put("updated", false);
            result.put("message", "No available PANs in the pool.");
            return ResponseEntity.ok(result);
        }

        // 👇 Apply update now
        PanPool newPan = availablePan.get();
        newPan.setUsed(true);
        panPoolRepository.save(newPan);

        sub.setNewCardholderAccountNumber(newPan.getPan());
        sub.setNewExpirationDate(newPan.getExpiry());
        sub.setCardholderAccountNumber(newPan.getPan());
        sub.setExpirationDate(newPan.getExpiry());
        sub.setSubscriptionDate(LocalDate.now());

        subscriptionService.save(sub);

        result.put("updated", true);
        result.put("newPan", newPan.getPan());
        result.put("newExpiry", newPan.getExpiry());

        return ResponseEntity.ok(result);
    }



//    @GetMapping("/vau/issuer-api/v1/search-update")
//    public ResponseEntity<Map<String, Object>> searchAndApplyUpdate(@RequestParam String pan) {
//        Optional<Subscription> optional = subscriptionService.getByPan(pan);
//
//        if (optional.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("error", "PAN not found"));
//        }
//
//        Subscription sub = optional.get();
//        Map<String, Object> result = new HashMap<>();
//
//        result.put("pan", sub.getCardholderAccountNumber());
//        result.put("oldExpiry", sub.getExpirationDate());
//
//        if (sub.getNewCardholderAccountNumber() != null) {
//            // Already updated
//            result.put("updated", true);
//            result.put("newPan", sub.getNewCardholderAccountNumber());
//            result.put("newExpiry", sub.getNewExpirationDate());
//        } else {
//            Optional<PanPool> panOpt = panPoolRepository.findFirstByUsedFalse();
//
//            if (panOpt.isPresent()) {
//                PanPool newPan = panOpt.get();
//                newPan.setUsed(true);
//                panPoolRepository.save(newPan);
//
//                sub.setNewCardholderAccountNumber(newPan.getPan());
//                sub.setNewExpirationDate(newPan.getExpiry());
//                sub.setCardholderAccountNumber(newPan.getPan());
//                sub.setExpirationDate(newPan.getExpiry());
//                sub.setSubscriptionDate(LocalDate.now());
//
//                subscriptionService.save(sub);
//
//                result.put("updated", true);
//                result.put("newPan", newPan.getPan());
//                result.put("newExpiry", newPan.getExpiry());
//            } else {
//                result.put("updated", false);
//                result.put("error", "No available PANs in the pool");
//            }
//        }
//
//        return ResponseEntity.ok(result);
//    }

//    @PostMapping("/vau/issuer-api/v1/apply-update")
//    public ResponseEntity<?> applyUpdate(@RequestParam String pan) {
//        Optional<Subscription> optional = subscriptionService.getByPan(pan);
//
//        if (optional.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("PAN not found");
//        }
//
//        Subscription sub = optional.get();
//
//        if (sub.getNewCardholderAccountNumber() != null) {
//            return ResponseEntity.ok("Update already applied.");
//        }
//
//        Optional<PanPool> panOpt = panPoolRepository.findFirstByUsedFalse();
//
//        if (panOpt.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("No available PANs in pool.");
//        }
//
//        PanPool newPan = panOpt.get();
//        newPan.setUsed(true);
//        panPoolRepository.save(newPan);
//
//        sub.setNewCardholderAccountNumber(newPan.getPan());
//        sub.setNewExpirationDate(newPan.getExpiry());
//        sub.setCardholderAccountNumber(newPan.getPan());
//        sub.setExpirationDate(newPan.getExpiry());
//        sub.setSubscriptionDate(LocalDate.now());
//
//        subscriptionService.save(sub);
//
//        return ResponseEntity.ok("✅ PAN update applied successfully.");
//    }


    @PostMapping("/vau/issuer-api/v1/updates")
    @Override
    public ResponseEntity<OutboundResponse> mockAccountUpdateResponse(
            @Valid @RequestBody EncryptedPayload encryptedPayload,
            @RequestHeader(value = "keyId", required = false) String keyId,
            @RequestHeader(value = "X-Correlation-ID", required = false) String xCorrelationID,
            @RequestHeader(value = "Accept", required = false) String accept) {

        OutboundResponse response = new OutboundResponse();
        response.setAcquirerSegmentId(2);
        response.setMerchantId("000000705853");
        response.setSubMerchantName("SUB-MERCHANT-NAME");
        response.setRequestId(xCorrelationID != null
                ? xCorrelationID
                : UUID.randomUUID().toString());

        List<AccountUpdatesResponse> updates = new ArrayList<>();
        for (Subscription sub : subscriptionService.findAll()) {
            AccountUpdatesResponse update = new AccountUpdatesResponse();
            update.setResponseCode("SUCCESS");
            update.setOldCardholderAccountNumber(sub.getCardholderAccountNumber());
            update.setOldExpirationDate(sub.getExpirationDate());
            update.setAcquirerOrMerchantProprietaryInfo(sub.getAcquirerOrMerchantProprietaryInfo());

            // Only assign a new PAN if the subscription has not been updated yet
            if (sub.getNewCardholderAccountNumber() == null || sub.getNewExpirationDate() == null) {
                Optional<PanPool> availablePan = panPoolRepository.findFirstByUsedFalse();
                if (availablePan.isPresent()) {
                    PanPool pan = availablePan.get();
                    sub.setNewCardholderAccountNumber(pan.getPan());
                    sub.setNewExpirationDate(pan.getExpiry());
                    pan.setUsed(true);
                    panPoolRepository.save(pan);
                    sub.setCardholderAccountNumber(pan.getPan());
                    sub.setExpirationDate(pan.getExpiry());
                    sub.setSubscriptionDate(LocalDate.now());
                    subscriptionService.save(sub);
                }
            }

            update.setNewCardholderAccountNumber(sub.getNewCardholderAccountNumber());
            update.setNewExpirationDate(sub.getNewExpirationDate());

            updates.add(update);
        }
        response.setAccountUpdates(updates);
        return ResponseEntity.ok(response);
    }
}

