package org.opendevup.entities;

public class Diplome{
	
	private String idDiplome;
	private String semestre;
	private String volumehoraire;
	private String codeUe;
	
	//Pour Maping avec Service
	private String ueId;
	private Long idEnseignant;
	
	public Diplome(String idDiplome, String semestre) {
		super();
		this.idDiplome = idDiplome;
		this.semestre = semestre;
	}
	public Diplome(String semestre) {
		super();
		this.semestre = semestre;
	}
	public Diplome() {
		super();
		
	}
	
	public Diplome(String idDiplome, String semestre, String volumehoraire, String codeUe, String ueId) {
		this.idDiplome=idDiplome;
		this.semestre=semestre;
		this.volumehoraire=volumehoraire;
		this.codeUe = codeUe;
		this.ueId = ueId;
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
	public Long getIdEnseignant() {
		return idEnseignant;
	}
	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	
}
