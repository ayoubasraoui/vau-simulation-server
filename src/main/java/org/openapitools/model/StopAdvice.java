package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Stop advice fields]
 */

@Schema(name = "stopAdvice", description = "[Stop advice fields]")
@JsonTypeName("stopAdvice")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class StopAdvice {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate startDate;

  private String merchantName;

  private String cardAcceptorId;

  private String cardholderAccountNumber;

  public StopAdvice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StopAdvice(String merchantName, String cardAcceptorId, String cardholderAccountNumber) {
    this.merchantName = merchantName;
    this.cardAcceptorId = cardAcceptorId;
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public StopAdvice startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * [This field contains the start date, which shouldn't be less than the current date, and its format is yyyy-mm-dd, the default value is the current date.]
   * @return startDate
   */
  @Valid
  @Schema(name = "startDate", description = "[This field contains the start date, which shouldn't be less than the current date, and its format is yyyy-mm-dd, the default value is the current date.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public StopAdvice merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * [This field must contain merchant name.]
   * @return merchantName
   */
  @NotNull
  @Schema(name = "merchantName", example = "TestMerchant", description = "[This field must contain merchant name.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantName")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public StopAdvice cardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

  /**
   * [This field must contain card acceptor id.]
   * @return cardAcceptorId
   */
  @NotNull 
  @Schema(name = "cardAcceptorId", example = "89389898", description = "[This field must contain card acceptor id.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cardAcceptorId")
  public String getCardAcceptorId() {
    return cardAcceptorId;
  }

  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }

  public StopAdvice cardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
    return this;
  }

  /**
   * [This field must contain the account number (Visa, Mastercard, American Express, or Discover).]
   * @return cardholderAccountNumber
   */
  @NotNull 
  @Schema(name = "cardholderAccountNumber", example = "400000XX00000000", description = "[This field must contain the account number (Visa, Mastercard, American Express, or Discover).]", requiredMode = Schema.RequiredMode.REQUIRED)
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
    StopAdvice stopAdvice = (StopAdvice) o;
    return Objects.equals(this.startDate, stopAdvice.startDate) &&
        Objects.equals(this.merchantName, stopAdvice.merchantName) &&
        Objects.equals(this.cardAcceptorId, stopAdvice.cardAcceptorId) &&
        Objects.equals(this.cardholderAccountNumber, stopAdvice.cardholderAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, merchantName, cardAcceptorId, cardholderAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopAdvice {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
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

