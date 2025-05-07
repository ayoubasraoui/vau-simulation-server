package org.openapitools.repository;

import org.openapitools.model.Subscription;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SubscriptionRepository extends MongoRepository<Subscription, String> {
    boolean existsByCardholderAccountNumber(String cardholderAccountNumber);
    Optional<Subscription> findByCardholderAccountNumber(String cardholderAccountNumber);
}
