package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.lang.Nullable;

import io.swagger.v3.oas.annotations.media.Schema;


/**
 * [Subscription response attributes]
 */
@Data
@Schema(name = "SubscriptionResponseAttributes", description = "[Subscription response attributes]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class SubscriptionResponseAttributes {

  private @Nullable RejectedSubscriptionResponse reject;

  private @Nullable String expirationDate;

  private String subscribedStatus;

  private @Nullable String newExpirationDate;

  private @Nullable String serviceIdentifier;

  private String cardholderAccountNumber;

  private @Nullable String newCardholderAccountNumber;

  private @Nullable String acquirerOrMerchantProprietaryInfo;

  public SubscriptionResponseAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubscriptionResponseAttributes(String subscribedStatus, String cardholderAccountNumber) {
    this.subscribedStatus = subscribedStatus;
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public SubscriptionResponseAttributes reject(RejectedSubscriptionResponse reject) {
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
  public RejectedSubscriptionResponse getReject() {
    return reject;
  }

//  public void setReject(RejectedSubscription reject) {
//    this.reject = reject;
//  }

  public SubscriptionResponseAttributes expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * [This field contains the expiration date in YYMM format, where YY = 00-99 and MM = 01–12]
   * @return expirationDate
   */
  
  @Schema(name = "expirationDate", example = "2204", description = "[This field contains the expiration date in YYMM format, where YY = 00-99 and MM = 01–12]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public SubscriptionResponseAttributes subscribedStatus(String subscribedStatus) {
    this.subscribedStatus = subscribedStatus;
    return this;
  }

  /**
   * Subscription Status: Success, AlreadySubscribed, Reject]
   * @return subscribedStatus
   */
  @NotNull
  @Schema(name = "subscribedStatus", example = "Success", description = "Subscription Status: Success, AlreadySubscribed, Reject]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subscribedStatus")
  public String getSubscribedStatus() {
    return subscribedStatus;
  }

  public void setSubscribedStatus(String subscribedStatus) {
    this.subscribedStatus = subscribedStatus;
  }

  public SubscriptionResponseAttributes newExpirationDate(String newExpirationDate) {
    this.newExpirationDate = newExpirationDate;
    return this;
  }

  /**
   * [If provided, it must contain the expiration date of the account on file at the merchant for billing purposes. The date must be in YYMM format]
   * @return newExpirationDate
   */
  
  @Schema(name = "newExpirationDate", example = "2204", description = "[If provided, it must contain the expiration date of the account on file at the merchant for billing purposes. The date must be in YYMM format]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newExpirationDate")
  public String getNewExpirationDate() {
    return newExpirationDate;
  }

  public void setNewExpirationDate(String newExpirationDate) {
    this.newExpirationDate = newExpirationDate;
  }

  public SubscriptionResponseAttributes serviceIdentifier(String serviceIdentifier) {
    this.serviceIdentifier = serviceIdentifier;
    return this;
  }

  /**
   * [This field contains one of the following: * A—Account number change message * C—Closed account advice * E—Expiration date change * N—Non-participating BIN * Q—Contact cardholder advice * P—Participating BIN, no match         Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS. * V—Match made, account number and expiration date unchanged.]
   * @return serviceIdentifier
   */
  
  @Schema(name = "serviceIdentifier", example = "A", description = "[This field contains one of the following: * A—Account number change message * C—Closed account advice * E—Expiration date change * N—Non-participating BIN * Q—Contact cardholder advice * P—Participating BIN, no match         Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS. * V—Match made, account number and expiration date unchanged.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceIdentifier")
  public String getServiceIdentifier() {
    return serviceIdentifier;
  }

  public void setServiceIdentifier(String serviceIdentifier) {
    this.serviceIdentifier = serviceIdentifier;
  }

  public SubscriptionResponseAttributes cardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
    return this;
  }

  /**
   * [This field must contain the account number (Visa, Mastercard, American Express, or Discover) that is on file at the merchant for billing purposes.]
   * @return cardholderAccountNumber
   */
  @NotNull 
  @Schema(name = "cardholderAccountNumber", example = "400000XX00000000", description = "[This field must contain the account number (Visa, Mastercard, American Express, or Discover) that is on file at the merchant for billing purposes.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cardholderAccountNumber")
  public String getCardholderAccountNumber() {
    return cardholderAccountNumber;
  }

  public void setCardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public SubscriptionResponseAttributes newCardholderAccountNumber(String newCardholderAccountNumber) {
    this.newCardholderAccountNumber = newCardholderAccountNumber;
    return this;
  }

  /**
   * [This field must contain the account number (Visa, Mastercard, American Express, or Discover) that is on file at the merchant for billing purposes.]
   * @return newCardholderAccountNumber
   */
  
  @Schema(name = "newCardholderAccountNumber", example = "400000XX00000000", description = "[This field must contain the account number (Visa, Mastercard, American Express, or Discover) that is on file at the merchant for billing purposes.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newCardholderAccountNumber")
  public String getNewCardholderAccountNumber() {
    return newCardholderAccountNumber;
  }

  public void setNewCardholderAccountNumber(String newCardholderAccountNumber) {
    this.newCardholderAccountNumber = newCardholderAccountNumber;
  }

  public SubscriptionResponseAttributes acquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
    return this;
  }

  /**
   * [This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Acquirer Inquiry Request.]
   * @return acquirerOrMerchantProprietaryInfo
   */
  
  @Schema(name = "acquirerOrMerchantProprietaryInfo", example = "180720216995565000113            XXXXAIBR", description = "[This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Acquirer Inquiry Request.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SubscriptionResponseAttributes subscriptionResponseAttributes = (SubscriptionResponseAttributes) o;
    return Objects.equals(this.reject, subscriptionResponseAttributes.reject) &&
        Objects.equals(this.expirationDate, subscriptionResponseAttributes.expirationDate) &&
        Objects.equals(this.subscribedStatus, subscriptionResponseAttributes.subscribedStatus) &&
        Objects.equals(this.newExpirationDate, subscriptionResponseAttributes.newExpirationDate) &&
        Objects.equals(this.serviceIdentifier, subscriptionResponseAttributes.serviceIdentifier) &&
        Objects.equals(this.cardholderAccountNumber, subscriptionResponseAttributes.cardholderAccountNumber) &&
        Objects.equals(this.newCardholderAccountNumber, subscriptionResponseAttributes.newCardholderAccountNumber) &&
        Objects.equals(this.acquirerOrMerchantProprietaryInfo, subscriptionResponseAttributes.acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reject, expirationDate, subscribedStatus, newExpirationDate, serviceIdentifier, cardholderAccountNumber, newCardholderAccountNumber, acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponseAttributes {\n");
    sb.append("    reject: ").append(toIndentedString(reject)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    subscribedStatus: ").append(toIndentedString(subscribedStatus)).append("\n");
    sb.append("    newExpirationDate: ").append(toIndentedString(newExpirationDate)).append("\n");
    sb.append("    serviceIdentifier: ").append(toIndentedString(serviceIdentifier)).append("\n");
    sb.append("    cardholderAccountNumber: ").append(toIndentedString(cardholderAccountNumber)).append("\n");
    sb.append("    newCardholderAccountNumber: ").append(toIndentedString(newCardholderAccountNumber)).append("\n");
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

