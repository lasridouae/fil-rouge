package com.projet.trips.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PhotoExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPhoto;

	private String photo;
	@ManyToOne
	@JoinColumn(name = "id_user_exp")
	@JsonIgnore
	private UserExperience userExperience;

	public PhotoExperience(String photo) {
		super();
		this.photo = photo;
	}

	public PhotoExperience(String photo, UserExperience userExperience) {
		super();
		this.photo = photo;
		this.userExperience = userExperience;
	}

	public Long getIdPhoto() {
		return idPhoto;
	}

	public void setIdPhoto(Long idPhoto) {
		this.idPhoto = idPhoto;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public UserExperience getUserExperience() {
		return userExperience;
	}

	public void setUserExperience(UserExperience userExperience) {
		this.userExperience = userExperience;
	}

}
