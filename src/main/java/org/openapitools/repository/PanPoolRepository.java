package org.openapitools.repository;

import org.openapitools.model.PanPool;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PanPoolRepository extends MongoRepository<PanPool, String> {

    Optional<PanPool> findFirstByUsedFalse();
}
