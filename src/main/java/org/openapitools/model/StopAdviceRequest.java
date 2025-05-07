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
import org.openapitools.model.StopAdvice;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * stopAdviceRequest
 */

@Schema(name = "stopAdviceRequest", description = "stopAdviceRequest")
@JsonTypeName("stopAdviceRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class StopAdviceRequest {

  @Valid
  private List<@Valid StopAdvice> stopadvices = new ArrayList<>();

  private Integer issuerSegmentId;

  public StopAdviceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StopAdviceRequest(List<@Valid StopAdvice> stopadvices, Integer issuerSegmentId) {
    this.stopadvices = stopadvices;
    this.issuerSegmentId = issuerSegmentId;
  }

  public StopAdviceRequest stopadvices(List<@Valid StopAdvice> stopadvices) {
    this.stopadvices = stopadvices;
    return this;
  }

  public StopAdviceRequest addStopadvicesItem(StopAdvice stopadvicesItem) {
    if (this.stopadvices == null) {
      this.stopadvices = new ArrayList<>();
    }
    this.stopadvices.add(stopadvicesItem);
    return this;
  }

  /**
   * [List of stop advice]
   * @return stopadvices
   */
  @NotNull
  @Valid
  @Schema(name = "stopadvices", description = "[List of stop advice]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stopadvices")
  public List<@Valid StopAdvice> getStopadvices() {
    return stopadvices;
  }

  public void setStopadvices(List<@Valid StopAdvice> stopadvices) {
    this.stopadvices = stopadvices;
  }

  public StopAdviceRequest issuerSegmentId(Integer issuerSegmentId) {
    this.issuerSegmentId = issuerSegmentId;
    return this;
  }

  /**
   * [This field must contain a valid VAU issuer segment id]
   * @return issuerSegmentId
   */
  @NotNull 
  @Schema(name = "issuerSegmentId", example = "2", description = "[This field must contain a valid VAU issuer segment id]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuerSegmentId")
  public Integer getIssuerSegmentId() {
    return issuerSegmentId;
  }

  public void setIssuerSegmentId(Integer issuerSegmentId) {
    this.issuerSegmentId = issuerSegmentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopAdviceRequest stopAdviceRequest = (StopAdviceRequest) o;
    return Objects.equals(this.stopadvices, stopAdviceRequest.stopadvices) &&
        Objects.equals(this.issuerSegmentId, stopAdviceRequest.issuerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopadvices, issuerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopAdviceRequest {\n");
    sb.append("    stopadvices: ").append(toIndentedString(stopadvices)).append("\n");
    sb.append("    issuerSegmentId: ").append(toIndentedString(issuerSegmentId)).append("\n");
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

