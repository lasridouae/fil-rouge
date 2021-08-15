package com.projet.trips.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.trips.models.Commentaire;
import com.projet.trips.repository.CommentaireRepository;

@Service
public class CommentaireService {

	@Autowired
	CommentaireRepository commentaireRepository;

	public List<Commentaire> getAllCommentaires() {
		List<Commentaire> commentaires = new ArrayList<Commentaire>();
		commentaireRepository.findAll().forEach(com -> commentaires.add(com));
		return commentaires;
	}

	public Commentaire getByIdCommentaires(Long id) {
		return commentaireRepository.findById(id).get();
	}

	public void saveOrUpdate(Commentaire commentaire) {
		commentaireRepository.save(commentaire);
	}

	public void delete(Long id) {
		commentaireRepository.deleteById(id);
	}

	// updating a record
	public void update(Commentaire commentaire, Long id) {
		commentaireRepository.save(commentaire);
	}

}
