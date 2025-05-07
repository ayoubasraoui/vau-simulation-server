package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Reject Request]
 */

@Schema(name = "GenericErrorMessage", description = "[Reject Request]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class GenericErrorMessage {

  private @Nullable String rejectReason;

  private @Nullable String rejectReasonCode;

  public GenericErrorMessage rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  /**
   * This fields contains following reject reasons * Internal Server Error, please try again after sometime 
   * @return rejectReason
   */
  
  @Schema(name = "rejectReason", example = "Internal Server Error, please try again after sometime", description = "This fields contains following reject reasons * Internal Server Error, please try again after sometime ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectReason")
  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }

  public GenericErrorMessage rejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
    return this;
  }

  /**
   * This Fields contains following Reject reason codes: * E 
   * @return rejectReasonCode
   */
  
  @Schema(name = "rejectReasonCode", example = "E", description = "This Fields contains following Reject reason codes: * E ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectReasonCode")
  public String getRejectReasonCode() {
    return rejectReasonCode;
  }

  public void setRejectReasonCode(String rejectReasonCode) {
    this.rejectReasonCode = rejectReasonCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericErrorMessage genericErrorMessage = (GenericErrorMessage) o;
    return Objects.equals(this.rejectReason, genericErrorMessage.rejectReason) &&
        Objects.equals(this.rejectReasonCode, genericErrorMessage.rejectReasonCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReason, rejectReasonCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericErrorMessage {\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    rejectReasonCode: ").append(toIndentedString(rejectReasonCode)).append("\n");
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

