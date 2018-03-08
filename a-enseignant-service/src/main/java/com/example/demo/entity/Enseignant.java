package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Enseignant{
	@Id
	private Long idEnseignant;
	private String nom, prenom;
	private String statut;
	
	//PourMapping
	//private String idDiplome;
	
	public Enseignant() {

	}
	
	
	public Enseignant(Long idEnseignant, String nom, String prenom, String statut) {
		super();
		this.idEnseignant = idEnseignant;
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
	}


	public Long getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
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


	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nom=" + nom + ", prenom=" + prenom + ", statut=" + statut
				+ "]";
	}

	
	
//	public String getIdDiplome() {
//		return idDiplome;
//	}
//	public void setIdDiplome(String idDiplome) {
//		this.idDiplome = idDiplome;
//	}
		
}