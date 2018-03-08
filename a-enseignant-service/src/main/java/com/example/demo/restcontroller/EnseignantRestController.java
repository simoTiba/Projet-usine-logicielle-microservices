package com.example.demo.restcontroller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Enseignant;
import com.example.demo.repository.EnseignantRepository;

@CrossOrigin
public @RestController
class EnseignantRestController{
	@Autowired
	private EnseignantRepository enseignantRepository;
	
	public static final Logger logger = LoggerFactory.getLogger(EnseignantRestController.class);

	/**************** AFICHAGE ****************************/
	@RequestMapping("/enseignants/{idEnseignant}")
	Collection<Enseignant> Enseignants(@PathVariable Long idEnseignant){
		return this.enseignantRepository.findByidEnseignant(idEnseignant);
	}
	
	/**************** AJOUTER ****************************/
	@PostMapping("/addEnseignant")
    public ResponseEntity <?> addEnseignant(@RequestBody Enseignant ens) {
		enseignantRepository.save(ens);
            return ResponseEntity.status(HttpStatus.CREATED).build();
    }
	
	/**************** SUPPRIMER ****************************/
	@DeleteMapping("/deleteEnseignants/{idEnseignant}")
	public void deleteEnseignant(@PathVariable Long idEnseignant) {
		enseignantRepository.deleteEnseignantsByidEnseignant(idEnseignant);
	}
	
	/**************** PUT ****************************/
	@PutMapping("/enseignants/info")
	public @ResponseBody String updateEnseignant(@RequestBody Enseignant ens){
	 logger.info(ens.toString());
	 return "ok";
	}
	
}
