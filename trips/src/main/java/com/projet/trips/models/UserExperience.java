package com.projet.trips.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class UserExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user_exp")
	private Long idEx ;
	public List<Commentaire> getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(List<Commentaire> commentaire) {
		this.commentaire = commentaire;
	}
	private String titre;
	private String description;
	private String status;
	
	@OneToMany(mappedBy = "userExperience",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PhotoExperience> photo;
	
	@OneToMany(mappedBy = "userExperience",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Commentaire> commentaire;
	
	public UserExperience(String titre, String description, String status) {
		super();
		this.titre = titre;
		this.description = description;
		this.status = status;
	}
	
	
	public UserExperience(String titre, String description, String status, List<PhotoExperience> photo) {
		super();
		this.titre = titre;
		this.description = description;
		this.status = status;
		this.photo = photo;
	}


	public Long getIdEx () {
		return idEx ;
	}
	public void setIdEx (Long idEx ) {
		this.idEx  = idEx ;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<PhotoExperience> getPhoto() {
		return photo;
	}
	public void setPhoto(List<PhotoExperience> photo) {
		this.photo = photo;
	}
	
	
	
	
	
	
	

}
