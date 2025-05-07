package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Account Updates Response body]
 */

@Schema(name = "AccountUpdatesResponse", description = "[Account Updates Response body]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class AccountUpdatesResponse {

  private String responseCode;

  private @Nullable String oldExpirationDate;

  private String oldCardholderAccountNumber;

  private @Nullable String acquirerOrMerchantProprietaryInfo;

  public AccountUpdatesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccountUpdatesResponse(String responseCode, String oldCardholderAccountNumber) {
    this.responseCode = responseCode;
    this.oldCardholderAccountNumber = oldCardholderAccountNumber;
  }

  public AccountUpdatesResponse responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * [This field contains the status either Success or Reject]
   * @return responseCode
   */
  @NotNull
  @Size(min = 1, max = 10)
  @Schema(name = "responseCode", example = "SUCCESS", description = "[This field contains the status either Success or Reject]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responseCode")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public AccountUpdatesResponse oldExpirationDate(String oldExpirationDate) {
    this.oldExpirationDate = oldExpirationDate;
    return this;
  }

  /**
   * [This field contains the old expiration date in YYMM format, where YY = 00-99 and MM = 01–12]
   * @return oldExpirationDate
   */
  
  @Schema(name = "oldExpirationDate", example = "2204", description = "[This field contains the old expiration date in YYMM format, where YY = 00-99 and MM = 01–12]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oldExpirationDate")
  public String getOldExpirationDate() {
    return oldExpirationDate;
  }

  public void setOldExpirationDate(String oldExpirationDate) {
    this.oldExpirationDate = oldExpirationDate;
  }

  public AccountUpdatesResponse oldCardholderAccountNumber(String oldCardholderAccountNumber) {
    this.oldCardholderAccountNumber = oldCardholderAccountNumber;
    return this;
  }

  /**
   * [Old Cardholder Account Number.]
   * @return oldCardholderAccountNumber
   */
  @NotNull 
  @Schema(name = "oldCardholderAccountNumber", example = "400000XX00000000", description = "[Old Cardholder Account Number.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("oldCardholderAccountNumber")
  public String getOldCardholderAccountNumber() {
    return oldCardholderAccountNumber;
  }

  public void setOldCardholderAccountNumber(String oldCardholderAccountNumber) {
    this.oldCardholderAccountNumber = oldCardholderAccountNumber;
  }

  public AccountUpdatesResponse acquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
    return this;
  }

  /**
   * [Acquirer/Merchant Proprietary Information is a specific field in the Visa Account Updater's (VAU) record layout, which can contain internal customer identification numbers.]
   * @return acquirerOrMerchantProprietaryInfo
   */
  @Size(min = 0, max = 75) 
  @Schema(name = "acquirerOrMerchantProprietaryInfo", example = "180720216995565000113            XXXXAIBR", description = "[Acquirer/Merchant Proprietary Information is a specific field in the Visa Account Updater's (VAU) record layout, which can contain internal customer identification numbers.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("acquirerOrMerchantProprietaryInfo")
  public String getAcquirerOrMerchantProprietaryInfo() {
    return acquirerOrMerchantProprietaryInfo;
  }

  public void setAcquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdatesResponse accountUpdatesResponse = (AccountUpdatesResponse) o;
    return Objects.equals(this.responseCode, accountUpdatesResponse.responseCode) &&
        Objects.equals(this.oldExpirationDate, accountUpdatesResponse.oldExpirationDate) &&
        Objects.equals(this.oldCardholderAccountNumber, accountUpdatesResponse.oldCardholderAccountNumber) &&
        Objects.equals(this.acquirerOrMerchantProprietaryInfo, accountUpdatesResponse.acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, oldExpirationDate, oldCardholderAccountNumber, acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdatesResponse {\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    oldExpirationDate: ").append(toIndentedString(oldExpirationDate)).append("\n");
    sb.append("    oldCardholderAccountNumber: ").append(toIndentedString(oldCardholderAccountNumber)).append("\n");
    sb.append("    acquirerOrMerchantProprietaryInfo: ").append(toIndentedString(acquirerOrMerchantProprietaryInfo)).append("\n");
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

