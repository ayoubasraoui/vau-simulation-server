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

@Schema(name = "RejectedRequestResponse", description = "[Reject Request]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class RejectedRequestResponse {

  private String merchantId;

  private String rejectReason;

  private @Nullable String subMerchantName;

  private String rejectReasonCode;

  private Integer acquirerSegmentId;

  public RejectedRequestResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RejectedRequestResponse(String merchantId, String rejectReason, String rejectReasonCode, Integer acquirerSegmentId) {
    this.merchantId = merchantId;
    this.rejectReason = rejectReason;
    this.rejectReasonCode = rejectReasonCode;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public RejectedRequestResponse merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]
   * @return merchantId
   */
  @NotNull
  @Schema(name = "merchantId", example = "000000705853", description = "[Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public RejectedRequestResponse rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  /**
   * [This field contains the description of the reject code: * A—Acquirer segment is not enrolled * X-Acquirer status is in test mode, please contact client services representative * M—Merchant is not enrolled or inactive * V—No data found in subscription field * 9—Max subscription threshold passed for single request, current threshold is:100.] 
   * @return rejectReason
   */
  @NotNull 
  @Schema(name = "rejectReason", example = "Acquirer segment is not enrolled", description = "[This field contains the description of the reject code: * A—Acquirer segment is not enrolled * X-Acquirer status is in test mode, please contact client services representative * M—Merchant is not enrolled or inactive * V—No data found in subscription field * 9—Max subscription threshold passed for single request, current threshold is:100.] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectReason")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public RejectedRequestResponse subMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
    return this;
  }

  /**
   * [If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub- merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.]
   * @return subMerchantName
   */
  
  @Schema(name = "subMerchantName", example = "SUB-MERCHANT-NAME", description = "[If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub- merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subMerchantName")
  public String getSubMerchantName() {
    return subMerchantName;
  }

  public void setSubMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
  }

  public RejectedRequestResponse rejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
    return this;
  }

  /**
   * [This field contains one of the following codes: * A—Acquirer segment is not enrolled * X-Acquirer status is in test mode, please contact client services representative * M—Merchant is not enrolled or inactive * V—No data found in subscription field * 9—Max subscription threshold passed for single request, current threshold is:100\".] 
   * @return rejectReasonCode
   */
  @NotNull 
  @Schema(name = "rejectReasonCode", example = "A", description = "[This field contains one of the following codes: * A—Acquirer segment is not enrolled * X-Acquirer status is in test mode, please contact client services representative * M—Merchant is not enrolled or inactive * V—No data found in subscription field * 9—Max subscription threshold passed for single request, current threshold is:100\".] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectReasonCode")
  public String getRejectReasonCode() {
    return rejectReasonCode;
  }

  public void setRejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
  }

  public RejectedRequestResponse acquirerSegmentId(Integer acquirerSegmentId) {
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
    RejectedRequestResponse rejectedRequestResponse = (RejectedRequestResponse) o;
    return Objects.equals(this.merchantId, rejectedRequestResponse.merchantId) &&
        Objects.equals(this.rejectReason, rejectedRequestResponse.rejectReason) &&
        Objects.equals(this.subMerchantName, rejectedRequestResponse.subMerchantName) &&
        Objects.equals(this.rejectReasonCode, rejectedRequestResponse.rejectReasonCode) &&
        Objects.equals(this.acquirerSegmentId, rejectedRequestResponse.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, rejectReason, subMerchantName, rejectReasonCode, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectedRequestResponse {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    subMerchantName: ").append(toIndentedString(subMerchantName)).append("\n");
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

