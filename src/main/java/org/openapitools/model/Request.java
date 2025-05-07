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
import org.openapitools.model.Inquiry;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Acquirer-api request body]
 */

@Schema(name = "Request", description = "[Acquirer-api request body]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class Request {

  @Valid
  private List<@Valid Inquiry> inquiries = new ArrayList<>();

  private String merchantId;

  private @Nullable String subMerchantName;

  private Integer acquirerSegmentId;

  private @Nullable String acquirerOrMerchantProprietaryInfo;

  public Request() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Request(List<@Valid Inquiry> inquiries, String merchantId, Integer acquirerSegmentId) {
    this.inquiries = inquiries;
    this.merchantId = merchantId;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public Request inquiries(List<@Valid Inquiry> inquiries) {
    this.inquiries = inquiries;
    return this;
  }

  public Request addInquiriesItem(Inquiry inquiriesItem) {
    if (this.inquiries == null) {
      this.inquiries = new ArrayList<>();
    }
    this.inquiries.add(inquiriesItem);
    return this;
  }

  /**
   * [List of Inquiries]
   * @return inquiries
   */
  @NotNull @Valid 
  @Schema(name = "inquiries", description = "[List of Inquiries]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("inquiries")
  public List<@Valid Inquiry> getInquiries() {
    return inquiries;
  }

  public void setInquiries(List<@Valid Inquiry> inquiries) {
    this.inquiries = inquiries;
  }

  public Request merchantId(String merchantId) {
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

  public Request subMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
    return this;
  }

  /**
   * [If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub-merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.]
   * @return subMerchantName
   */
  
  @Schema(name = "subMerchantName", example = "SUB-MERCHANT-NAME", description = "[If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub-merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subMerchantName")
  public String getSubMerchantName() {
    return subMerchantName;
  }

  public void setSubMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
  }

  public Request acquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
    return this;
  }

  /**
   * [This field must contain a valid VAU Acquirer Segment ID.]
   * @return acquirerSegmentId
   */
  @NotNull 
  @Schema(name = "acquirerSegmentId", example = "2", description = "[This field must contain a valid VAU Acquirer Segment ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("acquirerSegmentId")
  public Integer getAcquirerSegmentId() {
    return acquirerSegmentId;
  }

  public void setAcquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public Request acquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
    return this;
  }

  /**
   * [If provided, it contains acquirer or merchant proprietary information such as a customer ID that is carried in the merchant’s back-end system.]
   * @return acquirerOrMerchantProprietaryInfo
   */
  
  @Schema(name = "acquirerOrMerchantProprietaryInfo", example = "180720216995565000113            XXXXAIBR", description = "[If provided, it contains acquirer or merchant proprietary information such as a customer ID that is carried in the merchant’s back-end system.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Request request = (Request) o;
    return Objects.equals(this.inquiries, request.inquiries) &&
        Objects.equals(this.merchantId, request.merchantId) &&
        Objects.equals(this.subMerchantName, request.subMerchantName) &&
        Objects.equals(this.acquirerSegmentId, request.acquirerSegmentId) &&
        Objects.equals(this.acquirerOrMerchantProprietaryInfo, request.acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inquiries, merchantId, subMerchantName, acquirerSegmentId, acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Request {\n");
    sb.append("    inquiries: ").append(toIndentedString(inquiries)).append("\n");
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

