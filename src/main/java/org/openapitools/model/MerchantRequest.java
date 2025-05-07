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
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;


/**
 * [List of merchant enrolment]
 */
@Data
@Schema(name = "MerchantRequest", description = "[List of merchant enrolment]")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-17T15:26:51.744576900+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class MerchantRequest {

  private @Nullable String city;

  private @Nullable String state;

  private String merchantId;

  private @Nullable String postalCode;

  private @Nullable String contactName;

  private String countryCode;

  private @Nullable String contactEmail;

  private @Nullable String contactPhone;

  private String merchantName;

  private @Nullable String parentCompany;

  private String cardAcceptorId;

  private @Nullable String streetAddress1;

  private @Nullable String streetAddress2;

  private @Nullable String internetAddress;

  private @Nullable String merchantDescriptor;

  private String merchantCategoryCode;

  private @Nullable String merchantLineBusiness;

  @Valid
  private List<@Size(min = 6, max = 8)String> merchantAcquiringIdentifiers = new ArrayList<>();

  public MerchantRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MerchantRequest(String merchantId, String countryCode, String merchantName, String cardAcceptorId, String merchantCategoryCode, List<@Size(min = 6, max = 8)String> merchantAcquiringIdentifiers) {
    this.merchantId = merchantId;
    this.countryCode = countryCode;
    this.merchantName = merchantName;
    this.cardAcceptorId = cardAcceptorId;
    this.merchantCategoryCode = merchantCategoryCode;
    this.merchantAcquiringIdentifiers = merchantAcquiringIdentifiers;
  }

  public MerchantRequest city(String city) {
    this.city = city;
    return this;
  }

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

  public MerchantRequest state(String state) {
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

  public MerchantRequest merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]
   * @return merchantId
   */
  @NotNull @Size(min = 12, max = 12) 
  @Schema(name = "merchantId", example = "000000705853", description = "[Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantId")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public MerchantRequest postalCode(String postalCode) {
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

  public MerchantRequest contactName(String contactName) {
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

  public MerchantRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * [Merchant ISO country code]
   * @return countryCode
   */
  @NotNull
  @Schema(name = "countryCode", example = "840", description = "[Merchant ISO country code]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public MerchantRequest contactEmail(String contactEmail) {
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

  public MerchantRequest contactPhone(String contactPhone) {
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

  public MerchantRequest merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * [Name of Merchant]
   * @return merchantName
   */
  @NotNull @Size(min = 1, max = 75) 
  @Schema(name = "merchantName", example = "GS PERFORMANCE", description = "[Name of Merchant]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantName")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public MerchantRequest parentCompany(String parentCompany) {
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

  public MerchantRequest cardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

  /**
   * [Merchant card acceptor id]
   * @return cardAcceptorId
   */
  @NotNull @Size(min = 1, max = 15) 
  @Schema(name = "cardAcceptorId", example = "8405445454", description = "[Merchant card acceptor id]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cardAcceptorId")
  public String getCardAcceptorId() {
    return cardAcceptorId;
  }

  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }

  public MerchantRequest streetAddress1(String streetAddress1) {
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

  public MerchantRequest streetAddress2(String streetAddress2) {
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

  public MerchantRequest internetAddress(String internetAddress) {
    this.internetAddress = internetAddress;
    return this;
  }

  /**
   * [Internet address for the merchant]
   * @return internetAddress
   */
  @Size(min = 0, max = 100) 
  @Schema(name = "internetAddress", example = "https://www.glockstor.com", description = "[Internet address for the merchant]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("internetAddress")
  public String getInternetAddress() {
    return internetAddress;
  }

  public void setInternetAddress(String internetAddress) {
    this.internetAddress = internetAddress;
  }

  public MerchantRequest merchantDescriptor(String merchantDescriptor) {
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

  public MerchantRequest merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * [A 4 digit code assigned by the merchant’s acquirer to identify the merchant’s type of business.]
   * @return merchantCategoryCode
   */
  @NotNull @Size(min = 4, max = 4) 
  @Schema(name = "merchantCategoryCode", example = "5735", description = "[A 4 digit code assigned by the merchant’s acquirer to identify the merchant’s type of business.]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantCategoryCode")
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public MerchantRequest merchantLineBusiness(String merchantLineBusiness) {
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

  public MerchantRequest merchantAcquiringIdentifiers(List<@Size(min = 6, max = 8)String> merchantAcquiringIdentifiers) {
    this.merchantAcquiringIdentifiers = merchantAcquiringIdentifiers;
    return this;
  }

  public MerchantRequest addMerchantAcquiringIdentifiersItem(String merchantAcquiringIdentifiersItem) {
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
  @NotNull @Size(min = 1, max = 18) 
  @Schema(name = "merchantAcquiringIdentifiers", example = "[\"312345\",\"312344\"]", description = "[Merchant acquiring identifier]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("merchantAcquiringIdentifiers")
  public List<@Size(min = 6, max = 8)String> getMerchantAcquiringIdentifiers() {
    return merchantAcquiringIdentifiers;
  }

  public void setMerchantAcquiringIdentifiers(List<@Size(min = 6, max = 8)String> merchantAcquiringIdentifiers) {
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
    MerchantRequest merchantRequest = (MerchantRequest) o;
    return Objects.equals(this.city, merchantRequest.city) &&
        Objects.equals(this.state, merchantRequest.state) &&
        Objects.equals(this.merchantId, merchantRequest.merchantId) &&
        Objects.equals(this.postalCode, merchantRequest.postalCode) &&
        Objects.equals(this.contactName, merchantRequest.contactName) &&
        Objects.equals(this.countryCode, merchantRequest.countryCode) &&
        Objects.equals(this.contactEmail, merchantRequest.contactEmail) &&
        Objects.equals(this.contactPhone, merchantRequest.contactPhone) &&
        Objects.equals(this.merchantName, merchantRequest.merchantName) &&
        Objects.equals(this.parentCompany, merchantRequest.parentCompany) &&
        Objects.equals(this.cardAcceptorId, merchantRequest.cardAcceptorId) &&
        Objects.equals(this.streetAddress1, merchantRequest.streetAddress1) &&
        Objects.equals(this.streetAddress2, merchantRequest.streetAddress2) &&
        Objects.equals(this.internetAddress, merchantRequest.internetAddress) &&
        Objects.equals(this.merchantDescriptor, merchantRequest.merchantDescriptor) &&
        Objects.equals(this.merchantCategoryCode, merchantRequest.merchantCategoryCode) &&
        Objects.equals(this.merchantLineBusiness, merchantRequest.merchantLineBusiness) &&
        Objects.equals(this.merchantAcquiringIdentifiers, merchantRequest.merchantAcquiringIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, state, merchantId, postalCode, contactName, countryCode, contactEmail, contactPhone, merchantName, parentCompany, cardAcceptorId, streetAddress1, streetAddress2, internetAddress, merchantDescriptor, merchantCategoryCode, merchantLineBusiness, merchantAcquiringIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantRequest {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    parentCompany: ").append(toIndentedString(parentCompany)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
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

