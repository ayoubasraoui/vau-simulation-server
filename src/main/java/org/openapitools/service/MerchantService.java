package org.openapitools.service;

import org.openapitools.model.Merchant;
import org.openapitools.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MerchantService {

    @Autowired
    private MerchantRepository merchantRepository;

    public boolean merchantExists(String merchantId) {
        return merchantRepository.existsByMerchantId(merchantId);
    }

    public Optional<Merchant> getMerchant(String merchantId) {
        return merchantRepository.findByMerchantId(merchantId);
    }

    public Merchant saveMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }
    public Optional<Merchant> findByMerchantId(String merchantId) {
        return merchantRepository.findByMerchantId(merchantId);
    }
    public List<Merchant> findAllByMerchantId(String merchantId) {
        return merchantRepository.findAllByMerchantId(merchantId);
    }

}
