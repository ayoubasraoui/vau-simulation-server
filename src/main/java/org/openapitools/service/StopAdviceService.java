package org.openapitools.service;

import org.openapitools.model.StopAdviceEntry;
import org.openapitools.repository.StopAdviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StopAdviceService {

    @Autowired
    private StopAdviceRepository repository;

    public boolean exists(String pan) {
        return repository.existsByCardholderAccountNumber(pan);
    }

    public Optional<StopAdviceEntry> getByPan(String pan) {
        return repository.findByCardholderAccountNumber(pan);
    }

    public StopAdviceEntry save(StopAdviceEntry stopAdviceEntry) {
        return repository.save(stopAdviceEntry);
    }
}
