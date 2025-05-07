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
 * [Reject Request]
 */

@Schema(name = "RejectedMerchantEnrollmentResponse", description = "[Reject Request]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class RejectedMerchantEnrollmentResponse {

  private String rejectReason;

  private String rejectReasonCode;

  private Integer acquirerSegmentId;

  public RejectedMerchantEnrollmentResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RejectedMerchantEnrollmentResponse(String rejectReason, String rejectReasonCode, Integer acquirerSegmentId) {
    this.rejectReason = rejectReason;
    this.rejectReasonCode = rejectReasonCode;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public RejectedMerchantEnrollmentResponse rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  /**
   * [This field contains the description of the reject code: * A—Acquirer segment is not enrolled * V—No data found in merchant field * X-Acquirer status is in test mode, please contact client services representative * T—Max merchants threshold passed for single request, current threshold is:100.] 
   * @return rejectReason
   */
  @NotNull
  @Schema(name = "rejectReason", example = "Acquirer segment is not enrolled", description = "[This field contains the description of the reject code: * A—Acquirer segment is not enrolled * V—No data found in merchant field * X-Acquirer status is in test mode, please contact client services representative * T—Max merchants threshold passed for single request, current threshold is:100.] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectReason")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public RejectedMerchantEnrollmentResponse rejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
    return this;
  }

  /**
   * [This field contains one of the following codes: * A—Acquirer segment is not enrolled * V—No data found in merchant field * X-Acquirer status is in test mode, please contact client services representative * T—Max merchants threshold passed for single request, current threshold is:100.] 
   * @return rejectReasonCode
   */
  @NotNull 
  @Schema(name = "rejectReasonCode", example = "A", description = "[This field contains one of the following codes: * A—Acquirer segment is not enrolled * V—No data found in merchant field * X-Acquirer status is in test mode, please contact client services representative * T—Max merchants threshold passed for single request, current threshold is:100.] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectReasonCode")
  public String getRejectReasonCode() {
    return rejectReasonCode;
  }

  public void setRejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
  }

  public RejectedMerchantEnrollmentResponse acquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
    return this;
  }

  /**
   * [This field  must contain a valid VAU Acquirer Segment ID.]
   * @return acquirerSegmentId
   */
  @NotNull 
  @Schema(name = "acquirerSegmentId", example = "9992", description = "[This field  must contain a valid VAU Acquirer Segment ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("acquirerSegmentId")
  public Integer getAcquirerSegmentId() {
    return acquirerSegmentId;
  }

  public void setAcquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectedMerchantEnrollmentResponse rejectedMerchantEnrollmentResponse = (RejectedMerchantEnrollmentResponse) o;
    return Objects.equals(this.rejectReason, rejectedMerchantEnrollmentResponse.rejectReason) &&
        Objects.equals(this.rejectReasonCode, rejectedMerchantEnrollmentResponse.rejectReasonCode) &&
        Objects.equals(this.acquirerSegmentId, rejectedMerchantEnrollmentResponse.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReason, rejectReasonCode, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedMerchantEnrollmentResponse {\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    rejectReasonCode: ").append(toIndentedString(rejectReasonCode)).append("\n");
    sb.append("    acquirerSegmentId: ").append(toIndentedString(acquirerSegmentId)).append("\n");
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

