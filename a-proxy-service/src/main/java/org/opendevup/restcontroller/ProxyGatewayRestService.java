package org.opendevup.restcontroller;

import java.util.Collection;
import org.opendevup.clients.IntegrationClient;
import org.opendevup.entities.Diplome;
import org.opendevup.entities.Enseignant;
import org.opendevup.entities.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@Configuration
class Myconfiguration{
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}

@CrossOrigin
@RestController
public class ProxyGatewayRestService {

	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String available() {
		return "Welcome To Proxy Service!";
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private IntegrationClient integrationClient;
	
	/***************** AFFICHAGE *****************/
	@CrossOrigin
	@GetMapping("/diplomes")
	public Collection<Diplome> listDiplomes(){
		ParameterizedTypeReference<Resources<Diplome>> responseType= new ParameterizedTypeReference<Resources<Diplome>>() { };
		return restTemplate.exchange("http://diplome-service/diplomes", HttpMethod.GET, null,responseType).getBody().getContent();
	}
	
	@CrossOrigin
	@GetMapping("/enseignants")
	public Collection<Enseignant> listEnseignants(){
		ParameterizedTypeReference<Resources<Enseignant>> responseType= new ParameterizedTypeReference<Resources<Enseignant>>() { };
		return restTemplate.exchange("http://enseignant-service/enseignants", HttpMethod.GET, null,responseType).getBody().getContent();
	}
	
	@CrossOrigin
	@GetMapping("/services")
	public Collection<Service> listServices(){
		ParameterizedTypeReference<Resources<Service>> responseType= new ParameterizedTypeReference<Resources<Service>>() { };
		return restTemplate.exchange("http://services-service/services", HttpMethod.GET, null,responseType).getBody().getContent();
	}

	@CrossOrigin
	@GetMapping("/diplome-service/diplomeByidEnseignant/{idEnseignant}")
	public void diplomeByidEnseignant(@PathVariable Long idEnseignant) { }
	
	@CrossOrigin
	@GetMapping("/services-service/serviceByEnseignant/{idEnseignant}")
	public void serviceByEnseignant(@PathVariable Long idEnseignant) { }

	@CrossOrigin
	@GetMapping("/services-service/serviceByDiplome/{idDiplome}")
	public void serviceByDiplome(@PathVariable String idDiplome) { }
	
	@CrossOrigin
	@GetMapping("diplomesProxy/{idDiplome}")
	Collection<Diplome> getDiplomeByUeId(@PathVariable String idDiplome) { 
	   return this.integrationClient.getDips(idDiplome);
	}
	
	@CrossOrigin
	@GetMapping("servicesProxy/{ueId}")
	Collection<Service> getServicesByUeId(@PathVariable String ueId) { 
	   return this.integrationClient.getService(ueId);
	}
	
	@CrossOrigin
	@GetMapping("enseignantProxy/{idEnseignant}")
	Collection<Enseignant> getEnseignantByid(@PathVariable Long idEnseignant) { 
	   return this.integrationClient.getEnseignants(idEnseignant);
	}
	
	/**************** AJOUTER DIPLOME & SERVICE & ENSEIGNANT****************************/
	@CrossOrigin
	@PostMapping("/addDiplomeProxy")
	public void addDiplome(@RequestBody Diplome dip) {
		HttpEntity<Diplome> responseType = (HttpEntity<Diplome>) new HttpEntity<>(dip);
		restTemplate.exchange("http://diplome-service/addDiplome", HttpMethod.POST, responseType, Diplome.class);
	}
	
	@CrossOrigin
	@PostMapping("/addServiceProxy")
	public void addService(@RequestBody Service service) {
		HttpEntity<Service> responseType = (HttpEntity<Service>) new HttpEntity<>(service);
		restTemplate.exchange("http://services-service/addService", HttpMethod.POST, responseType, Service.class);
	}

	@CrossOrigin
	@PostMapping("/addEnseignantProxy")
	public void addEnseignant(@RequestBody Enseignant ens) {
		HttpEntity<Enseignant> responseType = (HttpEntity<Enseignant>) new HttpEntity<>(ens);
		restTemplate.exchange("http://enseignant-service/addEnseignant", HttpMethod.POST, responseType, Enseignant.class);
	}
	
	/**************** SUPPRIMER DIPLOME & SERVICE & ENSEIGNANT ****************************/
	@CrossOrigin
	@DeleteMapping("/deleteDiplomesProxy/{idDiplome}")
	public void deleteDiplome(@PathVariable String idDiplome) {
		restTemplate.delete("http://diplome-service/deleteDiplomes/{idDiplome}",idDiplome);
	}
	
	@CrossOrigin
	@DeleteMapping("/deleteServicesProxy/{ueId}")
	public void deleteService(@PathVariable String ueId) {
		restTemplate.delete("http://services-service/deleteServices/{ueId}",ueId);
	}

	@CrossOrigin
	@DeleteMapping("/deleteEnseignantProxy/{idEnseignant}")
	public void deleteEnseignant(@PathVariable Long idEnseignant) {
		restTemplate.delete("http://enseignant-service/deleteEnseignants/{idEnseignant}",idEnseignant);
	}
	
	
	/**************** PUT DIPLOME & SERVICE & ENSEIGNANT****************************/
	@CrossOrigin
	@PutMapping("/diplomesProxy/info")
	public @ResponseBody String updateDiplome(@RequestBody Diplome diplome){
	 restTemplate.put("http://diplome-servic/diplomes/info", diplome);
	 return "ok";
	}
	
	@CrossOrigin
	@PutMapping("/servicesProxy/info")
	public @ResponseBody String updateService(@RequestBody Service service){
	 restTemplate.put("http://services-servic/services/info", service);
	 return "ok";
	}

	@CrossOrigin
	@PutMapping("/enseignantProxy/info")
	public @ResponseBody String updateEnseignant(@RequestBody Enseignant ens){
	 restTemplate.put("http://enseignant-servic/enseignants/info", ens);
	 return "ok";
	}
//	/***************MAPPING ENTRE DIPLOME ET SERVICE******************/
//	@GetMapping("/serviceByDiplome/{ueId}")
//	 proxy proxy(@PathVariable String ueId) { 
//	   return new proxy(ueId, this.integrationClient.getService(ueId), this.integrationClient.getdiplomeByService(ueId));
//		}
//	
//
//	/***************MAPPING ENTRE ENSEINGNAT ET SERVICE******************/
//	
//	@GetMapping("/servicesByEnseignant/{idEnseignant}")
//	proxy proxy1(@PathVariable Long idEnseignant){
//		return new proxy(idEnseignant, this.integrationClient.getserviceByEnseignant(idEnseignant), this.integrationClient.getEnseignants(idEnseignant));
//	}
}

