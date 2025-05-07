package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.openapitools.model.MerchantId;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * merchantSearch
 */

@Schema(name = "merchantSearchRequest", description = "merchantSearch")
@JsonTypeName("merchantSearchRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class MerchantSearchRequest {

  @Valid
  private List<@Valid MerchantId> merchants = new ArrayList<>();

  private Integer acquirerSegmentId;

  public MerchantSearchRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MerchantSearchRequest(List<@Valid MerchantId> merchants, Integer acquirerSegmentId) {
    this.merchants = merchants;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public MerchantSearchRequest merchants(List<@Valid MerchantId> merchants) {
    this.merchants = merchants;
    return this;
  }

  public MerchantSearchRequest addMerchantsItem(MerchantId merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new ArrayList<>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

  /**
   * [List of merchants to search]
   * @return merchants
   */
  @NotNull @Valid @Size(min = 0, max = 2147483647)
  @Schema(name = "merchants", description = "[List of merchants to search]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchants")
  public List<@Valid MerchantId> getMerchants() {
    return merchants;
  }

  public void setMerchants(List<@Valid MerchantId> merchants) {
    this.merchants = merchants;
  }

  public MerchantSearchRequest acquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
    return this;
  }

  /**
   * [This field must contain a valid VAU acquirer segment id]
   * @return acquirerSegmentId
   */
  @NotNull
  @Schema(name = "acquirerSegmentId", example = "2", description = "[This field must contain a valid VAU acquirer segment id]", requiredMode = Schema.RequiredMode.REQUIRED)
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
    MerchantSearchRequest merchantSearchRequest = (MerchantSearchRequest) o;
    return Objects.equals(this.merchants, merchantSearchRequest.merchants) &&
        Objects.equals(this.acquirerSegmentId, merchantSearchRequest.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchants, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantSearchRequest {\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
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

