package com.trip.project.models;

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
	private Long id;
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



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
