package org.opendevup.repository;


import java.util.Collection;

import javax.transaction.Transactional;

import org.opendevup.entity.Diplome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DiplomeRepository extends JpaRepository<Diplome, String>{
	Collection<Diplome> findByidDiplome(String idDiplome);
	
	Collection<Diplome> findByidEnseignant (Long idEnseignant);
	
	@Modifying
    @Transactional
    @Query("delete from Diplome d where d.idDiplome = ?1")
    void deleteDiplomesByidDiplome(String idDiplome);
	
}
