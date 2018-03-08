package com.example.demo.repository;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Enseignant;

public @RepositoryRestResource
interface EnseignantRepository extends JpaRepository<Enseignant, Long>{
	Collection<Enseignant> findByidEnseignant(Long idEnseignant);
	
	@Modifying
    @Transactional
    @Query("delete from Enseignant e where e.idEnseignant = ?1")
    void deleteEnseignantsByidEnseignant(Long idEnseignant);
}
