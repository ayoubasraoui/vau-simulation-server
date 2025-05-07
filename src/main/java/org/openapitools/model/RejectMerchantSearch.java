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
 * [RejectMerchantSearch contains the reject details if the merchant search is rejected]
 */

@Schema(name = "RejectMerchantSearch", description = "[RejectMerchantSearch contains the reject details if the merchant search is rejected]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class RejectMerchantSearch {

  private String rejectCode;

  private String rejectMessage;

  public RejectMerchantSearch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RejectMerchantSearch(String rejectCode, String rejectMessage) {
    this.rejectCode = rejectCode;
    this.rejectMessage = rejectMessage;
  }

  public RejectMerchantSearch rejectCode(String rejectCode) {
    this.rejectCode = rejectCode;
    return this;
  }

  /**
   * [This field contains the following reject codes: * I-Merchant ID must be 12 characters] 
   * @return rejectCode
   */
  @NotNull
  @Schema(name = "rejectCode", example = "I", description = "[This field contains the following reject codes: * I-Merchant ID must be 12 characters] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectCode")
  public String getRejectCode() {
    return rejectCode;
  }

  public void setRejectCode(String rejectCode) {
    this.rejectCode = rejectCode;
  }

  public RejectMerchantSearch rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * [This field contains the description of reject message: * I-Merchant ID must be 12 characters] 
   * @return rejectMessage
   */
  @NotNull 
  @Schema(name = "rejectMessage", example = "Merchant ID must be 12 characters", description = "[This field contains the description of reject message: * I-Merchant ID must be 12 characters] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectMessage")
  public String getRejectMessage() {
    return rejectMessage;
  }

  public void setRejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RejectMerchantSearch rejectMerchantSearch = (RejectMerchantSearch) o;
    return Objects.equals(this.rejectCode, rejectMerchantSearch.rejectCode) &&
        Objects.equals(this.rejectMessage, rejectMerchantSearch.rejectMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectCode, rejectMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectMerchantSearch {\n");
    sb.append("    rejectCode: ").append(toIndentedString(rejectCode)).append("\n");
    sb.append("    rejectMessage: ").append(toIndentedString(rejectMessage)).append("\n");
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

