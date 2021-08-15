package com.projet.trips.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OffreVoyage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOffre;
	
	private String titre  ;
	private Date dateDebut  ;
	private Date dateFin;
	private String description;
	private int nmbrPersonne;
	private String status;
	
	@ManyToOne
	    @JoinColumn(name = "id_cat")
	    @JsonIgnore
	    private Categorie categorie;
	
	@OneToMany(mappedBy = "offreVoyage",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Commentaire> commentaire;
	
	public OffreVoyage(String titre, Date dateDebut, Date dateFin, String description, int nmbrPersonne,
			String status) {
		super();
		this.titre = titre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.description = description;
		this.nmbrPersonne = nmbrPersonne;
		this.status = status;
	}
	
	


	public OffreVoyage(String titre, Date dateDebut, Date dateFin, String description, int nmbrPersonne, String status,
			Categorie categorie, List<Commentaire> commentaire) {
		super();
		this.titre = titre;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.description = description;
		this.nmbrPersonne = nmbrPersonne;
		this.status = status;
		this.categorie = categorie;
		this.commentaire = commentaire;
	}







	public Long getIdOffre() {
		return idOffre;
	}
	public void setId(Long idOffre) {
		this.idOffre = idOffre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNmbrPersonne() {
		return nmbrPersonne;
	}
	public void setNmbrPersonne(int nmbrPersonne) {
		this.nmbrPersonne = nmbrPersonne;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}



	public void setIdOffre(Long idOffre) {
		this.idOffre = idOffre;
	}



	public List<Commentaire> getCommentaire() {
		return commentaire;
	}



	public void setCommentaire(List<Commentaire> commentaire) {
		this.commentaire = commentaire;
	}
	
	
}
