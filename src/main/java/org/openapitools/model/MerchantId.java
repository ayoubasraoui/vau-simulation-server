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
 * [List of merchants to search]
 */

@Schema(name = "MerchantId", description = "[List of merchants to search]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class MerchantId {

  private String merchantId;

  public MerchantId() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public MerchantId merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID of 12 characters.]
   * @return merchantId
   */
  @NotNull
  @Schema(name = "merchantId", example = "000000705853", description = "[Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID of 12 characters.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantId merchantId = (MerchantId) o;
    return Objects.equals(this.merchantId, merchantId.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantId {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

