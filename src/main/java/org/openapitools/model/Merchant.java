package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.openapitools.model.RejectMerchantSearch;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [Merchant Object]
 */

@Data
@Schema(name = "Merchant", description = "[Merchant Object]")
@Document(collection = "merchants")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class Merchant {

  private @Nullable String city;

  private @Nullable String state;

  private @Nullable RejectMerchantSearch reject;

  private String merchantId;

  private @Nullable String postalCode;

  private @Nullable String contactName;

  private @Nullable String countryCode;

  private @Nullable String contactEmail;

  private @Nullable String contactPhone;

  private @Nullable String merchantName;

  private @Nullable String parentCompany;

  private @Nullable String cardAcceptorId;

  private String merchantStatus;

  private @Nullable String streetAddress1;

  private @Nullable String streetAddress2;

  private @Nullable String internetAddress;

  private @Nullable String merchantDescriptor;

  private @Nullable String merchantCategoryCode;

  private @Nullable String merchantLineBusiness;

  @Valid
  private List<String> merchantAcquiringIdentifiers = new ArrayList<>();

  public Merchant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
//  public Merchant(String merchantId, String merchantStatus) {
//    this.merchantId = merchantId;
//    this.merchantStatus = merchantStatus;
//  }
//
//  public Merchant city(String city) {
//    this.city = city;
//    return this;
//  }

  /**
   * [Merchant city name]
   * @return city
   */
  
  @Schema(name = "city", example = "Dallas", description = "[Merchant city name]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Merchant state(String state) {
    this.state = state;
    return this;
  }

  /**
   * [Merchant state name]
   * @return state
   */
  
  @Schema(name = "state", example = "TX", description = "[Merchant state name]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Merchant reject(RejectMerchantSearch reject) {
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
  public RejectMerchantSearch getReject() {
    return reject;
  }

  public void setReject(RejectMerchantSearch reject) {
    this.reject = reject;
  }

  public Merchant merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]
   * @return merchantId
   */
  @NotNull
  @Schema(name = "merchantId", example = "000000705853", description = "[Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public Merchant postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * [Merchant postal code]
   * @return postalCode
   */
  
  @Schema(name = "postalCode", example = "75231", description = "[Merchant postal code]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postalCode")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Merchant contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * [Merchant contact name]
   * @return contactName
   */
  
  @Schema(name = "contactName", example = "John", description = "[Merchant contact name]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactName")
  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Merchant countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * [Merchant country code]
   * @return countryCode
   */
  
  @Schema(name = "countryCode", example = "840", description = "[Merchant country code]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Merchant contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * [Merchant contact email]
   * @return contactEmail
   */
  
  @Schema(name = "contactEmail", example = "john@glockstor.com", description = "[Merchant contact email]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactEmail")
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public Merchant contactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
    return this;
  }

  /**
   * [Contact phone number of the merchant]
   * @return contactPhone
   */
  
  @Schema(name = "contactPhone", example = "840909090", description = "[Contact phone number of the merchant]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactPhone")
  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public Merchant merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * [Name of Merchant]
   * @return merchantName
   */
  
  @Schema(name = "merchantName", example = "GS PERFORMANCE", description = "[Name of Merchant]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantName")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public Merchant parentCompany(String parentCompany) {
    this.parentCompany = parentCompany;
    return this;
  }

  /**
   * [Parent company name of  the merchants]
   * @return parentCompany
   */
  
  @Schema(name = "parentCompany", example = "GS PERFORMANCE", description = "[Parent company name of  the merchants]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parentCompany")
  public String getParentCompany() {
    return parentCompany;
  }

  public void setParentCompany(String parentCompany) {
    this.parentCompany = parentCompany;
  }

  public Merchant cardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

  /**
   * [Merchant card acceptor id]
   * @return cardAcceptorId
   */
  
  @Schema(name = "cardAcceptorId", example = "8403435453", description = "[Merchant card acceptor id]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardAcceptorId")
  public String getCardAcceptorId() {
    return cardAcceptorId;
  }

  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }

  public Merchant merchantStatus(String merchantStatus) {
    this.merchantStatus = merchantStatus;
    return this;
  }

  /**
   * [Merchant status, This field contains one of the following status: * Active — Merchant status is Active * InActive — Merchant status is In Active * In-Progress — Merchant enrollment is in progress * NotFound — Merchant not found in VAU * Declined — Merchant unable to pass screening * Reject — Merchant search is rejected, reject code and reject message will be returned] 
   * @return merchantStatus
   */
  @NotNull 
  @Schema(name = "merchantStatus", example = "Active", description = "[Merchant status, This field contains one of the following status: * Active — Merchant status is Active * InActive — Merchant status is In Active * In-Progress — Merchant enrollment is in progress * NotFound — Merchant not found in VAU * Declined — Merchant unable to pass screening * Reject — Merchant search is rejected, reject code and reject message will be returned] ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantStatus")
  public String getMerchantStatus() {
    return merchantStatus;
  }

  public void setMerchantStatus(String merchantStatus) {
    this.merchantStatus = merchantStatus;
  }

  public Merchant streetAddress1(String streetAddress1) {
    this.streetAddress1 = streetAddress1;
    return this;
  }

  /**
   * [Address1 for the merchant]
   * @return streetAddress1
   */
  
  @Schema(name = "streetAddress1", example = "8144 Walnut Hill Lane", description = "[Address1 for the merchant]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetAddress1")
  public String getStreetAddress1() {
    return streetAddress1;
  }

  public void setStreetAddress1(String streetAddress1) {
    this.streetAddress1 = streetAddress1;
  }

  public Merchant streetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
    return this;
  }

  /**
   * [Address2 for the merchant]
   * @return streetAddress2
   */
  
  @Schema(name = "streetAddress2", example = "4th cross", description = "[Address2 for the merchant]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("streetAddress2")
  public String getStreetAddress2() {
    return streetAddress2;
  }

  public void setStreetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
  }

  public Merchant internetAddress(String internetAddress) {
    this.internetAddress = internetAddress;
    return this;
  }

  /**
   * [Internet address for the merchant]
   * @return internetAddress
   */
  
  @Schema(name = "internetAddress", example = "https://www.glockstor.com", description = "[Internet address for the merchant]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internetAddress")
  public String getInternetAddress() {
    return internetAddress;
  }

  public void setInternetAddress(String internetAddress) {
    this.internetAddress = internetAddress;
  }

  public Merchant merchantDescriptor(String merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
    return this;
  }

  /**
   * [Merchant descriptor]
   * @return merchantDescriptor
   */
  
  @Schema(name = "merchantDescriptor", example = "GS PERFORMANCE", description = "[Merchant descriptor]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantDescriptor")
  public String getMerchantDescriptor() {
    return merchantDescriptor;
  }

  public void setMerchantDescriptor(String merchantDescriptor) {
    this.merchantDescriptor = merchantDescriptor;
  }

  public Merchant merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * [A 4 digit code assigned by the merchant’s acquirer to identify the merchant’s type of business.]
   * @return merchantCategoryCode
   */
  
  @Schema(name = "merchantCategoryCode", example = "5735", description = "[A 4 digit code assigned by the merchant’s acquirer to identify the merchant’s type of business.]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantCategoryCode")
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public Merchant merchantLineBusiness(String merchantLineBusiness) {
    this.merchantLineBusiness = merchantLineBusiness;
    return this;
  }

  /**
   * [Merchant line business]
   * @return merchantLineBusiness
   */
  
  @Schema(name = "merchantLineBusiness", example = "Online Service", description = "[Merchant line business]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantLineBusiness")
  public String getMerchantLineBusiness() {
    return merchantLineBusiness;
  }

  public void setMerchantLineBusiness(String merchantLineBusiness) {
    this.merchantLineBusiness = merchantLineBusiness;
  }

  public Merchant merchantAcquiringIdentifiers(List<String> merchantAcquiringIdentifiers) {
    this.merchantAcquiringIdentifiers = merchantAcquiringIdentifiers;
    return this;
  }

  public Merchant addMerchantAcquiringIdentifiersItem(String merchantAcquiringIdentifiersItem) {
    if (this.merchantAcquiringIdentifiers == null) {
      this.merchantAcquiringIdentifiers = new ArrayList<>();
    }
    this.merchantAcquiringIdentifiers.add(merchantAcquiringIdentifiersItem);
    return this;
  }

  /**
   * [Merchant acquiring identifier]
   * @return merchantAcquiringIdentifiers
   */
  
  @Schema(name = "merchantAcquiringIdentifiers", example = "[\"312345\",\"312344\"]", description = "[Merchant acquiring identifier]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchantAcquiringIdentifiers")
  public List<String> getMerchantAcquiringIdentifiers() {
    return merchantAcquiringIdentifiers;
  }

  public void setMerchantAcquiringIdentifiers(List<String> merchantAcquiringIdentifiers) {
    this.merchantAcquiringIdentifiers = merchantAcquiringIdentifiers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.city, merchant.city) &&
        Objects.equals(this.state, merchant.state) &&
        Objects.equals(this.reject, merchant.reject) &&
        Objects.equals(this.merchantId, merchant.merchantId) &&
        Objects.equals(this.postalCode, merchant.postalCode) &&
        Objects.equals(this.contactName, merchant.contactName) &&
        Objects.equals(this.countryCode, merchant.countryCode) &&
        Objects.equals(this.contactEmail, merchant.contactEmail) &&
        Objects.equals(this.contactPhone, merchant.contactPhone) &&
        Objects.equals(this.merchantName, merchant.merchantName) &&
        Objects.equals(this.parentCompany, merchant.parentCompany) &&
        Objects.equals(this.cardAcceptorId, merchant.cardAcceptorId) &&
        Objects.equals(this.merchantStatus, merchant.merchantStatus) &&
        Objects.equals(this.streetAddress1, merchant.streetAddress1) &&
        Objects.equals(this.streetAddress2, merchant.streetAddress2) &&
        Objects.equals(this.internetAddress, merchant.internetAddress) &&
        Objects.equals(this.merchantDescriptor, merchant.merchantDescriptor) &&
        Objects.equals(this.merchantCategoryCode, merchant.merchantCategoryCode) &&
        Objects.equals(this.merchantLineBusiness, merchant.merchantLineBusiness) &&
        Objects.equals(this.merchantAcquiringIdentifiers, merchant.merchantAcquiringIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, state, reject, merchantId, postalCode, contactName, countryCode, contactEmail, contactPhone, merchantName, parentCompany, cardAcceptorId, merchantStatus, streetAddress1, streetAddress2, internetAddress, merchantDescriptor, merchantCategoryCode, merchantLineBusiness, merchantAcquiringIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reject: ").append(toIndentedString(reject)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    parentCompany: ").append(toIndentedString(parentCompany)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
    sb.append("    merchantStatus: ").append(toIndentedString(merchantStatus)).append("\n");
    sb.append("    streetAddress1: ").append(toIndentedString(streetAddress1)).append("\n");
    sb.append("    streetAddress2: ").append(toIndentedString(streetAddress2)).append("\n");
    sb.append("    internetAddress: ").append(toIndentedString(internetAddress)).append("\n");
    sb.append("    merchantDescriptor: ").append(toIndentedString(merchantDescriptor)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantLineBusiness: ").append(toIndentedString(merchantLineBusiness)).append("\n");
    sb.append("    merchantAcquiringIdentifiers: ").append(toIndentedString(merchantAcquiringIdentifiers)).append("\n");
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

