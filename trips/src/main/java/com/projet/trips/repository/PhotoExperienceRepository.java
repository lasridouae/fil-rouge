package com.projet.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.trips.models.PhotoExperience;

@Repository
public interface PhotoExperienceRepository extends JpaRepository<PhotoExperience, Long> {

	PhotoExperience findByIdPhoto(Long idPhoto);

}
