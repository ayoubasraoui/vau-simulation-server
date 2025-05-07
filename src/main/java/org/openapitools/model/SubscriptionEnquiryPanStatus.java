package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.openapitools.model.RejectedSubscription;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [List of Subscription Inquiry Responses]
 */

@Schema(name = "SubscriptionEnquiryPanStatus", description = "[List of Subscription Inquiry Responses]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class SubscriptionEnquiryPanStatus {

  private @Nullable RejectedSubscription reject;

  private String subscribedStatus;

  private String cardholderAccountNumber;

  private @Nullable String acquirerOrMerchantProprietaryInfo;

  public SubscriptionEnquiryPanStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubscriptionEnquiryPanStatus(String subscribedStatus, String cardholderAccountNumber) {
    this.subscribedStatus = subscribedStatus;
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public SubscriptionEnquiryPanStatus reject(RejectedSubscription reject) {
    this.reject = reject;
    return this;
  }

  /**
   * Get reject
   * @return reject
   */
  @Valid
  @Schema(name = "reject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reject")
  public RejectedSubscription getReject() {
    return reject;
  }

  public void setReject(RejectedSubscription reject) {
    this.reject = reject;
  }

  public SubscriptionEnquiryPanStatus subscribedStatus(String subscribedStatus) {
    this.subscribedStatus = subscribedStatus;
    return this;
  }

  /**
   * [This field contains the  status whether the enquired pan is Subscribed or NotSubscribed or Reject
   * @return subscribedStatus
   */
  @NotNull
  @Schema(name = "subscribedStatus", description = "[This field contains the  status whether the enquired pan is Subscribed or NotSubscribed or Reject", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subscribedStatus")
  public String getSubscribedStatus() {
    return subscribedStatus;
  }

  public void setSubscribedStatus(String subscribedStatus) {
    this.subscribedStatus = subscribedStatus;
  }

  public SubscriptionEnquiryPanStatus cardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
    return this;
  }

  /**
   * [This field contains the account number that was submitted in the associated Subscription Inquiry Request.]
   * @return cardholderAccountNumber
   */
  @NotNull 
  @Schema(name = "cardholderAccountNumber", example = "400000XX00000000", description = "[This field contains the account number that was submitted in the associated Subscription Inquiry Request.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cardholderAccountNumber")
  public String getCardholderAccountNumber() {
    return cardholderAccountNumber;
  }

  public void setCardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public SubscriptionEnquiryPanStatus acquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
    return this;
  }

  /**
   * [This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Subscription Inquiry Request.]
   * @return acquirerOrMerchantProprietaryInfo
   */
  
  @Schema(name = "acquirerOrMerchantProprietaryInfo", example = "180720216995565000113            XXXXAIBR", description = "[This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Subscription Inquiry Request.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acquirerOrMerchantProprietaryInfo")
  public String getAcquirerOrMerchantProprietaryInfo() {
    return acquirerOrMerchantProprietaryInfo;
  }

  public void setAcquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionEnquiryPanStatus subscriptionEnquiryPanStatus = (SubscriptionEnquiryPanStatus) o;
    return Objects.equals(this.reject, subscriptionEnquiryPanStatus.reject) &&
        Objects.equals(this.subscribedStatus, subscriptionEnquiryPanStatus.subscribedStatus) &&
        Objects.equals(this.cardholderAccountNumber, subscriptionEnquiryPanStatus.cardholderAccountNumber) &&
        Objects.equals(this.acquirerOrMerchantProprietaryInfo, subscriptionEnquiryPanStatus.acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reject, subscribedStatus, cardholderAccountNumber, acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionEnquiryPanStatus {\n");
    sb.append("    reject: ").append(toIndentedString(reject)).append("\n");
    sb.append("    subscribedStatus: ").append(toIndentedString(subscribedStatus)).append("\n");
    sb.append("    cardholderAccountNumber: ").append(toIndentedString(cardholderAccountNumber)).append("\n");
    sb.append("    acquirerOrMerchantProprietaryInfo: ").append(toIndentedString(acquirerOrMerchantProprietaryInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

