package org.openapitools.util;

import org.openapitools.model.Merchant;
import org.openapitools.model.MerchantRequest;

public class MerchantMapper {

    public static Merchant fromRequest(MerchantRequest request) {
        Merchant m = new Merchant();
        m.setMerchantId(request.getMerchantId());
        m.setMerchantName(request.getMerchantName());
        m.setMerchantStatus("Active"); // or map from request if available
        m.setParentCompany(request.getParentCompany());
        m.setMerchantDescriptor(request.getMerchantDescriptor());
        m.setCardAcceptorId(request.getCardAcceptorId());
        m.setCity(request.getCity());
        m.setState(request.getState());
        m.setPostalCode(request.getPostalCode());
        m.setCountryCode(request.getCountryCode());
        m.setContactName(request.getContactName());
        m.setContactEmail(request.getContactEmail());
        m.setContactPhone(request.getContactPhone());
        m.setStreetAddress1(request.getStreetAddress1());
        m.setStreetAddress2(request.getStreetAddress2());
        m.setInternetAddress(request.getInternetAddress());
        m.setMerchantCategoryCode(request.getMerchantCategoryCode());
        m.setMerchantLineBusiness(request.getMerchantLineBusiness());
        m.setMerchantAcquiringIdentifiers(request.getMerchantAcquiringIdentifiers());
        return m;
    }
}
