package org.opendevup.entities;

import java.util.Collection;
import org.opendevup.entities.Diplome;
import org.opendevup.entities.Enseignant;
import org.opendevup.entities.Service;

public class proxy{
	private String ueId;
	private String idDiplome;
	private Long idEnseignant;
	
	private Collection<Enseignant> enseignants;
	private Collection<Diplome> dips;
	private Collection<Service> Service;
	
//	public proxy(Collection<Diplome> dips) {
//		super();
//		this.dips = dips;
//	} 

	public proxy(String ueId, Collection<Service> Service, Collection<Diplome> diplomes) {
		super();
		this.ueId = ueId;
		this.dips = diplomes;
		this.Service = Service;
	}
	
	public proxy(Long idEnseignant, Collection<Service> Service, Collection<Enseignant> ens )
	{
		super();
		this.idEnseignant = idEnseignant;
		this.Service = Service;
		this.enseignants = ens;
	}
	
	public String getUeId() {
		return ueId;
	}
	
	public Long getidEnseignant() {
		return idEnseignant;
	}

	public String getIdDiplome() {
		return idDiplome;
	}

	public void setIdDiplome(String idDiplome) {
		this.idDiplome = idDiplome;
	}

	public Collection<Enseignant> getEnseignants() {
		return enseignants;
	}
	public Collection<Diplome> getDips() {
		return dips;
	}
	public Collection<Service> getService() {
		return Service;
	}

	
}
