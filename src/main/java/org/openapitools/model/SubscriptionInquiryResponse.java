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
import org.openapitools.model.SubscriptionEnquiryPanStatus;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Subscription Inquiry api response body]
 */

@Schema(name = "SubscriptionInquiryResponse", description = "[Subscription Inquiry api response body]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class SubscriptionInquiryResponse {

  private String merchantId;

  @Valid
  private List<@Valid SubscriptionEnquiryPanStatus> subscriptions = new ArrayList<>();

  private @Nullable String subMerchantName;

  private Integer acquirerSegmentId;

  public SubscriptionInquiryResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubscriptionInquiryResponse(String merchantId, List<@Valid SubscriptionEnquiryPanStatus> subscriptions, Integer acquirerSegmentId) {
    this.merchantId = merchantId;
    this.subscriptions = subscriptions;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public SubscriptionInquiryResponse merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [This field contains the VAU Merchant ID that was submitted in the associated Subscription Inquiry Request.]
   * @return merchantId
   */
  @NotNull
  @Schema(name = "merchantId", example = "000000705853", description = "[This field contains the VAU Merchant ID that was submitted in the associated Subscription Inquiry Request.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public SubscriptionInquiryResponse subscriptions(List<@Valid SubscriptionEnquiryPanStatus> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public SubscriptionInquiryResponse addSubscriptionsItem(SubscriptionEnquiryPanStatus subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * [List of Subscription Inquiry Responses]
   * @return subscriptions
   */
  @NotNull @Valid 
  @Schema(name = "subscriptions", description = "[List of Subscription Inquiry Responses]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subscriptions")
  public List<@Valid SubscriptionEnquiryPanStatus> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<@Valid SubscriptionEnquiryPanStatus> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public SubscriptionInquiryResponse subMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
    return this;
  }

  /**
   * [This field contains the sub merchant name that was submitted in the associated Subscription Inquiry Request.]
   * @return subMerchantName
   */
  
  @Schema(name = "subMerchantName", example = "SUB-MERCHANT-NAME", description = "[This field contains the sub merchant name that was submitted in the associated Subscription Inquiry Request.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subMerchantName")
  public String getSubMerchantName() {
    return subMerchantName;
  }

  public void setSubMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
  }

  public SubscriptionInquiryResponse acquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
    return this;
  }

  /**
   * [This field contains the VAU Acquirer Segment ID of the associated Subscription Inquiry Request.]
   * @return acquirerSegmentId
   */
  @NotNull 
  @Schema(name = "acquirerSegmentId", example = "2", description = "[This field contains the VAU Acquirer Segment ID of the associated Subscription Inquiry Request.]", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SubscriptionInquiryResponse subscriptionInquiryResponse = (SubscriptionInquiryResponse) o;
    return Objects.equals(this.merchantId, subscriptionInquiryResponse.merchantId) &&
        Objects.equals(this.subscriptions, subscriptionInquiryResponse.subscriptions) &&
        Objects.equals(this.subMerchantName, subscriptionInquiryResponse.subMerchantName) &&
        Objects.equals(this.acquirerSegmentId, subscriptionInquiryResponse.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, subscriptions, subMerchantName, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInquiryResponse {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

