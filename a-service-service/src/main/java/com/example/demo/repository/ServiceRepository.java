package com.example.demo.repository;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Service;

@RepositoryRestResource
public interface ServiceRepository extends JpaRepository<Service, String>{
	
	Collection<Service> findByueId(String ueId);
	
	Collection<Service> findByidEnseignant(Long idEnseignant);
	
	Collection<Service> findByidDiplome (String idDiplome);
	
	@Modifying
    @Transactional
    @Query("delete from Service s where s.ueId = ?1")
    void deleteServiceByUeId(String ueId);
}