package com.projet.trips.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class UserProfile extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	private String bio;

	@NotBlank
	private String photo;
	
	@NotBlank
	private String ville;
	
	@NotBlank
	private String telephone;
	
	
	
	
	
	
	public UserProfile(Long userId, String bio, @NotBlank String photo, @NotBlank String ville,
			@NotBlank String telephone) {
		super();
		this.userId = userId;
		this.bio = bio;
		this.photo = photo;
		this.ville = ville;
		this.telephone = telephone;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
