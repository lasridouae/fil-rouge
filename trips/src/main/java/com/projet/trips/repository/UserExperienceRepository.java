package com.projet.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.trips.models.UserExperience;

@Repository
public interface UserExperienceRepository extends JpaRepository<UserExperience, Long>{

	UserExperience findByIdEx(Long id);
//	UserExperience getByIdEx(Long id);
	
	
}
