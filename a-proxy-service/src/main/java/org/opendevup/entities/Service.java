package org.opendevup.entities;

public class Service {

 	private String ueId;
	private boolean realise; 
	private String previsionel;
	private String etat;
	
	//Pour Mapping
	private Long idEnseignant;

	public Service(String ueId, String previsionel, String etat, Long idEnseignant) {
		super();
		this.ueId = ueId;
		this.previsionel = previsionel;
		this.etat = etat;
		this.idEnseignant = idEnseignant;
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

	public Long getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	
}