package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Subscription request attributes]
 */

@Schema(name = "SubscriptionRequestAttributes", description = "[Subscription request attributes]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class SubscriptionRequestAttributes {

  private @Nullable String expirationDate;

  private String cardholderAccountNumber;

  private @Nullable String acquirerOrMerchantProprietaryInfo;

  public SubscriptionRequestAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubscriptionRequestAttributes(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public SubscriptionRequestAttributes expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * [If provided, it must contain the expiration date of the account on file at the merchant for billing purposes. The date must be in YYMM format]
   * @return expirationDate
   */
  @Size(min = 4, max = 4)
  @Schema(name = "expirationDate", example = "2204", description = "[If provided, it must contain the expiration date of the account on file at the merchant for billing purposes. The date must be in YYMM format]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public SubscriptionRequestAttributes cardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
    return this;
  }

  /**
   * [This field must contain the account number (Visa, Mastercard, American Express, or Discover) that is on file at the merchant for billing purposes.]
   * @return cardholderAccountNumber
   */
  @NotNull @Size(min = 13, max = 19) 
  @Schema(name = "cardholderAccountNumber", example = "400000XX00000000", description = "[This field must contain the account number (Visa, Mastercard, American Express, or Discover) that is on file at the merchant for billing purposes.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cardholderAccountNumber")
  public String getCardholderAccountNumber() {
    return cardholderAccountNumber;
  }

  public void setCardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public SubscriptionRequestAttributes acquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
    return this;
  }

  /**
   * [If provided, it contains acquirer or merchant proprietary information such as a customer ID that is carried in the merchant’s back-end system.]
   * @return acquirerOrMerchantProprietaryInfo
   */
  @Size(min = 0, max = 75) 
  @Schema(name = "acquirerOrMerchantProprietaryInfo", example = "180720216995565000113            XXXXAIBR", description = "[If provided, it contains acquirer or merchant proprietary information such as a customer ID that is carried in the merchant’s back-end system.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SubscriptionRequestAttributes subscriptionRequestAttributes = (SubscriptionRequestAttributes) o;
    return Objects.equals(this.expirationDate, subscriptionRequestAttributes.expirationDate) &&
        Objects.equals(this.cardholderAccountNumber, subscriptionRequestAttributes.cardholderAccountNumber) &&
        Objects.equals(this.acquirerOrMerchantProprietaryInfo, subscriptionRequestAttributes.acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, cardholderAccountNumber, acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequestAttributes {\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

