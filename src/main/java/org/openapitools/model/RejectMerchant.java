package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [RejectMerchant]
 */

@Data
@Schema(name = "RejectMerchant", description = "[RejectMerchant]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class RejectMerchant {

  private String rejectCode;

  private String rejectMessage;

  public RejectMerchant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RejectMerchant(String rejectCode, String rejectMessage) {
    this.rejectCode = rejectCode;
    this.rejectMessage = rejectMessage;
  }

  public RejectMerchant rejectCode(String rejectCode) {
    this.rejectCode = rejectCode;
    return this;
  }

  /**
   * [This field contains one of the following reject codes: * C-Mandatory field Card Acceptor Id missing or invalid or having value zero * D-Duplicate Merchant ID in Request * F-Merchant name exceeds the maximum length of 75 characters * G-Mandatory Field Merchant Country Code missing or must be 3 digit ISO code(including leading zeros) * H-Merchant Acquiring Identifier must be numeric of length 6 or 8 * I-Merchant ID must be 12 characters * J-Merchant name having non english characters or '|' unsupported character * K-Max number of Merchant Acquiring Identifiers supported is 18 * L-Internet Address exceeds the maximum length of 100 characters * M-Merchant Id already exists for this Acquirer Segment * N-Mandatory Field Merchant Name missing * O-Parent Company name having non english characters or '|' unsupported character * P-Mandatory Field Merchant Category Code missing or must be numeric * Q-Mandatory Field Merchant Acquiring Identifier(s) missing or invalid * R-Mandatory Field Merchant ID missing * S-Merchant Country  should be in same region as acquirer * U-Card Acceptor Id exceeds the maximum length of 15 characters * W-Merchant Category Code exceeds the maximum length of 4 digits * Y-Merchant did not qualify for compliance check * Z-Merchant Category Code is Ineligible for Merchant enrollment] 
   * @return rejectCode
   */
  @NotNull
  @Schema(name = "rejectCode", example = "M", description = "[This field contains one of the following reject codes: * C-Mandatory field Card Acceptor Id missing or invalid or having value zero * D-Duplicate Merchant ID in Request * F-Merchant name exceeds the maximum length of 75 characters * G-Mandatory Field Merchant Country Code missing or must be 3 digit ISO code(including leading zeros) * H-Merchant Acquiring Identifier must be numeric of length 6 or 8 * I-Merchant ID must be 12 characters * J-Merchant name having non english characters or '|' unsupported character * K-Max number of Merchant Acquiring Identifiers supported is 18 * L-Internet Address exceeds the maximum length of 100 characters * M-Merchant Id already exists for this Acquirer Segment * N-Mandatory Field Merchant Name missing * O-Parent Company name having non english characters or '|' unsupported character * P-Mandatory Field Merchant Category Code missing or must be numeric * Q-Mandatory Field Merchant Acquiring Identifier(s) missing or invalid * R-Mandatory Field Merchant ID missing * S-Merchant Country  should be in same region as acquirer * U-Card Acceptor Id exceeds the maximum length of 15 characters * W-Merchant Category Code exceeds the maximum length of 4 digits * Y-Merchant did not qualify for compliance check * Z-Merchant Category Code is Ineligible for Merchant enrollment] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejectCode")
  public String getRejectCode() {
    return rejectCode;
  }

  public void setRejectCode(String rejectCode) {
    this.rejectCode = rejectCode;
  }

  public RejectMerchant rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * [This field contains the description of reject message: * C-Mandatory field Card Acceptor Id missing or invalid or having value zero * D-Duplicate Merchant ID in Request * F-Merchant name exceeds the maximum length of 75 characters * G-Mandatory Field Merchant Country Code missing or must be 3 digit ISO code(including leading zeros) * H-Merchant Acquiring Identifier must be numeric of length 6 or 8 * I-Merchant ID must be 12 characters * J-Merchant name having non english characters or '|' unsupported character * K-Max number of Merchant Acquiring Identifiers supported is 18 * L-Internet Address exceeds the maximum length of 100 characters * M-Merchant Id already exists for this Acquirer Segment * N-Mandatory Field Merchant Name missing * O-Parent Company name having non english characters or '|' unsupported character * P-Mandatory Field Merchant Category Code missing or must be numeric * Q-Mandatory Field Merchant Acquiring Identifier(s) missing or invalid * R-Mandatory Field Merchant ID missing * S-Merchant Country  should be in same region as acquirer * U-Card Acceptor Id exceeds the maximum length of 15 characters * W-Merchant Category Code exceeds the maximum length of 4 digits * Y-Merchant did not qualify for compliance check * Z-Merchant Category Code is Ineligible for Merchant enrollment] 
   * @return rejectMessage
   */
  @NotNull 
  @Schema(name = "rejectMessage", example = "Merchant Id already exists for this Acquirer Segment", description = "[This field contains the description of reject message: * C-Mandatory field Card Acceptor Id missing or invalid or having value zero * D-Duplicate Merchant ID in Request * F-Merchant name exceeds the maximum length of 75 characters * G-Mandatory Field Merchant Country Code missing or must be 3 digit ISO code(including leading zeros) * H-Merchant Acquiring Identifier must be numeric of length 6 or 8 * I-Merchant ID must be 12 characters * J-Merchant name having non english characters or '|' unsupported character * K-Max number of Merchant Acquiring Identifiers supported is 18 * L-Internet Address exceeds the maximum length of 100 characters * M-Merchant Id already exists for this Acquirer Segment * N-Mandatory Field Merchant Name missing * O-Parent Company name having non english characters or '|' unsupported character * P-Mandatory Field Merchant Category Code missing or must be numeric * Q-Mandatory Field Merchant Acquiring Identifier(s) missing or invalid * R-Mandatory Field Merchant ID missing * S-Merchant Country  should be in same region as acquirer * U-Card Acceptor Id exceeds the maximum length of 15 characters * W-Merchant Category Code exceeds the maximum length of 4 digits * Y-Merchant did not qualify for compliance check * Z-Merchant Category Code is Ineligible for Merchant enrollment] ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    RejectMerchant rejectMerchant = (RejectMerchant) o;
    return Objects.equals(this.rejectCode, rejectMerchant.rejectCode) &&
        Objects.equals(this.rejectMessage, rejectMerchant.rejectMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectCode, rejectMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RejectMerchant {\n");
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

