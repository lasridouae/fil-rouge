package com.projet.trips.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projet.trips.models.Reviews;
import com.projet.trips.services.ReviewService;

@CrossOrigin(origins = "*")
@RestController
public class ReviewController {

	@Autowired
	ReviewService reviewService;

	// Get ALL

	@GetMapping("/getReviews")
	public List<Reviews> findAllReviews() {
		return reviewService.getAllReviews();
	}

	@GetMapping("/getReviewsById/{idReview}")
	public ResponseEntity<Reviews> findReviewsById(@PathVariable Long idReview) {
		Reviews reviews = reviewService.getOffreReviewsById(idReview);
		return new ResponseEntity<>(reviews, HttpStatus.OK);
	}

	@PostMapping("/reviews")
	public ResponseEntity<Reviews> createReviews(@RequestBody Reviews reviews) {
		reviewService.saveOrUpdate(reviews);
		return new ResponseEntity<>(reviews, HttpStatus.CREATED);
	}

	@PutMapping(path = "/{idReview}")
	public ResponseEntity<Reviews> UpdateReviews(@RequestBody Reviews reviews, @PathVariable Long idReview) {
		reviewService.saveOrUpdate(reviews);
		return new ResponseEntity<>(reviews, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/deleteRev/{idReview}")
	public ResponseEntity<Reviews> removeReviews(@PathVariable Long idReview) {
		reviewService.delete(idReview);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
