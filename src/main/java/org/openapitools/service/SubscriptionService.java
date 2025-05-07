package org.openapitools.service;

import org.openapitools.model.PanPool;
import org.openapitools.model.Subscription;
import org.openapitools.repository.PanPoolRepository;
import org.openapitools.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;
    @Autowired
    private PanPoolRepository panPoolRepository;

    public boolean alreadySubscribed(String pan) {
        return subscriptionRepository.existsByCardholderAccountNumber(pan);
    }

    public Subscription save(Subscription sub) {
        return subscriptionRepository.save(sub);
    }

    public Optional<Subscription> getByPan(String pan) {
        return subscriptionRepository.findByCardholderAccountNumber(pan);
    }
    public List<Subscription> findAll() {
        return subscriptionRepository.findAll();
    }
    public void deleteByPan(String pan) {
        subscriptionRepository.findByCardholderAccountNumber(pan)
                .ifPresent(subscriptionRepository::delete);
    }
    public Subscription updateWithNewPan(String oldPan, String oldExp, String merchantId, String subMerchantName, Integer acquirerSegmentId) {
        Optional<PanPool> optional = panPoolRepository.findFirstByUsedFalse();
        if (optional.isEmpty()) {
            throw new RuntimeException("No unused PANs available");
        }

        PanPool selected = optional.get();
        selected.setUsed(true);
        panPoolRepository.save(selected); // mark as used

        Subscription sub = new Subscription();
        sub.setCardholderAccountNumber(oldPan);
        sub.setExpirationDate(oldExp);
        sub.setNewCardholderAccountNumber(selected.getPan());
        sub.setNewExpirationDate(selected.getExpiry());
        sub.setSubscribedStatus("Success");
        sub.setServiceIdentifier("A");
        sub.setAcquirerOrMerchantProprietaryInfo("180720216995565000113            XXXXAIBR");
        sub.setMerchantId(merchantId);
        sub.setSubMerchantName(subMerchantName);
        sub.setAcquirerSegmentId(acquirerSegmentId);

        return subscriptionRepository.save(sub);
    }
}
