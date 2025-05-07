package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Rejected Subscription Response]
 */
@Data
@Schema(name = "RejectedSubscriptionResponse", description = "[Rejected Subscription Response]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class RejectedSubscriptionResponse {

  private String rejectReason;

  private String rejectReasonCode;

  public RejectedSubscriptionResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RejectedSubscriptionResponse(String rejectReason, String rejectReasonCode) {
    this.rejectReason = rejectReason;
    this.rejectReasonCode = rejectReasonCode;
  }

  public RejectedSubscriptionResponse rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  /**
   * [This field contains the description of the reject code: * 1-Account Number does not start with 2, 3, 4, 5 or 6 * 3-Account Number contains non-numeric characters or is blank * 4-Account Number is not of proper length (must be 13, 15, 16 or 19 * 5-Expiration Date is invalid (must be YYMM) * M—Account number is not mod 10 compliant * D-Duplicate subscription in the request] 
   * @return rejectReason
   */
  @NotNull 
  @Schema(name = "rejectReason", example = "Account Number contains non-numeric characters or is blank", description = "[This field contains the description of the reject code: * 1-Account Number does not start with 2, 3, 4, 5 or 6 * 3-Account Number contains non-numeric characters or is blank * 4-Account Number is not of proper length (must be 13, 15, 16 or 19 * 5-Expiration Date is invalid (must be YYMM) * M—Account number is not mod 10 compliant * D-Duplicate subscription in the request] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectReason")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public RejectedSubscriptionResponse rejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
    return this;
  }

  /**
   * [This field contains one of the following codes: * 1-Account Number does not start with 2, 3, 4, 5 or 6 * 3-Account Number contains non-numeric characters or is blank * 4-Account Number is not of proper length (must be 13, 15, 16 or 19 * 5-Expiration Date is invalid (must be YYMM) * M—Account number is not mod 10 compliant * D-Duplicate subscription in the request] 
   * @return rejectReasonCode
   */
  @NotNull
  @Schema(name = "rejectReasonCode", example = "3", description = "[This field contains one of the following codes: * 1-Account Number does not start with 2, 3, 4, 5 or 6 * 3-Account Number contains non-numeric characters or is blank * 4-Account Number is not of proper length (must be 13, 15, 16 or 19 * 5-Expiration Date is invalid (must be YYMM) * M—Account number is not mod 10 compliant * D-Duplicate subscription in the request] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectReasonCode")
  public String getRejectReasonCode() {
    return rejectReasonCode;
  }

  public void setRejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectedSubscriptionResponse rejectedSubscriptionResponse = (RejectedSubscriptionResponse) o;
    return Objects.equals(this.rejectReason, rejectedSubscriptionResponse.rejectReason) &&
        Objects.equals(this.rejectReasonCode, rejectedSubscriptionResponse.rejectReasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReason, rejectReasonCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedSubscriptionResponse {\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    rejectReasonCode: ").append(toIndentedString(rejectReasonCode)).append("\n");
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

