package org.opendevup.clients;

import java.util.Collection;

import org.opendevup.entities.Service;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("services-service")
public interface serviceClient{
	@RequestMapping(method = RequestMethod.GET, value = "/services/{ueId}")
	Collection<Service> getService(@PathVariable("ueId") String ueId);
	
	@GetMapping("/serviceByEnseignant/{idEnseignant}")
	Collection<Service> getserviceByEnseignant(@PathVariable ("idEnseignant") Long idEnseignant);
}