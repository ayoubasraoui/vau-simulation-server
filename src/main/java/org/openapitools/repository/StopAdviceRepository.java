package org.openapitools.repository;

import org.openapitools.model.StopAdvice;
import org.openapitools.model.StopAdviceEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StopAdviceRepository extends MongoRepository<StopAdviceEntry, String> {
    boolean existsByCardholderAccountNumber(String pan);
    Optional<StopAdviceEntry> findByCardholderAccountNumber(String pan);
}
