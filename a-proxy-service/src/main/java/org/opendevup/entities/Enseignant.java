package org.opendevup.entities;



public class Enseignant{
	
	private Long idEnseignant;
	private String nom, prenom;
	private boolean permanent, contractuel, vacataire;
	
	//PourMapping
	private String idDiplome;
	
	public Enseignant() {

	}
	public Enseignant(Long idEnseignant,String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.idEnseignant = idEnseignant;
		this.permanent = true;
		this.contractuel = true;
		this.vacataire = false;
	}
	public Long getidEnseignant() {
		return idEnseignant;
	}
	public void setidEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
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


	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public boolean isContractuel() {
		return contractuel;
	}
	public void setContractuel(boolean contractuel) {
		this.contractuel = contractuel;
	}
	public boolean isVacataire() {
		return vacataire;
	}
	public void setVacataire(boolean vacataire) {
		this.vacataire = vacataire;
	}
	public String getIdDiplome() {
		return idDiplome;
	}
	public void setIdDiplome(String idDiplome) {
		this.idDiplome = idDiplome;
	}
	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nom=" + nom + ", prenom=" + prenom + ", permanent="
				+ permanent + ", contractuel=" + contractuel + ", vacataire=" + vacataire + ", idDiplome=" + idDiplome
				+ "]";
	}	
}