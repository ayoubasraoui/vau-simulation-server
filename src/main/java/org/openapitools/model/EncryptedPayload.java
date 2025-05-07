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
 * EncryptedPayload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class EncryptedPayload {

  private @Nullable String encData;

  public EncryptedPayload encData(String encData) {
    this.encData = encData;
    return this;
  }

  /**
   * Get encData
   * @return encData
   */
  
  @Schema(name = "encData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("encData")
  public String getEncData() {
    return encData;
  }

  public void setEncData(String encData) {
    this.encData = encData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedPayload encryptedPayload = (EncryptedPayload) o;
    return Objects.equals(this.encData, encryptedPayload.encData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedPayload {\n");
    sb.append("    encData: ").append(toIndentedString(encData)).append("\n");
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

