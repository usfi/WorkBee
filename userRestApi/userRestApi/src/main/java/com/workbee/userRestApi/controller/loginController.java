package com.workbee.userRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.workbee.userRestApi.dao.LoginRepository;

import com.workbee.userRestApi.entity.Login;

@RequestMapping("/api/auth")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class loginController {
    @Autowired
    private LoginRepository loginRepository;
  
    @GetMapping("/login")
    public List<Login> getAllLogin() {
        return loginRepository.findAll();
    }
    @PostMapping("/login")
    void addLogin(@RequestBody Login login) {
        loginRepository.save(login);

    }
}
