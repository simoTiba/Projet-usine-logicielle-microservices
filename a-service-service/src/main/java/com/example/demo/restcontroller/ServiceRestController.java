package com.example.demo.restcontroller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Service;
import com.example.demo.repository.ServiceRepository;

@CrossOrigin
@RestController
public class ServiceRestController{
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	public static final Logger logger = LoggerFactory.getLogger(ServiceRestController.class);

	@Autowired
	ServiceRestController(ServiceRepository serviceRepository) {
		this.serviceRepository = serviceRepository;
	}
	
	/**************** AFICHAGE ****************************/
	@GetMapping("/services/{ueId}")
	Collection<Service> ServiceByueId(@PathVariable String ueId){
		return this.serviceRepository.findByueId(ueId);
	}
	
	@GetMapping("/serviceByEnseignant/{idEnseignant}")
	Collection<Service> ServiceByidEnseignant(@PathVariable Long idEnseignant){
		return this.serviceRepository.findByidEnseignant(idEnseignant);
	}
	
	@GetMapping("/serviceByDiplome/{idDiplome}")
	Collection<Service> ServiceByidDiplome(@PathVariable String idDiplome){
		return this.serviceRepository.findByidDiplome(idDiplome);
	}
	
	
	/**************** AJOUTER ****************************/
	@PostMapping("/addService")
    public ResponseEntity <?> addService(@RequestBody Service service) {
		serviceRepository.save(service);
            return ResponseEntity.status(HttpStatus.CREATED).build();
    }
	
	/**************** SUPPRIMER ****************************/
	@DeleteMapping("/deleteServices/{ueId}")
	public void deleteService(@PathVariable String ueId) {
		serviceRepository.deleteServiceByUeId(ueId);
	}
	
	
	/**************** PUT ****************************/
	@PutMapping("/services/info")
	public @ResponseBody String updateService(@RequestBody Service service){
	 logger.info(service.toString());
	 return "ok";
	}
}
