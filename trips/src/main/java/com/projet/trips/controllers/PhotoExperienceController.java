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

import com.projet.trips.models.PhotoExperience;
import com.projet.trips.models.Reviews;
import com.projet.trips.services.PhotoExperienceService;

@CrossOrigin(origins = "*")
@RestController
public class PhotoExperienceController {

	@Autowired
	PhotoExperienceService photoExperienceService;

	@GetMapping("/photoExperience")
	public List<PhotoExperience> findAllPhotoExperience() {
		return photoExperienceService.getAllPhotos();
	}

	@GetMapping("/photoExperience/{idPhoto}")
	public ResponseEntity<PhotoExperience> findPhotoExperienceById(@PathVariable Long idPhoto) {
		photoExperienceService.getByPhotoExperience(idPhoto);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/photoExperiences")
	public ResponseEntity<PhotoExperience> createphotoExperience(@RequestBody PhotoExperience photoExperience) {
		photoExperienceService.saveOrUpdate(photoExperience);
		return new ResponseEntity<>(photoExperience, HttpStatus.CREATED);
	}

	@PutMapping(path = "/{idPhoto}")
	public ResponseEntity<PhotoExperience> UpdateReviews(@RequestBody PhotoExperience photoExperience,
			@PathVariable Long idPhoto) {
		photoExperienceService.saveOrUpdate(photoExperience);
		return new ResponseEntity<>(photoExperience, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/photoExperience/{idPhoto}")
	public ResponseEntity<PhotoExperience> removePhotoExperience(@PathVariable Long idPhoto) {
		photoExperienceService.delete(idPhoto);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
