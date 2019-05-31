package com.workbee.userRestApi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workbee.userRestApi.config.ResourceNotFoundException;
import com.workbee.userRestApi.dao.CibleRepository;
import com.workbee.userRestApi.entity.Cible;
import com.workbee.userRestApi.entity.User;

@RequestMapping("/api/auth")
@RestController
@CrossOrigin(origins = "*")
public class CibleController {

    @Autowired
    private CibleRepository cibleRepository;
  
    @GetMapping("/cibles")
    public List<Cible> getAllCibles() {
        return cibleRepository.findAll();
    }
    
    
    
    
    
    @PostMapping("/cible")
    void addCible(@RequestBody Cible cible) {
        cibleRepository.save(cible);

    }
   

    }
    
    
    
