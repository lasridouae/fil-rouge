package com.projet.trips.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.trips.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    User findUserByUserId(String userId);
    

    User findByEmail(String email);
}
