package com.workbee.userRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workbee.userRestApi.dao.WriterRepository;

import com.workbee.userRestApi.entity.Writer;

@RequestMapping("/api/auth")
@RestController
public class WriterController { @Autowired
    private WriterRepository writerRepository;

    @GetMapping("/writers")
    public List<Writer> getAllUsers() {
        return writerRepository.findAll();
    }
}