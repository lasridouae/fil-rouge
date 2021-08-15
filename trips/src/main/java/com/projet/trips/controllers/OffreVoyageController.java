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

import com.projet.trips.models.OffreVoyage;
import com.projet.trips.services.OffreVoyageService;

@CrossOrigin(origins = "*")
@RestController
public class OffreVoyageController {

	@Autowired
	OffreVoyageService offreVoyageService;

	@GetMapping("/offreVoyage")
	public List<OffreVoyage> findAllOffreVoyage() {
		return offreVoyageService.getAllOffreVoyage();
	}

	@GetMapping("/getOffreVoyageById/{idOffre}")
	public ResponseEntity<OffreVoyage> findReviewsById(@PathVariable Long idOffre) {
		OffreVoyage offre = offreVoyageService.getOffreVoyageById(idOffre);
		return new ResponseEntity<>(offre, HttpStatus.OK);
	}

	@PostMapping("/OffreVoyages")
	public ResponseEntity<OffreVoyage> createReviews(@RequestBody OffreVoyage offreVoyage) {
		offreVoyageService.saveOrUpdate(offreVoyage);
		return new ResponseEntity<>(offreVoyage, HttpStatus.CREATED);
	}

	@PutMapping(path = "/{idOffre}")
	public ResponseEntity<OffreVoyage> UpdateReviews(@RequestBody OffreVoyage offreVoyage, @PathVariable Long idOffre) {
		offreVoyageService.saveOrUpdate(offreVoyage);
		return new ResponseEntity<>(offreVoyage, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/deleteOffreVoyage/{idOffre}")
	public ResponseEntity<OffreVoyage> removeReviews(@PathVariable Long idOffre) {
		offreVoyageService.delete(idOffre);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
