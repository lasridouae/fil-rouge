package com.projet.trips.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.trips.models.Categorie;
import com.projet.trips.repository.CategorieRepository;

@Service
public class CategorieService {

	@Autowired
	CategorieRepository categoryRepository;

	// getting all category record by using the method findAll() of CrudRepository
	public List<Categorie> getAllCategorie() {
		List<Categorie> categorie = new ArrayList<Categorie>();
		categoryRepository.findAll().forEach(cat -> categorie.add(cat));
		return categorie;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public Categorie getByIdCategory(Long id) {
		return categoryRepository.findById(id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(Categorie categorie) {
		categoryRepository.save(categorie);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(Long id) {
		categoryRepository.deleteById(id);
	}

	// updating a record
	public void update(Categorie categorie, Long id) {
		categoryRepository.save(categorie);
	}

}
