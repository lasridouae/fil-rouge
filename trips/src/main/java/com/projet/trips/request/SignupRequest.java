package com.projet.trips.request;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignupRequest {

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

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
	private String photo;

	
	
	@NotBlank
	@Size(max = 12)
	private String sexe;

	@NotBlank
	private Date dateNaissance;






	public SignupRequest(@NotBlank String firstName, @NotBlank String lastName,
			@NotBlank @Size(min = 3, max = 20) String username, @NotBlank @Size(max = 50) @Email String email,
			Set<String> role, @NotBlank @Size(min = 6, max = 40) String password, @NotBlank String photo,
			@NotBlank @Size(max = 12) String sexe, @NotBlank Date dateNaissance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.role = role;
		this.password = password;
		this.photo = photo;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
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


	
	

}