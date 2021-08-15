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

import com.projet.trips.models.Categorie;
import com.projet.trips.models.Commentaire;
import com.projet.trips.services.CommentaireService;

@CrossOrigin(origins = "*")
@RestController
public class CommentaireController {

	@Autowired
	CommentaireService commentaireService;

	@GetMapping("/commentaire")
	public List<Commentaire> getAllCcommentaires() {
		return commentaireService.getAllCommentaires();
	}

	// Get By Id
	@GetMapping("/commentaire/{idCom}")
	public ResponseEntity<Commentaire> getCommentaireById(@PathVariable Long idCom) {
		commentaireService.getByIdCommentaires(idCom);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/commentaires")
	public ResponseEntity<Commentaire> createCommentaire(@RequestBody Commentaire commentaire) {
		commentaireService.saveOrUpdate(commentaire);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping(path = "/{idCom}")
	public ResponseEntity<Commentaire> UpdateCommentaire(@RequestBody Commentaire commentaire,
			@PathVariable Long idCom) {
		commentaireService.saveOrUpdate(commentaire);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/commentaire/{idCom}")
	public ResponseEntity<Commentaire> removeCommentaire(@PathVariable Long idCom) {
		commentaireService.delete(idCom);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
