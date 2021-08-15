package com.projet.trips.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projet.trips.models.ConfirmationToken;

@Repository("confirmationTokenRepository")
public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
    ConfirmationToken findByConfirmationToken(String confirmationToken);
    void deleteByConfirmationToken(String token);
}
