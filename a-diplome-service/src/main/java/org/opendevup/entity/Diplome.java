package org.opendevup.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Diplome{
	@Id
	private String idDiplome;
	private String semestre;
	private String volumehoraire;
	private String codeUe;
	
	//Pour Mapping avec Service
	private String ueId;
	private Long idEnseignant;
	

	public Diplome() {
		super();
		
	}
	
	public Diplome(String id, String semestre, String volumehoraire, String codeUe, String ueId, Long idEnseignant) {
		this.semestre=semestre;
		this.volumehoraire=volumehoraire;
		this.codeUe = codeUe;
		this.ueId = ueId;
		this.idDiplome=id;
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
	public String getVolumehoraire() {
		return volumehoraire;
	}
	public void setVolumehoraire(String volumehoraire) {
		this.volumehoraire = volumehoraire;
	}
	public String getCodeUe() {
		return codeUe;
	}
	public void setCodeUe(String codeUe) {
		this.codeUe = codeUe;
	}
	@Override
	public String toString() {
		return "Diplome [idDiplome=" + idDiplome + ", semestre=" + semestre + ", volumehoraire=" + volumehoraire
				+ ", codeUe=" + codeUe + ", ueId=" + ueId + "]";
	}
	
	//Mapping
	public Long getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	
	
}