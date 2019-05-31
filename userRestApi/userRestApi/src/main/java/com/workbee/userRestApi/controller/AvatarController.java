package com.workbee.userRestApi.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.workbee.userRestApi.dao.AvatarRepository;
import com.workbee.userRestApi.entity.Avatar;


import java.util.List;

@RequestMapping("/api/auth")
@RestController
public class AvatarController {

    @Autowired
    private AvatarRepository avatarRepository;

    @GetMapping("/avatars")
    public List<Avatar> getAllAvatars() {
        return avatarRepository.findAll();
    }
/*
    @PostMapping("/avatars")
    public Avatar createAvatar(@Valid @RequestBody Avatar avatar) {
        return AvatarRepository.save(avatar);
    }*/


}
