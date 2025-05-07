package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * [RejectedStopAdviceResponse]
 */

@Schema(name = "RejectedStopAdviceResponse", description = "[RejectedStopAdviceResponse]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class RejectedStopAdviceResponse {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate startDate;

  private @Nullable String rejectCode;

  private String merchantName;

  private @Nullable String rejectMessage;

  private String cardAcceptorId;

  private String cardholderAccountNumber;

  public RejectedStopAdviceResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RejectedStopAdviceResponse(String merchantName, String cardAcceptorId, String cardholderAccountNumber) {
    this.merchantName = merchantName;
    this.cardAcceptorId = cardAcceptorId;
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public RejectedStopAdviceResponse startDate(LocalDate startDate) {
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

  public RejectedStopAdviceResponse rejectCode(String rejectCode) {
    this.rejectCode = rejectCode;
    return this;
  }

  /**
   * [This field contains one of the following reject codes: * H—Account number does not start with 2, 3, 4, 5 or 6 * G—Account number contains non-numeric characters or is blank * L—Account number is not of proper length (must be 13, 15, 16 or 19) * M—Account number is not mod 10 compliant * N—No stop advice applied, unable to find merchant information for the requested card acceptor id * R—Account number is not associated with requested segment id * S—Start date must not be less than the current date * D—Duplicate stop advice in the request * I—Mandatory field cardholderAccountNumber is missing or blank in the request * J—Mandatory field cardAcceptorId is missing or blank in the request * K—Mandatory field merchantName is missing or blank in the request * F—Stop advice is already placed for requested account number and merchant] 
   * @return rejectCode
   */
  
  @Schema(name = "rejectCode", example = "G", description = "[This field contains one of the following reject codes: * H—Account number does not start with 2, 3, 4, 5 or 6 * G—Account number contains non-numeric characters or is blank * L—Account number is not of proper length (must be 13, 15, 16 or 19) * M—Account number is not mod 10 compliant * N—No stop advice applied, unable to find merchant information for the requested card acceptor id * R—Account number is not associated with requested segment id * S—Start date must not be less than the current date * D—Duplicate stop advice in the request * I—Mandatory field cardholderAccountNumber is missing or blank in the request * J—Mandatory field cardAcceptorId is missing or blank in the request * K—Mandatory field merchantName is missing or blank in the request * F—Stop advice is already placed for requested account number and merchant] ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectCode")
  public String getRejectCode() {
    return rejectCode;
  }

  public void setRejectCode(String rejectCode) {
    this.rejectCode = rejectCode;
  }

  public RejectedStopAdviceResponse merchantName(String merchantName) {
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

  public RejectedStopAdviceResponse rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * [This field contains the description of reject message: * H—Account number does not start with 2, 3, 4, 5 or 6 * G—Account number contains non-numeric characters or is blank * L—Account number is not of proper length (must be 13, 15, 16 or 19) * M—Account number is not mod 10 compliant * N—No stop advice applied, unable to find merchant information for the requested card acceptor id * R—Account number is not associated with requested segment id * S—Start date must not be less than the current date * D—Duplicate stop advice in the request * I—Mandatory field cardholderAccountNumber is missing or blank in the request * J—Mandatory field cardAcceptorId is missing or blank in the request * K—Mandatory field merchantName is missing or blank in the request * F—Stop advice is already placed for requested account number and merchant] 
   * @return rejectMessage
   */
  
  @Schema(name = "rejectMessage", example = "Account Number contains non-numeric characters or is blank", description = "[This field contains the description of reject message: * H—Account number does not start with 2, 3, 4, 5 or 6 * G—Account number contains non-numeric characters or is blank * L—Account number is not of proper length (must be 13, 15, 16 or 19) * M—Account number is not mod 10 compliant * N—No stop advice applied, unable to find merchant information for the requested card acceptor id * R—Account number is not associated with requested segment id * S—Start date must not be less than the current date * D—Duplicate stop advice in the request * I—Mandatory field cardholderAccountNumber is missing or blank in the request * J—Mandatory field cardAcceptorId is missing or blank in the request * K—Mandatory field merchantName is missing or blank in the request * F—Stop advice is already placed for requested account number and merchant] ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectMessage")
  public String getRejectMessage() {
    return rejectMessage;
  }

  public void setRejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
  }

  public RejectedStopAdviceResponse cardAcceptorId(String cardAcceptorId) {
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

  public RejectedStopAdviceResponse cardholderAccountNumber(String cardholderAccountNumber) {
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
    RejectedStopAdviceResponse rejectedStopAdviceResponse = (RejectedStopAdviceResponse) o;
    return Objects.equals(this.startDate, rejectedStopAdviceResponse.startDate) &&
        Objects.equals(this.rejectCode, rejectedStopAdviceResponse.rejectCode) &&
        Objects.equals(this.merchantName, rejectedStopAdviceResponse.merchantName) &&
        Objects.equals(this.rejectMessage, rejectedStopAdviceResponse.rejectMessage) &&
        Objects.equals(this.cardAcceptorId, rejectedStopAdviceResponse.cardAcceptorId) &&
        Objects.equals(this.cardholderAccountNumber, rejectedStopAdviceResponse.cardholderAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, rejectCode, merchantName, rejectMessage, cardAcceptorId, cardholderAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedStopAdviceResponse {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    rejectCode: ").append(toIndentedString(rejectCode)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    rejectMessage: ").append(toIndentedString(rejectMessage)).append("\n");
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

