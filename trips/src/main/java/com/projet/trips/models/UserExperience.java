package com.projet.trips.models;

import java.util.List;
import java.util.Set;

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
	private String titre;
	private String description;
	private String status;
	
	@OneToMany(mappedBy = "userExperience",fetch = FetchType.EAGER)
    private List<PhotoExperience> photo;
	
	@OneToMany(mappedBy = "userExperience",fetch = FetchType.EAGER)
    private Set<Commentaire> commentaire;
	




	public UserExperience(String titre, String description, String status, List<PhotoExperience> photo,
			Set<Commentaire> commentaire) {
		super();
		this.titre = titre;
		this.description = description;
		this.status = status;
		this.photo = photo;
		this.commentaire = commentaire;
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
	
	public Set<Commentaire> getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(Set<Commentaire> commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
	

}
