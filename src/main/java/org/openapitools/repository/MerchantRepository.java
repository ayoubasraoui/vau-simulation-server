package org.openapitools.repository;

import org.openapitools.model.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MerchantRepository extends MongoRepository<Merchant, String> {
    boolean existsByMerchantId(String merchantId);
    Optional<Merchant> findByMerchantId(String merchantId);
    List<Merchant> findAllByMerchantId(String merchantId);

}