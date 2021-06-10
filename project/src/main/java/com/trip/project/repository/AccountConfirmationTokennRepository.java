package com.trip.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trip.project.models.AccountConfirmationToken;

@Repository
public interface AccountConfirmationTokennRepository extends CrudRepository<AccountConfirmationToken, String> {
	
	AccountConfirmationToken findByConfirmationToken(String accountConfirmationToken);


}
