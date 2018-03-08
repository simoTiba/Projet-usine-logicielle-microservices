package org.opendevup.entities;


public class Service {

	private String ueId;
	private int realise,previsionel,bilan; 
	
	//Pour Mapping Enseignnt
	private Long idEnseignant;
	
	//Pour Mapping Diplome
	private String idDiplome;
	


	
	public Service(String ueId, int realise, int previsionel, int bilan, Long idEnseignant, String idDiplome) {
		super();
		this.ueId = ueId;
		this.realise = realise;
		this.previsionel = previsionel;
		this.bilan = bilan;
		this.idEnseignant = idEnseignant;
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

	
	public int getRealise() {
		return realise;
	}

	public void setRealise(int realise) {
		this.realise = realise;
	}

	public int getPrevisionel() {
		return previsionel;
	}

	public void setPrevisionel(int previsionel) {
		this.previsionel = previsionel;
	}

	public int getBilan() {
		return bilan;
	}

	public void setBilan(int bilan) {
		this.bilan = bilan;
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