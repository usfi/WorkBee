package com.workbee.userRestApi.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.workbee.userRestApi.dao.ProjetRepository;
import com.workbee.userRestApi.entity.Projet;


@Service("projetService")
public class ProjetService {
	@Autowired
	ProjetRepository projetRepository;

	public void save(Projet projet) {
		projetRepository.save(projet);
	}





}
