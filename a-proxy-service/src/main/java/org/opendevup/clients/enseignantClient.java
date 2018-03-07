package org.opendevup.clients;

import java.util.Collection;

import org.opendevup.entities.Enseignant;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("enseignant-service")
public interface enseignantClient{
	@GetMapping("/enseignants/{idEnseignant}")
	Collection<Enseignant> getEnseignats(@PathVariable("idEnseignant") Long idEnseignant);
}
