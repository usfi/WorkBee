package com.workbee.userRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workbee.userRestApi.entity.Projet;



@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long>{
	Projet findById(Long projetId);
	
}
