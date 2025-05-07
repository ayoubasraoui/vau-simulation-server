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
import org.openapitools.model.RejectedStopAdviceResponse;
import org.openapitools.model.SuccessfulStopAdviceResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Issuer-stop-advice-api response body]
 */

@Schema(name = "StopAdviceResponse", description = "[Issuer-stop-advice-api response body]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class StopAdviceResponse {

  @Valid
  private List<@Valid RejectedStopAdviceResponse> rejects = new ArrayList<>();

  @Valid
  private List<@Valid SuccessfulStopAdviceResponse> responses = new ArrayList<>();

  private Integer issuerSegmentId;

  public StopAdviceResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StopAdviceResponse(List<@Valid RejectedStopAdviceResponse> rejects, List<@Valid SuccessfulStopAdviceResponse> responses, Integer issuerSegmentId) {
    this.rejects = rejects;
    this.responses = responses;
    this.issuerSegmentId = issuerSegmentId;
  }

  public StopAdviceResponse rejects(List<@Valid RejectedStopAdviceResponse> rejects) {
    this.rejects = rejects;
    return this;
  }

  public StopAdviceResponse addRejectsItem(RejectedStopAdviceResponse rejectsItem) {
    if (this.rejects == null) {
      this.rejects = new ArrayList<>();
    }
    this.rejects.add(rejectsItem);
    return this;
  }

  /**
   * [List of rejected stop advice responses]
   * @return rejects
   */
  @NotNull
  @Valid
  @Schema(name = "rejects", description = "[List of rejected stop advice responses]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejects")
  public List<@Valid RejectedStopAdviceResponse> getRejects() {
    return rejects;
  }

  public void setRejects(List<@Valid RejectedStopAdviceResponse> rejects) {
    this.rejects = rejects;
  }

  public StopAdviceResponse responses(List<@Valid SuccessfulStopAdviceResponse> responses) {
    this.responses = responses;
    return this;
  }

  public StopAdviceResponse addResponsesItem(SuccessfulStopAdviceResponse responsesItem) {
    if (this.responses == null) {
      this.responses = new ArrayList<>();
    }
    this.responses.add(responsesItem);
    return this;
  }

  /**
   * [List of successful stop advice responses]
   * @return responses
   */
  @NotNull @Valid 
  @Schema(name = "responses", description = "[List of successful stop advice responses]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responses")
  public List<@Valid SuccessfulStopAdviceResponse> getResponses() {
    return responses;
  }

  public void setResponses(List<@Valid SuccessfulStopAdviceResponse> responses) {
    this.responses = responses;
  }

  public StopAdviceResponse issuerSegmentId(Integer issuerSegmentId) {
    this.issuerSegmentId = issuerSegmentId;
    return this;
  }

  /**
   * [This field must contain a valid VAU issuer segment id.]
   * @return issuerSegmentId
   */
  @NotNull 
  @Schema(name = "issuerSegmentId", example = "2", description = "[This field must contain a valid VAU issuer segment id.]", requiredMode = Schema.RequiredMode.REQUIRED)
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
    StopAdviceResponse stopAdviceResponse = (StopAdviceResponse) o;
    return Objects.equals(this.rejects, stopAdviceResponse.rejects) &&
        Objects.equals(this.responses, stopAdviceResponse.responses) &&
        Objects.equals(this.issuerSegmentId, stopAdviceResponse.issuerSegmentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejects, responses, issuerSegmentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopAdviceResponse {\n");
    sb.append("    rejects: ").append(toIndentedString(rejects)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
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

