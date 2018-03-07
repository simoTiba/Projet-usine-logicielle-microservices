package org.opendevup.clients;

import java.util.Arrays;
import java.util.Collection;

import org.opendevup.entities.Diplome;
import org.opendevup.entities.Enseignant;
import org.opendevup.entities.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
public class IntegrationClient {

    @Autowired
    private diplomeClient diplomeClient;
    
    @Autowired
    private serviceClient serviceClient;
    
    @Autowired
    private enseignantClient enseignantClient;
    

    public Collection<Diplome> getDiplomesFallback(String idDiplome) {
        System.out.println("getDiplomesFallback");
        return Arrays.asList();
    }

    @HystrixCommand(fallbackMethod = "getDiplomesFallback")
    public Collection<Diplome> getDips(String idDiplome) {
        return this.diplomeClient.getDips(idDiplome);
    }
    
    public Collection<Service> getServiceFallback(String ueId) {
        System.out.println("getServiceFallback");
        return Arrays.asList();
    }

    @HystrixCommand(fallbackMethod = "getServiceFallback")
    public Collection<Service> getService(String ueId) {
        return this.serviceClient.getService(ueId);
    }
    
    public Collection<Service> getServiceByEnseignantFallback(Long idEnseignant){
    	System.out.println("getServiceByEnseignantFallback");
    	return Arrays.asList();
    }
    
    @HystrixCommand(fallbackMethod="getServiceByEnseignantFallback")
    public Collection<Service> getserviceByEnseignant(Long idEnseignant){
    	return this.serviceClient.getserviceByEnseignant(idEnseignant);
    }
    
    public Collection<Enseignant> getEnseignantsFallback(Long idEnseignant){
    	System.out.println("getEnseignantsFallback");
    	return Arrays.asList();
    	
    }
    
    @HystrixCommand(fallbackMethod="getEnseignantsFallback")
    public Collection<Enseignant> getEnseignants(Long idEnseignant){
    	return this.enseignantClient.getEnseignats(idEnseignant);
    }     
    
    public Collection<Diplome> getdiplomesByEnseignantFallback(Long idEnseignant){
    	System.out.println("getdiplomesByEnseignantFallback");
    	return Arrays.asList();    	
    }
    
    @HystrixCommand(fallbackMethod="getdiplomesByEnseignantFallback")
    public Collection<Diplome> getdiplomeByEnseignant(Long idEnseignant){
    	return this.diplomeClient.getdiplomeByEnseignant(idEnseignant);
    }
}

