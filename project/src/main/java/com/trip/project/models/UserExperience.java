package com.trip.project.models;

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
	private Long id ;
	private String titre;
	private String description;
	private String status;
	
	@OneToMany(mappedBy = "userExperience",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<PhotoExperience> photo;
	
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


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
