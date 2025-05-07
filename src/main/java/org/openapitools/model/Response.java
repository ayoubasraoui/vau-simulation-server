package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.openapitools.model.RejectedInquiryResponse;
import org.openapitools.model.SuccessfulInquiryResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

/**
 * [Acquirer-api response body]
 */

@Schema(name = "Response", description = "[Acquirer-api response body]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class Response {

  @Valid
  private List<@Valid RejectedInquiryResponse> rejects = new ArrayList<>();

  @Valid
  private List<@Valid SuccessfulInquiryResponse> responses = new ArrayList<>();

  private String merchantId;

  private @Nullable String subMerchantName;

  private Integer acquirerSegmentId;

  private @Nullable String acquirerOrMerchantProprietaryInfo;

  public Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Response(List<@Valid RejectedInquiryResponse> rejects, List<@Valid SuccessfulInquiryResponse> responses, String merchantId, Integer acquirerSegmentId) {
    this.rejects = rejects;
    this.responses = responses;
    this.merchantId = merchantId;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public Response rejects(List<@Valid RejectedInquiryResponse> rejects) {
    this.rejects = rejects;
    return this;
  }

  public Response addRejectsItem(RejectedInquiryResponse rejectsItem) {
    if (this.rejects == null) {
      this.rejects = new ArrayList<>();
    }
    this.rejects.add(rejectsItem);
    return this;
  }

  /**
   * [List of Rejected Inquiry Response]
   * @return rejects
   */
  @NotNull @Valid 
  @Schema(name = "rejects", description = "[List of Rejected Inquiry Response]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejects")
  public List<@Valid RejectedInquiryResponse> getRejects() {
    return rejects;
  }

  public void setRejects(List<@Valid RejectedInquiryResponse> rejects) {
    this.rejects = rejects;
  }

  public Response responses(List<@Valid SuccessfulInquiryResponse> responses) {
    this.responses = responses;
    return this;
  }

  public Response addResponsesItem(SuccessfulInquiryResponse responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

  /**
   * [List of Successful Inquiry Responses]
   * @return responses
   */
  @NotNull @Valid 
  @Schema(name = "responses", description = "[List of Successful Inquiry Responses]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responses")
  public List<@Valid SuccessfulInquiryResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<@Valid SuccessfulInquiryResponse> responses) {
    this.responses = responses;
  }

  public Response merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [This field contains the VAU Merchant ID that was submitted in the associated Acquirer Inquiry Request.]
   * @return merchantId
   */
  @NotNull
  @Schema(name = "merchantId", example = "000000705853", description = "[This field contains the VAU Merchant ID that was submitted in the associated Acquirer Inquiry Request.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public Response subMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
    return this;
  }

  /**
   * [This field contains the sub merchant name that was submitted in the associated Acquirer Inquiry Request.]
   * @return subMerchantName
   */
  
  @Schema(name = "subMerchantName", example = "SUB-MERCHANT-NAME", description = "[This field contains the sub merchant name that was submitted in the associated Acquirer Inquiry Request.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subMerchantName")
  public String getSubMerchantName() {
    return subMerchantName;
  }

  public void setSubMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
  }

  public Response acquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
    return this;
  }

  /**
   * [This field contains the VAU Acquirer Segment ID of the associated Acquirer Inquiry Request.]
   * @return acquirerSegmentId
   */
  @NotNull 
  @Schema(name = "acquirerSegmentId", example = "2", description = "[This field contains the VAU Acquirer Segment ID of the associated Acquirer Inquiry Request.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("acquirerSegmentId")
  public Integer getAcquirerSegmentId() {
    return acquirerSegmentId;
  }

  public void setAcquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public Response acquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
    return this;
  }

  /**
   * [This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Acquirer Inquiry Request.]
   * @return acquirerOrMerchantProprietaryInfo
   */
  
  @Schema(name = "acquirerOrMerchantProprietaryInfo", example = "180720216995565000113            XXXXAIBR", description = "[This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Acquirer Inquiry Request.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Response response = (Response) o;
    return Objects.equals(this.rejects, response.rejects) &&
        Objects.equals(this.responses, response.responses) &&
        Objects.equals(this.merchantId, response.merchantId) &&
        Objects.equals(this.subMerchantName, response.subMerchantName) &&
        Objects.equals(this.acquirerSegmentId, response.acquirerSegmentId) &&
        Objects.equals(this.acquirerOrMerchantProprietaryInfo, response.acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejects, responses, merchantId, subMerchantName, acquirerSegmentId, acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    rejects: ").append(toIndentedString(rejects)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    subMerchantName: ").append(toIndentedString(subMerchantName)).append("\n");
    sb.append("    acquirerSegmentId: ").append(toIndentedString(acquirerSegmentId)).append("\n");
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

