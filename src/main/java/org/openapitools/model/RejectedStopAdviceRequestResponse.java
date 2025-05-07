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

@Schema(name = "RejectedStopAdviceRequestResponse", description = "[Reject Request]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class RejectedStopAdviceRequestResponse {

  private @Nullable String rejectReason;

  private Integer issuerSegmentId;

  private @Nullable String rejectReasonCode;

  public RejectedStopAdviceRequestResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RejectedStopAdviceRequestResponse(Integer issuerSegmentId) {
    this.issuerSegmentId = issuerSegmentId;
  }

  public RejectedStopAdviceRequestResponse rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  /**
   * [This field contains the description of the reject code: * A—Issuer segment is not enrolled * T—Max stop advices threshold passed for single request, current threshold is:100 * V—No data found in stop advice field 
   * @return rejectReason
   */
  
  @Schema(name = "rejectReason", example = "Issuer segment is not enrolled", description = "[This field contains the description of the reject code: * A—Issuer segment is not enrolled * T—Max stop advices threshold passed for single request, current threshold is:100 * V—No data found in stop advice field ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectReason")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public RejectedStopAdviceRequestResponse issuerSegmentId(Integer issuerSegmentId) {
    this.issuerSegmentId = issuerSegmentId;
    return this;
  }

  /**
   * [This field must contain a valid VAU Issuer Segment ID.]
   * @return issuerSegmentId
   */
  @NotNull
  @Schema(name = "issuerSegmentId", example = "2", description = "[This field must contain a valid VAU Issuer Segment ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuerSegmentId")
  public Integer getIssuerSegmentId() {
    return issuerSegmentId;
  }

  public void setIssuerSegmentId(Integer issuerSegmentId) {
    this.issuerSegmentId = issuerSegmentId;
  }

  public RejectedStopAdviceRequestResponse rejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
    return this;
  }

  /**
   * [This field contains one of the following codes: * A—Issuer segment is not enrolled * T—Max stop advices threshold passed for single request, current threshold is:100 * V—No data found in stop advice field 
   * @return rejectReasonCode
   */
  
  @Schema(name = "rejectReasonCode", example = "A", description = "[This field contains one of the following codes: * A—Issuer segment is not enrolled * T—Max stop advices threshold passed for single request, current threshold is:100 * V—No data found in stop advice field ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    RejectedStopAdviceRequestResponse rejectedStopAdviceRequestResponse = (RejectedStopAdviceRequestResponse) o;
    return Objects.equals(this.rejectReason, rejectedStopAdviceRequestResponse.rejectReason) &&
        Objects.equals(this.issuerSegmentId, rejectedStopAdviceRequestResponse.issuerSegmentId) &&
        Objects.equals(this.rejectReasonCode, rejectedStopAdviceRequestResponse.rejectReasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReason, issuerSegmentId, rejectReasonCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedStopAdviceRequestResponse {\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    issuerSegmentId: ").append(toIndentedString(issuerSegmentId)).append("\n");
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

