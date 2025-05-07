package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Pan inquiry consists of two fields, the cardholder account number and it&#39;s expiration date.]
 */

@Schema(name = "Inquiry", description = "[Pan inquiry consists of two fields, the cardholder account number and it's expiration date.]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class Inquiry {

  private @Nullable String expirationDate;

  private String cardholderAccountNumber;

  public Inquiry() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Inquiry(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public Inquiry expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * [If provided, it must contain the expiration date of the account on file at the merchant for billing purposes. The date must be in YYMM format]
   * @return expirationDate
   */
  
  @Schema(name = "expirationDate", example = "2204", description = "[If provided, it must contain the expiration date of the account on file at the merchant for billing purposes. The date must be in YYMM format]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public Inquiry cardholderAccountNumber(String cardholderAccountNumber) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inquiry inquiry = (Inquiry) o;
    return Objects.equals(this.expirationDate, inquiry.expirationDate) &&
        Objects.equals(this.cardholderAccountNumber, inquiry.cardholderAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, cardholderAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inquiry {\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    cardholderAccountNumber: ").append(toIndentedString(cardholderAccountNumber)).append("\n");
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

