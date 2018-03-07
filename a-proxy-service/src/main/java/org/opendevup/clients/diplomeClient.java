package org.opendevup.clients;

import java.util.Collection;

import org.opendevup.entities.Diplome;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("diplome-service")
public interface diplomeClient{
	@GetMapping("/diplomes/{idDiplome}")
	Collection<Diplome> getDips(@PathVariable("idDiplome") String idDiplome);
	
	
	@GetMapping("/diplomebyidEnseignant/{idEnseignant}")
	Collection<Diplome> getdiplomeByEnseignant(@PathVariable("idEnseignant")Long idEnseignant);
	
}