package org.openapitools.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "subscriptions")
@Data
public class Subscription {

    @Id
    private String id;

    private String cardholderAccountNumber;
    private String expirationDate;
    private String newExpirationDate;
    private String newCardholderAccountNumber;
    private String subscribedStatus; // e.g. "Success", "AlreadySubscribed"
    private String serviceIdentifier;
    private String acquirerOrMerchantProprietaryInfo;
    private LocalDate subscriptionDate;
    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }
    public void setSubscriptionDate(LocalDate subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    private String merchantId;
    private String subMerchantName;
    private Integer acquirerSegmentId;

    private String rejectReason;
    private String rejectReasonCode;

    // Getters & setters (or use Lombok @Data if you're consistent)
}
