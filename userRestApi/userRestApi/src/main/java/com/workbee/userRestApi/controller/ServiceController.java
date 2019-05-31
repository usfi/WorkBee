package com.workbee.userRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workbee.userRestApi.dao.ServiceRepository;
import com.workbee.userRestApi.entity.Service;


@RequestMapping("/api/auth")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ServiceController {
	@Autowired
    private ServiceRepository serviceRepository;

    @GetMapping("/services")
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }
}

