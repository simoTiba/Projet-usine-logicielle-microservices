package org.opendevup.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diplome{
	@Id
	private String idDiplome;
	private String semestre, label, departement  ;
	private boolean verrou;
	private int volumehoraire, cm, td, tp;
	
	
	//Pour Mapping avec Service
	private String ueId;
	private Long idEnseignant;
	

	public Diplome() {
		super();
		
	}
	
	public Diplome(String idDiplome, String semestre, String label, boolean verrou, int volumehoraire, int cm, int td,
			int tp, String departement, String ueId, Long idEnseignant) {
		super();
		this.idDiplome = idDiplome;
		this.semestre = semestre;
		this.label = label;
		this.verrou = verrou;
		this.volumehoraire = volumehoraire;
		this.cm = cm;
		this.td = td;
		this.tp = tp;
		this.departement=departement;
		this.ueId = ueId;
		this.idEnseignant = idEnseignant;
	}
	public String getIdDiplome() {
		return idDiplome;
	}
	public void setIdDiplome(String idDiplome) {
		this.idDiplome = idDiplome;
	}
	public String getUeId() {
		return ueId;
	}
	public void setUeId(String ueId) {
		this.ueId = ueId;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isVerrou() {
		return verrou;
	}

	public void setVerrou(boolean verrou) {
		this.verrou = verrou;
	}

	public int getVolumehoraire() {
		return volumehoraire;
	}

	public void setVolumehoraire(int volumehoraire) {
		this.volumehoraire = volumehoraire;
	}

	public int getCm() {
		return cm;
	}

	public void setCm(int cm) {
		this.cm = cm;
	}

	public int getTd() {
		return td;
	}

	public void setTd(int td) {
		this.td = td;
	}

	public int getTp() {
		return tp;
	}

	public void setTp(int tp) {
		this.tp = tp;
	}
	
	
	
	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@Override
	public String toString() {
		return "Diplome [idDiplome=" + idDiplome + ", semestre=" + semestre + ", label=" + label + ", verrou=" + verrou
				+ ", volumehoraire=" + volumehoraire + ", cm=" + cm + ", td=" + td + ", tp=" + tp + ", ueId=" + ueId
				+ ", idEnseignant=" + idEnseignant + "]";
	}





	//Mapping
	public Long getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	
	
}