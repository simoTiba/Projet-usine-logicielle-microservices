package org.opendevup.restcontroller;
import java.util.Collection;

import org.opendevup.entity.Diplome;
import org.opendevup.repository.*;
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

@CrossOrigin
@RestController
class DiplomeRestController{
	@Autowired
	private DiplomeRepository diplomeRepository;	
	
	public static final Logger logger = LoggerFactory.getLogger(DiplomeRestController.class);
	
	@Autowired
	DiplomeRestController(DiplomeRepository diplomeRepository) {
		this.diplomeRepository = diplomeRepository;
	}
	
	/**************** AFICHAGE ****************************/
	@GetMapping("/diplomes/{idDiplome}")
	Collection<Diplome> Diplomes(@PathVariable String idDiplome){
		return this.diplomeRepository.findByidDiplome(idDiplome);
	}
	
	@GetMapping("/diplomeByidEnseignant/{idEnseignant}")
	Collection<Diplome> findByidEnseignant(@PathVariable Long idEnseignant){
		return this.diplomeRepository.findByidEnseignant(idEnseignant);
	}
	
	/**************** AJOUTER ****************************/
	@PostMapping("/addDiplome")
    public ResponseEntity <?> addDiplome(@RequestBody Diplome dip) {
          diplomeRepository.save(dip);
            return ResponseEntity.status(HttpStatus.CREATED).build();
    }
	
	
	/**************** SUPPRIMER ****************************/
	@DeleteMapping("/deleteDiplomes/{idDiplome}")
	public void deleteDiplome(@PathVariable String idDiplome) {
		diplomeRepository.deleteDiplomesByidDiplome(idDiplome);
	}
	
	
	/**************** PUT ****************************/
	@PutMapping("/diplomes/info")
	public @ResponseBody String updateDiplome(@RequestBody Diplome diplome){
	 logger.info(diplome.toString());
	 return "ok";
	}

}