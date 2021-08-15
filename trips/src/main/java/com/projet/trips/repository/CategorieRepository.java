package com.projet.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.trips.models.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

	Categorie findByIdCategory(Long id);

}
