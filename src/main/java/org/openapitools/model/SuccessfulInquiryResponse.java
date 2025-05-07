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
 * [Successful Inquiry Response body]
 */

@Schema(name = "SuccessfulInquiryResponse", description = "[Successful Inquiry Response body]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class SuccessfulInquiryResponse {

  private @Nullable String newExpirationDate;

  private @Nullable String oldExpirationDate;

  private @Nullable String serviceIdentifier;

  private @Nullable String previouslySentFlag;

  private String newCardholderAccountNumber;

  private String oldCardholderAccountNumber;

  public SuccessfulInquiryResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuccessfulInquiryResponse(String newCardholderAccountNumber, String oldCardholderAccountNumber) {
    this.newCardholderAccountNumber = newCardholderAccountNumber;
    this.oldCardholderAccountNumber = oldCardholderAccountNumber;
  }

  public SuccessfulInquiryResponse newExpirationDate(String newExpirationDate) {
    this.newExpirationDate = newExpirationDate;
    return this;
  }

  /**
   * [This field contains one of the following: * The expiration date when new information is available, in YYMM format, where: YY = 00–99 MM = 01–12 Spaces for messages that indicate one of the following conditions:     * Closed Account {C}      * Contact Cardholder {Q}      * Participating BIN, No Match {P}      * Non-participating BIN, No Match {N} ]
   * @return newExpirationDate
   */
  
  @Schema(name = "newExpirationDate", example = "2204", description = "[This field contains one of the following: * The expiration date when new information is available, in YYMM format, where: YY = 00–99 MM = 01–12 Spaces for messages that indicate one of the following conditions:     * Closed Account {C}      * Contact Cardholder {Q}      * Participating BIN, No Match {P}      * Non-participating BIN, No Match {N} ]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newExpirationDate")
  public String getNewExpirationDate() {
    return newExpirationDate;
  }

  public void setNewExpirationDate(String newExpirationDate) {
    this.newExpirationDate = newExpirationDate;
  }

  public SuccessfulInquiryResponse oldExpirationDate(String oldExpirationDate) {
    this.oldExpirationDate = oldExpirationDate;
    return this;
  }

  /**
   * [This field contains the old expiration date in YYMM format, where YY = 00-99 and MM = 01–12]
   * @return oldExpirationDate
   */
  
  @Schema(name = "oldExpirationDate", example = "2204", description = "[This field contains the old expiration date in YYMM format, where YY = 00-99 and MM = 01–12]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oldExpirationDate")
  public String getOldExpirationDate() {
    return oldExpirationDate;
  }

  public void setOldExpirationDate(String oldExpirationDate) {
    this.oldExpirationDate = oldExpirationDate;
  }

  public SuccessfulInquiryResponse serviceIdentifier(String serviceIdentifier) {
    this.serviceIdentifier = serviceIdentifier;
    return this;
  }

  /**
   * [This field contains one of the following: * A—Account number change message * C—Closed account advice * E—Expiration date change * N—Non-participating BIN * Q—Contact cardholder advice * O—Cardholder Opt-Out     Note:        – When a 'Stop Advice' is placed on a card and the acquirer/merchant is ready to accept          the code, they would receive the 'O'.        – If the acquirer is not ready to accept 'O', then, VAU responds with 'P'.        – To confirm the ability to receive 'O', please send email to VAU Client Support Team at          updater@visa.com (for North America customers), or customersupport@visa.com (for          Europe customers). * P—Participating BIN, no match         Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS. * V—Match made, account number and expiration date unchanged.]
   * @return serviceIdentifier
   */
  
  @Schema(name = "serviceIdentifier", example = "A", description = "[This field contains one of the following: * A—Account number change message * C—Closed account advice * E—Expiration date change * N—Non-participating BIN * Q—Contact cardholder advice * O—Cardholder Opt-Out     Note:        – When a 'Stop Advice' is placed on a card and the acquirer/merchant is ready to accept          the code, they would receive the 'O'.        – If the acquirer is not ready to accept 'O', then, VAU responds with 'P'.        – To confirm the ability to receive 'O', please send email to VAU Client Support Team at          updater@visa.com (for North America customers), or customersupport@visa.com (for          Europe customers). * P—Participating BIN, no match         Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS. * V—Match made, account number and expiration date unchanged.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceIdentifier")
  public String getServiceIdentifier() {
    return serviceIdentifier;
  }

  public void setServiceIdentifier(String serviceIdentifier) {
    this.serviceIdentifier = serviceIdentifier;
  }

  public SuccessfulInquiryResponse previouslySentFlag(String previouslySentFlag) {
    this.previouslySentFlag = previouslySentFlag;
    return this;
  }

  /**
   * [This field contains one of the following:  Y—Yes or N—No Note: A Y value indicates that exactly the same account information was requested by the acquirer and sent by VAU during the previous 40 days (the retention period), excluding the current day.]
   * @return previouslySentFlag
   */
  
  @Schema(name = "previouslySentFlag", example = "Y", description = "[This field contains one of the following:  Y—Yes or N—No Note: A Y value indicates that exactly the same account information was requested by the acquirer and sent by VAU during the previous 40 days (the retention period), excluding the current day.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previouslySentFlag")
  public String getPreviouslySentFlag() {
    return previouslySentFlag;
  }

  public void setPreviouslySentFlag(String previouslySentFlag) {
    this.previouslySentFlag = previouslySentFlag;
  }

  public SuccessfulInquiryResponse newCardholderAccountNumber(String newCardholderAccountNumber) {
    this.newCardholderAccountNumber = newCardholderAccountNumber;
    return this;
  }

  /**
   * [This field contains one of the following: * The account number when new information is available. * The account number if a validation response is provided. Spaces for records with the following service identifiers:     * Closed Account {C}     * Contact Cardholder {Q}     * Participating BIN, No Match {P}               Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS.     * Non-participating BIN, No Match {N} ]
   * @return newCardholderAccountNumber
   */
  @NotNull
  @Schema(name = "newCardholderAccountNumber", example = "400000XX00000001", description = "[This field contains one of the following: * The account number when new information is available. * The account number if a validation response is provided. Spaces for records with the following service identifiers:     * Closed Account {C}     * Contact Cardholder {Q}     * Participating BIN, No Match {P}               Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS.     * Non-participating BIN, No Match {N} ]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newCardholderAccountNumber")
  public String getNewCardholderAccountNumber() {
    return newCardholderAccountNumber;
  }

  public void setNewCardholderAccountNumber(String newCardholderAccountNumber) {
    this.newCardholderAccountNumber = newCardholderAccountNumber;
  }

  public SuccessfulInquiryResponse oldCardholderAccountNumber(String oldCardholderAccountNumber) {
    this.oldCardholderAccountNumber = oldCardholderAccountNumber;
    return this;
  }

  /**
   * [This field contains the account number that was submitted in the associated Acquirer Inquiry Request.]
   * @return oldCardholderAccountNumber
   */
  @NotNull 
  @Schema(name = "oldCardholderAccountNumber", example = "400000XX00000000", description = "[This field contains the account number that was submitted in the associated Acquirer Inquiry Request.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("oldCardholderAccountNumber")
  public String getOldCardholderAccountNumber() {
    return oldCardholderAccountNumber;
  }

  public void setOldCardholderAccountNumber(String oldCardholderAccountNumber) {
    this.oldCardholderAccountNumber = oldCardholderAccountNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessfulInquiryResponse successfulInquiryResponse = (SuccessfulInquiryResponse) o;
    return Objects.equals(this.newExpirationDate, successfulInquiryResponse.newExpirationDate) &&
        Objects.equals(this.oldExpirationDate, successfulInquiryResponse.oldExpirationDate) &&
        Objects.equals(this.serviceIdentifier, successfulInquiryResponse.serviceIdentifier) &&
        Objects.equals(this.previouslySentFlag, successfulInquiryResponse.previouslySentFlag) &&
        Objects.equals(this.newCardholderAccountNumber, successfulInquiryResponse.newCardholderAccountNumber) &&
        Objects.equals(this.oldCardholderAccountNumber, successfulInquiryResponse.oldCardholderAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newExpirationDate, oldExpirationDate, serviceIdentifier, previouslySentFlag, newCardholderAccountNumber, oldCardholderAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessfulInquiryResponse {\n");
    sb.append("    newExpirationDate: ").append(toIndentedString(newExpirationDate)).append("\n");
    sb.append("    oldExpirationDate: ").append(toIndentedString(oldExpirationDate)).append("\n");
    sb.append("    serviceIdentifier: ").append(toIndentedString(serviceIdentifier)).append("\n");
    sb.append("    previouslySentFlag: ").append(toIndentedString(previouslySentFlag)).append("\n");
    sb.append("    newCardholderAccountNumber: ").append(toIndentedString(newCardholderAccountNumber)).append("\n");
    sb.append("    oldCardholderAccountNumber: ").append(toIndentedString(oldCardholderAccountNumber)).append("\n");
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

