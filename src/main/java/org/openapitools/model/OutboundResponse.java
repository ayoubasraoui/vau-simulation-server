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
import jakarta.validation.constraints.Size;
import org.openapitools.model.AccountUpdatesResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Outbound Response]
 */

@Schema(name = "OutboundResponse", description = "[Outbound Response]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class OutboundResponse {

  private String requestId;

  private String merchantId;

  @Valid
  private List<@Valid AccountUpdatesResponse> accountUpdates = new ArrayList<>();

  private @Nullable String subMerchantName;

  private Integer acquirerSegmentId;

  public OutboundResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OutboundResponse(String requestId, String merchantId, List<@Valid AccountUpdatesResponse> accountUpdates, Integer acquirerSegmentId) {
    this.requestId = requestId;
    this.merchantId = merchantId;
    this.accountUpdates = accountUpdates;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public OutboundResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * [UUID is generated  to track the request and their response.]
   * @return requestId
   */
  @NotNull
  @Schema(name = "requestId", example = "e719f768-85eb-4e50-8259-87f5d2fc2fbe", description = "[UUID is generated  to track the request and their response.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public OutboundResponse merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [This field contains the VAU Merchant ID.]
   * @return merchantId
   */
  @NotNull 
  @Schema(name = "merchantId", example = "000000705853", description = "[This field contains the VAU Merchant ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public OutboundResponse accountUpdates(List<@Valid AccountUpdatesResponse> accountUpdates) {
    this.accountUpdates = accountUpdates;
    return this;
  }

  public OutboundResponse addAccountUpdatesItem(AccountUpdatesResponse accountUpdatesItem) {
    if (this.accountUpdates == null) {
      this.accountUpdates = new ArrayList<>();
    }
    this.accountUpdates.add(accountUpdatesItem);
    return this;
  }

  /**
   * [List of Account Updates]
   * @return accountUpdates
   */
  @NotNull @Valid 
  @Schema(name = "accountUpdates", description = "[List of Account Updates]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accountUpdates")
  public List<@Valid AccountUpdatesResponse> getAccountUpdates() {
    return accountUpdates;
  }

  public void setAccountUpdates(List<@Valid AccountUpdatesResponse> accountUpdates) {
    this.accountUpdates = accountUpdates;
  }

  public OutboundResponse subMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
    return this;
  }

  /**
   * [This field contains the sub merchant name.]
   * @return subMerchantName
   */
  @Size(min = 0, max = 20)
  @Schema(name = "subMerchantName", example = "SUB-MERCHANT-NAME", description = "[This field contains the sub merchant name.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subMerchantName")
  public String getSubMerchantName() {
    return subMerchantName;
  }

  public void setSubMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
  }

  public OutboundResponse acquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
    return this;
  }

  /**
   * [This field contains the VAU Acquirer Segment ID.]
   * @return acquirerSegmentId
   */
  @NotNull 
  @Schema(name = "acquirerSegmentId", example = "2", description = "[This field contains the VAU Acquirer Segment ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
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
    OutboundResponse outboundResponse = (OutboundResponse) o;
    return Objects.equals(this.requestId, outboundResponse.requestId) &&
        Objects.equals(this.merchantId, outboundResponse.merchantId) &&
        Objects.equals(this.accountUpdates, outboundResponse.accountUpdates) &&
        Objects.equals(this.subMerchantName, outboundResponse.subMerchantName) &&
        Objects.equals(this.acquirerSegmentId, outboundResponse.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, merchantId, accountUpdates, subMerchantName, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    accountUpdates: ").append(toIndentedString(accountUpdates)).append("\n");
    sb.append("    subMerchantName: ").append(toIndentedString(subMerchantName)).append("\n");
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

