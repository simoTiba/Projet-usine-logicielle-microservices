package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
	@Id
	private String ueId;
	private boolean realise; 
	private String previsionel;
	private String etat;
	
	//Pour Mapping Enseignnt
	private Long idEnseignant;
	
	//Pour Mapping Diplome
	private String idDiplome;
	

	public Service(String id, String previsionel, String etat, Long idEnseignant, String idDiplome) {
		super();
		this.previsionel = previsionel;
		this.etat = etat;
		this.idEnseignant = idEnseignant;
		this.ueId=id;
		this.idDiplome = idDiplome;
	}
	
	public String getUeId() {
		return ueId;
	}

	public void setUeId(String ueId) {
		this.ueId = ueId;
	}

	public Service() {
		super();
	}

	public boolean isRealise() {
		return realise;
	}
	public void setRealise(boolean realise) {
		this.realise = realise;
	}
	public String getPrevisionel() {
		return previsionel;
	}
	public void setPrevisionel(String previsionel) {
		this.previsionel = previsionel;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Service [ueId=" + ueId +", enseignatId=" + idEnseignant + ", realise=" + realise
				+ ", previsionel=" + previsionel + ", etat=" + etat + "]";
	}
	//Pour Mapping


	public String getIdDiplome() {
		return idDiplome;
	}

	public Long getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	public void setIdDiplome(String idDiplome) {
		this.idDiplome = idDiplome;
	}
	
	

	
}
