package com.projet.trips.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Reviews {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idReview;
		private String titre;
		@NotBlank
		@Size(max = 1000)
		private String description;
		private float note;
		
		
		
		
		public Reviews(String titre, String description, float note) {
			super();
			this.titre = titre;
			this.description = description;
			this.note = note;
		}
		
		
		public Long getIdReview() {
			return idReview;
		}


		public void setIdReview(Long idReview) {
			this.idReview = idReview;
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
		public float getNote() {
			return note;
		}
		public void setNote(float note) {
			this.note = note;
		}
		
		
	

	}


