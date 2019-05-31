package com.workbee.userRestApi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workbee.userRestApi.config.ResourceNotFoundException;
import com.workbee.userRestApi.dao.ProjetRepository;
import com.workbee.userRestApi.entity.Projet;
import com.workbee.userRestApi.entity.User;






@RequestMapping("/api/auth")
@RestController
@CrossOrigin(origins = "*")
public class ProjetController {

    @Autowired
    private ProjetRepository projetRepository;

    @GetMapping("/projets")
    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

	 
	   @GetMapping("/projets/{id}")
	    public ResponseEntity<Projet> getProjetById(@PathVariable(value = "id") Long projetId)
	        throws ResourceNotFoundException {
	       Projet projet = projetRepository.findById(projetId);
	      
	        return ResponseEntity.ok().body(projet);
	    }
	   
		
		@PostMapping("/projets")
		public Projet CreateProjet(@Valid @RequestBody Projet projet) {
			return projetRepository.save(projet);
		}

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}

