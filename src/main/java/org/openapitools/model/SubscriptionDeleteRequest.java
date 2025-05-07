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
import lombok.Data;
import org.openapitools.model.DeleteSubscriptionAttributes;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Subscription Delete api request body]
 */

@Data
@Schema(name = "SubscriptionDeleteRequest", description = "[Subscription Delete api request body]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class SubscriptionDeleteRequest {

  private String merchantId;

  @Valid
  private List<@Valid DeleteSubscriptionAttributes> subscriptions = new ArrayList<>();

  private @Nullable String subMerchantName;

  private Integer acquirerSegmentId;

  public SubscriptionDeleteRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SubscriptionDeleteRequest(String merchantId, List<@Valid DeleteSubscriptionAttributes> subscriptions, Integer acquirerSegmentId) {
    this.merchantId = merchantId;
    this.subscriptions = subscriptions;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public SubscriptionDeleteRequest merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]
   * @return merchantId
   */
  @NotNull
  @Size(min = 12, max = 12)
  @Schema(name = "merchantId", example = "000000705854", description = "[Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public SubscriptionDeleteRequest subscriptions(List<@Valid DeleteSubscriptionAttributes> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public SubscriptionDeleteRequest addSubscriptionsItem(DeleteSubscriptionAttributes subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * [List of Inquiries]
   * @return subscriptions
   */
  @NotNull @Valid 
  @Schema(name = "subscriptions", description = "[List of Inquiries]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subscriptions")
  public List<@Valid DeleteSubscriptionAttributes> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<@Valid DeleteSubscriptionAttributes> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public SubscriptionDeleteRequest subMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
    return this;
  }

  /**
   * [If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub-merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.]
   * @return subMerchantName
   */
  @Size(min = 0, max = 20) 
  @Schema(name = "subMerchantName", example = "SUB-MERCHANT-NAME", description = "[If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub-merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subMerchantName")
  public String getSubMerchantName() {
    return subMerchantName;
  }

  public void setSubMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
  }

  public SubscriptionDeleteRequest acquirerSegmentId(Integer acquirerSegmentId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDeleteRequest subscriptionDeleteRequest = (SubscriptionDeleteRequest) o;
    return Objects.equals(this.merchantId, subscriptionDeleteRequest.merchantId) &&
        Objects.equals(this.subscriptions, subscriptionDeleteRequest.subscriptions) &&
        Objects.equals(this.subMerchantName, subscriptionDeleteRequest.subMerchantName) &&
        Objects.equals(this.acquirerSegmentId, subscriptionDeleteRequest.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, subscriptions, subMerchantName, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDeleteRequest {\n");
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

