package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.openapitools.model.RejectMerchant;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Merchant Response]
 */

@Schema(name = "MerchantResponse", description = "[Merchant Response]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class MerchantResponse {

  private @Nullable RejectMerchant reject;

  private @Nullable String merchantId;

  private String enrollStatus;

  private @Nullable String merchantName;

  public MerchantResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MerchantResponse(String enrollStatus) {
    this.enrollStatus = enrollStatus;
  }

  public MerchantResponse reject(RejectMerchant reject) {
    this.reject = reject;
    return this;
  }

  /**
   * Get reject
   * @return reject
   */
  @Valid
  @Schema(name = "reject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reject")
  public RejectMerchant getReject() {
    return reject;
  }

  public void setReject(RejectMerchant reject) {
    this.reject = reject;
  }

  public MerchantResponse merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]
   * @return merchantId
   */
  
  @Schema(name = "merchantId", example = "000000705853", description = "[Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public MerchantResponse enrollStatus(String enrollStatus) {
    this.enrollStatus = enrollStatus;
    return this;
  }

  /**
   * [Merchant enrollment status, This field contains one of the following status: * Success — Merchant is enrolled successfully * In-Progress — Merchant enrollment is in progress * Reject — Merchant is rejected, reject code and reject message will be returned] 
   * @return enrollStatus
   */
  @NotNull
  @Schema(name = "enrollStatus", example = "Reject", description = "[Merchant enrollment status, This field contains one of the following status: * Success — Merchant is enrolled successfully * In-Progress — Merchant enrollment is in progress * Reject — Merchant is rejected, reject code and reject message will be returned] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enrollStatus")
  public String getEnrollStatus() {
    return enrollStatus;
  }

  public void setEnrollStatus(String enrollStatus) {
    this.enrollStatus = enrollStatus;
  }

  public MerchantResponse merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * [Name of Merchant]
   * @return merchantName
   */
  
  @Schema(name = "merchantName", example = "GS PERFORMANCE", description = "[Name of Merchant]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantName")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantResponse merchantResponse = (MerchantResponse) o;
    return Objects.equals(this.reject, merchantResponse.reject) &&
        Objects.equals(this.merchantId, merchantResponse.merchantId) &&
        Objects.equals(this.enrollStatus, merchantResponse.enrollStatus) &&
        Objects.equals(this.merchantName, merchantResponse.merchantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reject, merchantId, enrollStatus, merchantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantResponse {\n");
    sb.append("    reject: ").append(toIndentedString(reject)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    enrollStatus: ").append(toIndentedString(enrollStatus)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
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

