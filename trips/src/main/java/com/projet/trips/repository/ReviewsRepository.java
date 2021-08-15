package com.projet.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.trips.models.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long>{
	
	Reviews findByIdReview(Long id);
	
	

}
