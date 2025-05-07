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
 * [Rejected Inquiry Response body]
 */

@Schema(name = "RejectedInquiryResponse", description = "[Rejected Inquiry Response body]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class RejectedInquiryResponse {

  private @Nullable String rejectReason;

  private @Nullable String expirationDate;

  private @Nullable String rejectReasonCode;

  private String cardholderAccountNumber;

  public RejectedInquiryResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RejectedInquiryResponse(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public RejectedInquiryResponse rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  /**
   * [This field contains the description of the reject code: * 1—Account Number does not start with 2, 3, 4, 5 or 6 * 3—Account Number contains non-numeric characters or is blank * 4—Account Number is not of proper length (must be 13, 15, 16 or 19) * 5—Expiration Date is invalid (must be YYMM)] 
   * @return rejectReason
   */
  
  @Schema(name = "rejectReason", example = "Account Number does not start with 2, 3, 4, 5 or 6", description = "[This field contains the description of the reject code: * 1—Account Number does not start with 2, 3, 4, 5 or 6 * 3—Account Number contains non-numeric characters or is blank * 4—Account Number is not of proper length (must be 13, 15, 16 or 19) * 5—Expiration Date is invalid (must be YYMM)] ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectReason")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public RejectedInquiryResponse expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * [This field contains the old expiration date in YYMM format, where YY = 00-99 and MM = 01–12]
   * @return expirationDate
   */
  
  @Schema(name = "expirationDate", example = "2204", description = "[This field contains the old expiration date in YYMM format, where YY = 00-99 and MM = 01–12]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public RejectedInquiryResponse rejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
    return this;
  }

  /**
   * [This field contains one of the following codes: * 1—Account Number does not start with 2, 3, 4, 5 or 6 * 3—Account Number contains non-numeric characters or is blank * 4—Account Number is not of proper length (must be 13, 15, 16 or 19) * 5—Expiration Date is invalid (must be YYMM)] 
   * @return rejectReasonCode
   */
  
  @Schema(name = "rejectReasonCode", example = "1", description = "[This field contains one of the following codes: * 1—Account Number does not start with 2, 3, 4, 5 or 6 * 3—Account Number contains non-numeric characters or is blank * 4—Account Number is not of proper length (must be 13, 15, 16 or 19) * 5—Expiration Date is invalid (must be YYMM)] ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectReasonCode")
  public String getRejectReasonCode() {
    return rejectReasonCode;
  }

  public void setRejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
  }

  public RejectedInquiryResponse cardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
    return this;
  }

  /**
   * [This field contains the account number that was submitted in the associated Acquirer Inquiry Request.]
   * @return cardholderAccountNumber
   */
  @NotNull
  @Schema(name = "cardholderAccountNumber", example = "800000XX00000000", description = "[This field contains the account number that was submitted in the associated Acquirer Inquiry Request.]", requiredMode = Schema.RequiredMode.REQUIRED)
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
    RejectedInquiryResponse rejectedInquiryResponse = (RejectedInquiryResponse) o;
    return Objects.equals(this.rejectReason, rejectedInquiryResponse.rejectReason) &&
        Objects.equals(this.expirationDate, rejectedInquiryResponse.expirationDate) &&
        Objects.equals(this.rejectReasonCode, rejectedInquiryResponse.rejectReasonCode) &&
        Objects.equals(this.cardholderAccountNumber, rejectedInquiryResponse.cardholderAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReason, expirationDate, rejectReasonCode, cardholderAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedInquiryResponse {\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    rejectReasonCode: ").append(toIndentedString(rejectReasonCode)).append("\n");
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

