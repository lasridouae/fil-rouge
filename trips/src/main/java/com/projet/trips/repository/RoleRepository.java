package com.projet.trips.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.trips.models.ERole;
import com.projet.trips.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
