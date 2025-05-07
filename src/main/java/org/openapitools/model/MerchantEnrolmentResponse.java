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
import lombok.Data;
import org.openapitools.model.MerchantResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Merchant Enrolment Response]
 */

@Data
@Schema(name = "MerchantEnrolmentResponse", description = "[Merchant Enrolment Response]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class MerchantEnrolmentResponse {

  @Valid
  private List<@Valid MerchantResponse> merchants = new ArrayList<>();

  private Integer acquirerSegmentId;

  public MerchantEnrolmentResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MerchantEnrolmentResponse(List<@Valid MerchantResponse> merchants, Integer acquirerSegmentId) {
    this.merchants = merchants;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public MerchantEnrolmentResponse merchants(List<@Valid MerchantResponse> merchants) {
    this.merchants = merchants;
    return this;
  }

  public MerchantEnrolmentResponse addMerchantsItem(MerchantResponse merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new ArrayList<>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

  /**
   * [List of merchant enrolment]
   * @return merchants
   */
  @NotNull @Valid 
  @Schema(name = "merchants", description = "[List of merchant enrolment]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchants")
  public List<@Valid MerchantResponse> getMerchants() {
    return merchants;
  }

  public void setMerchants(List<@Valid MerchantResponse> merchants) {
    this.merchants = merchants;
  }

  public MerchantEnrolmentResponse acquirerSegmentId(Integer acquirerSegmentId) {
    this.acquirerSegmentId = acquirerSegmentId;
    return this;
  }

  /**
   * [This field  must contain a valid VAU Acquirer Segment ID.]
   * @return acquirerSegmentId
   */
  @NotNull
  @Schema(name = "acquirerSegmentId", example = "2", description = "[This field  must contain a valid VAU Acquirer Segment ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
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
    MerchantEnrolmentResponse merchantEnrolmentResponse = (MerchantEnrolmentResponse) o;
    return Objects.equals(this.merchants, merchantEnrolmentResponse.merchants) &&
        Objects.equals(this.acquirerSegmentId, merchantEnrolmentResponse.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchants, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantEnrolmentResponse {\n");
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

