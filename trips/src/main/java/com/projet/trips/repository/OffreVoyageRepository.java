package com.projet.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.trips.models.OffreVoyage;

@Repository
public interface OffreVoyageRepository extends JpaRepository<OffreVoyage, Long> {

	OffreVoyage findByIdOffre(Long id);

}