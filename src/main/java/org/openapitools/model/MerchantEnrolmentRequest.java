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
import lombok.Data;
import org.openapitools.model.MerchantRequest;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * merchantEnrolment
 */
@Data
@Schema(name = "merchantEnrolmentRequest", description = "merchantEnrolment")
@JsonTypeName("merchantEnrolmentRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class MerchantEnrolmentRequest {

  @Valid
  private List<@Valid MerchantRequest> merchants = new ArrayList<>();

  private Integer acquirerSegmentId;

  public MerchantEnrolmentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MerchantEnrolmentRequest(List<@Valid MerchantRequest> merchants, Integer acquirerSegmentId) {
    this.merchants = merchants;
    this.acquirerSegmentId = acquirerSegmentId;
  }

  public MerchantEnrolmentRequest merchants(List<@Valid MerchantRequest> merchants) {
    this.merchants = merchants;
    return this;
  }

  public MerchantEnrolmentRequest addMerchantsItem(MerchantRequest merchantsItem) {
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
  @NotNull
  @Valid
  @Schema(name = "merchants", description = "[List of merchant enrolment]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchants")
  public List<@Valid MerchantRequest> getMerchants() {
    return merchants;
  }

  public void setMerchants(List<@Valid MerchantRequest> merchants) {
    this.merchants = merchants;
  }

  public MerchantEnrolmentRequest acquirerSegmentId(Integer acquirerSegmentId) {
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
    MerchantEnrolmentRequest merchantEnrolmentRequest = (MerchantEnrolmentRequest) o;
    return Objects.equals(this.merchants, merchantEnrolmentRequest.merchants) &&
        Objects.equals(this.acquirerSegmentId, merchantEnrolmentRequest.acquirerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchants, acquirerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantEnrolmentRequest {\n");
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

