package com.projet.trips.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategory;
	private String nom;
	@NotBlank
	@Size(max = 300)
	private String bio;
	private String photo;
	@OneToMany(mappedBy = "categorie",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OffreVoyage> offreVoyage;
	
	
	
	public Categorie(String nom, @NotBlank @Size(max = 300) String bio, String photo, List<OffreVoyage> offreVoyage) {
		super();
		this.nom = nom;
		this.bio = bio;
		this.photo = photo;
		this.offreVoyage = offreVoyage;
	}
	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public List<OffreVoyage> getOffreVoyage() {
		return offreVoyage;
	}
	public void setOffreVoyage(List<OffreVoyage> offreVoyage) {
		this.offreVoyage = offreVoyage;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}
