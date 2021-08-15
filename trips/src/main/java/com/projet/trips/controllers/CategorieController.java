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
import com.projet.trips.services.CategorieService;

@CrossOrigin(origins = "*")
@RestController
//@RequestMapping("/api/")
public class CategorieController {

	@Autowired
	CategorieService categorieService;

	// get all categories
	@GetMapping("/categorie")
	public List<Categorie> getAllCategories() {
		return categorieService.getAllCategorie();
	}
	// get category by id rest api

	@GetMapping("/categorie/{idCategory}")
	public ResponseEntity<Categorie> getCategorieById(@PathVariable Long idCategory) {
		categorieService.getByIdCategory(idCategory);

		return new ResponseEntity<>(HttpStatus.OK);
	}

	// create category rest api

	@PostMapping("/categories")
	public ResponseEntity<Categorie> createCategorie(@RequestBody Categorie categorie) {
		categorieService.saveOrUpdate(categorie);

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	// update category rest api

	@PutMapping(path = "/{idCategory}")
	public ResponseEntity<Categorie> UpdateCategory(@RequestBody Categorie categorie, @PathVariable Long idCategory) {
		categorieService.saveOrUpdate(categorie);
		return new ResponseEntity<>(categorie, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/categorie/{idCategory}")
	public ResponseEntity<Categorie> removeCategorie(@PathVariable Long idCategory) {
		categorieService.delete(idCategory);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
