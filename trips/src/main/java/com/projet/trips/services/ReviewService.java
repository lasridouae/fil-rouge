package com.projet.trips.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.trips.models.Reviews;
import com.projet.trips.repository.ReviewsRepository;

@Service
public class ReviewService {

	@Autowired
	ReviewsRepository reviewsRepository;

	public List<Reviews> getAllReviews() {
		List<Reviews> reviews = new ArrayList<Reviews>();
		reviewsRepository.findAll().forEach(re -> reviews.add(re));
		return reviews;
	}

	public Reviews getOffreReviewsById(Long id) {
		return reviewsRepository.findById(id).get();
	}

	public void saveOrUpdate(Reviews reviews) {
		reviewsRepository.save(reviews);
	}

	public void delete(Long id) {
		reviewsRepository.deleteById(id);
	}

	public void update(Reviews reviews, Long id) {
		reviewsRepository.save(reviews);

	}

}
