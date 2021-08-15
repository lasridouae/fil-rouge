package com.projet.trips.request;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignupRequest {

	@NotBlank
	@Size(min = 3, max = 29)
	private String fullName;

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
	private String telephone;

	@NotBlank
	private String ville;

	@NotBlank
	@Size(max = 8)
	private String cin;

	@NotBlank
	private String photo;

	@NotBlank
    private  String bio;
	
	@NotBlank
	@Size(max = 12)
	private String sexe;

	@NotBlank
	private Date dateNaissance;



	public SignupRequest(@NotBlank @Size(min = 3, max = 29) String fullName,
			@NotBlank @Size(min = 3, max = 20) String username, @NotBlank @Size(max = 50) @Email String email,
			Set<String> role, @NotBlank @Size(min = 6, max = 40) String password, @NotBlank String telephone,
			@NotBlank String ville, @NotBlank @Size(max = 8) String cin, @NotBlank String photo, @NotBlank String bio,
			@NotBlank @Size(max = 12) String sexe, @NotBlank Date dateNaissance) {
		super();
		this.fullName = fullName;
		this.username = username;
		this.email = email;
		this.role = role;
		this.password = password;
		this.telephone = telephone;
		this.ville = ville;
		this.cin = cin;
		this.photo = photo;
		this.bio = bio;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRole() {
		return this.role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}



	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	
	

}