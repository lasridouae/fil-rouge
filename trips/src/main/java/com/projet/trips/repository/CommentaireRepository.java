package com.projet.trips.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.trips.models.Commentaire;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

	Commentaire findByIdCom(Long id);

}
