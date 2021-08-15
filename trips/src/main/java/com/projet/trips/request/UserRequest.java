package com.projet.trips.request;

import java.util.Date;

public class UserRequest {
    private String fullName;
    private String username;
    private String email;
    private String password;
    private String telephone;
	private String ville;
	private String cin;
	private String photo;
	private String sexe;
	private Date dateNaissance;

 
    public UserRequest(String fullName, String username, String email, String password, String telephone, String ville,
			String cin, String photo, String sexe, Date dateNaissance) {
		super();
		this.fullName = fullName;
		this.username = username;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		this.ville = ville;
		this.cin = cin;
		this.photo = photo;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
	}

	public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
    
}
