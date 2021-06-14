package com.trip.project.request;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.*;

 
public class SignupRequest {
	@NotBlank
	@Size(min = 3, max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	private Set<String> role;

	@NotBlank
	@Size(min = 6, max = 40)
	private String password;

	@NotBlank
	@Size(min = 3, max = 20)
	String nom;
	
	@NotBlank
	@Size(min = 3, max = 20)
	String prenom;
	
	@NotBlank
	@Size(min = 3, max = 10)
	String phoneNumber;
	
	@NotBlank
	@Size(min = 3, max = 50)
	String ville;
	
	@NotBlank
	@Size(min = 3, max = 8)
	Date dateNaissance;
	
	String photo;
	
	@NotBlank
	@Size(min = 3, max = 50)
	String description;
	
	String sexe;
	
	
	public SignupRequest(@NotBlank @Size(min = 3, max = 20) String username,
			@NotBlank @Size(max = 50) @Email String email, @NotBlank @Size(min = 6, max = 40) String password,
			@NotBlank @Size(min = 3, max = 10) String phoneNumber) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public SignupRequest(@NotBlank @Size(min = 3, max = 20) String username,
			@NotBlank @Size(max = 50) @Email String email, Set<String> role,
			@NotBlank @Size(min = 6, max = 40) String password, @NotBlank @Size(min = 3, max = 20) String nom,
			@NotBlank @Size(min = 3, max = 20) String prenom, @NotBlank @Size(min = 3, max = 10) String phoneNumber,
			@NotBlank @Size(min = 3, max = 50) String ville, @NotBlank @Size(min = 3, max = 8) Date dateNaissance,
			String photo, @NotBlank @Size(min = 3, max = 50) String description, String sexe) {
		super();
		this.username = username;
		this.email = email;
		this.role = role;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.phoneNumber = phoneNumber;
		this.ville = ville;
		this.dateNaissance = dateNaissance;
		this.photo = photo;
		this.description = description;
		this.sexe = sexe;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	
	
	
}
