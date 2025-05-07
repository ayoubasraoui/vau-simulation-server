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
import org.openapitools.model.Merchant;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Merchant Search Response]
 */

@Schema(name = "MerchantSearchResponse", description = "[Merchant Search Response]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class MerchantSearchResponse {

  @Valid
  private List<@Valid Merchant> merchants = new ArrayList<>();

  private Integer acquirerSegmentId;

  public MerchantSearchResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MerchantSearchResponse(List<@Valid Merchant> merchants, Integer acquirerSegmentId) {
    this.merchants = merchants;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public MerchantSearchResponse merchants(List<@Valid Merchant> merchants) {
    this.merchants = merchants;
    return this;
  }

  public MerchantSearchResponse addMerchantsItem(Merchant merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new ArrayList<>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

  /**
   * [List of merchant search results]
   * @return merchants
   */
  @NotNull
  @Valid
  @Schema(name = "merchants", description = "[List of merchant search results]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchants")
  public List<@Valid Merchant> getMerchants() {
    return merchants;
  }

  public void setMerchants(List<@Valid Merchant> merchants) {
    this.merchants = merchants;
  }

  public MerchantSearchResponse acquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
    return this;
  }

  /**
   * [This field  must contain a valid VAU acquirer segment Id.]
   * @return acquirerSegmentId
   */
  @NotNull 
  @Schema(name = "acquirerSegmentId", example = "2", description = "[This field  must contain a valid VAU acquirer segment Id.]", requiredMode = Schema.RequiredMode.REQUIRED)
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
    MerchantSearchResponse merchantSearchResponse = (MerchantSearchResponse) o;
    return Objects.equals(this.merchants, merchantSearchResponse.merchants) &&
        Objects.equals(this.acquirerSegmentId, merchantSearchResponse.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchants, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantSearchResponse {\n");
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

