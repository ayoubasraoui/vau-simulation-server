package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.openapitools.model.RejectedSubscription;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [List of Subscription Delete Responses]
 */

@Schema(name = "DeleteSubscription", description = "[List of Subscription Delete Responses]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class DeleteSubscription {

  private @Nullable RejectedSubscription reject;

  private String deleteStatus;

  private String cardholderAccountNumber;

  private @Nullable String acquirerOrMerchantProprietaryInfo;

  public DeleteSubscription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeleteSubscription(String deleteStatus, String cardholderAccountNumber) {
    this.deleteStatus = deleteStatus;
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public DeleteSubscription reject(RejectedSubscription reject) {
    this.reject = reject;
    return this;
  }

  /**
   * Get reject
   * @return reject
   */
  @Valid
  @Schema(name = "reject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reject")
  public RejectedSubscription getReject() {
    return reject;
  }

  public void setReject(RejectedSubscription reject) {
    this.reject = reject;
  }

  public DeleteSubscription deleteStatus(String deleteStatus) {
    this.deleteStatus = deleteStatus;
    return this;
  }

  /**
   * [This field contains the  status whether the subscribe pan is Success or NotFound or Reject]
   * @return deleteStatus
   */
  @NotNull
  @Schema(name = "deleteStatus", example = "Success", description = "[This field contains the  status whether the subscribe pan is Success or NotFound or Reject]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deleteStatus")
  public String getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(String deleteStatus) {
    this.deleteStatus = deleteStatus;
  }

  public DeleteSubscription cardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
    return this;
  }

  /**
   * [This field contains the account number that was submitted in the associated Subscription Delete Request.]
   * @return cardholderAccountNumber
   */
  @NotNull 
  @Schema(name = "cardholderAccountNumber", example = "400000XX00000000", description = "[This field contains the account number that was submitted in the associated Subscription Delete Request.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cardholderAccountNumber")
  public String getCardholderAccountNumber() {
    return cardholderAccountNumber;
  }

  public void setCardholderAccountNumber(String cardholderAccountNumber) {
    this.cardholderAccountNumber = cardholderAccountNumber;
  }

  public DeleteSubscription acquirerOrMerchantProprietaryInfo(String acquirerOrMerchantProprietaryInfo) {
    this.acquirerOrMerchantProprietaryInfo = acquirerOrMerchantProprietaryInfo;
    return this;
  }

  /**
   * [This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Subscription Delete Request.]
   * @return acquirerOrMerchantProprietaryInfo
   */
  
  @Schema(name = "acquirerOrMerchantProprietaryInfo", example = "180720216995565000113            XXXXAIBR", description = "[This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Subscription Delete Request.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DeleteSubscription deleteSubscription = (DeleteSubscription) o;
    return Objects.equals(this.reject, deleteSubscription.reject) &&
        Objects.equals(this.deleteStatus, deleteSubscription.deleteStatus) &&
        Objects.equals(this.cardholderAccountNumber, deleteSubscription.cardholderAccountNumber) &&
        Objects.equals(this.acquirerOrMerchantProprietaryInfo, deleteSubscription.acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reject, deleteStatus, cardholderAccountNumber, acquirerOrMerchantProprietaryInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSubscription {\n");
    sb.append("    reject: ").append(toIndentedString(reject)).append("\n");
    sb.append("    deleteStatus: ").append(toIndentedString(deleteStatus)).append("\n");
    sb.append("    cardholderAccountNumber: ").append(toIndentedString(cardholderAccountNumber)).append("\n");
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

