package com.projet.trips.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCom ;
	private String description;
	private float note;
	@ManyToOne
    @JoinColumn(name = "id_offre")
    @JsonIgnore
    private OffreVoyage offreVoyage;
	
	@ManyToOne
    @JoinColumn(name = "id_user_exp")
    @JsonIgnore
    private UserExperience userExperience;
	
	
	
	public Commentaire(String description, float note, OffreVoyage offreVoyage, UserExperience userExperience) {
		super();
		this.description = description;
		this.note = note;
		this.offreVoyage = offreVoyage;
		this.userExperience = userExperience;
	}
	public Long getIdCom() {
		return idCom;
	}
	public void setId(Long idCom) {
		this.idCom = idCom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public OffreVoyage getOffreVoyage() {
		return offreVoyage;
	}
	public void setOffreVoyage(OffreVoyage offreVoyage) {
		this.offreVoyage = offreVoyage;
	}
	public UserExperience getUserExperience() {
		return userExperience;
	}
	public void setUserExperience(UserExperience userExperience) {
		this.userExperience = userExperience;
	}
	public void setIdCom(Long idCom) {
		this.idCom = idCom;
	}
	
	
	

}
