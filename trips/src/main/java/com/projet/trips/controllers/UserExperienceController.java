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
import com.projet.trips.models.UserExperience;
import com.projet.trips.services.UserExperienceService;

@CrossOrigin(origins = "*")
@RestController
public class UserExperienceController {

	@Autowired
	UserExperienceService userExperienceService;

	@GetMapping("/userExperience")
	public List<UserExperience> findAllUserExperience() {
		return userExperienceService.getAllUserExperiences();
	}

	@GetMapping("/userExperience/{idEx}")
	public ResponseEntity<UserExperience> findUserExperienceById(@PathVariable Long idEx) {
		userExperienceService.getUserExperienceById(idEx);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/userExperiences")
	public ResponseEntity<UserExperience> createUserExperience(@RequestBody UserExperience userExperience) {
		userExperienceService.saveOrUpdate(userExperience);
		return new ResponseEntity<>(userExperience, HttpStatus.CREATED);
	}

	@PutMapping(path = "/{idEx}")
	public ResponseEntity<UserExperience> UpdateUserExperience(@RequestBody UserExperience userExperience,
			@PathVariable Long idEx) {
		userExperienceService.saveOrUpdate(userExperience);
		return new ResponseEntity<>(userExperience, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/userExperience/{idEx}")
	public ResponseEntity<UserExperience> removeUserExperience(@PathVariable Long idEx) {
		userExperienceService.delete(idEx);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
