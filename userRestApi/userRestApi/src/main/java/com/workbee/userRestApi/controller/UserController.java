package com.workbee.userRestApi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.workbee.userRestApi.dao.UserRepository;
import com.workbee.userRestApi.entity.User;

@RequestMapping("/api/auth")
@RestController
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	/*
	 * @PostMapping("/connect") public List<User> connect(@RequestBody String email,
	 * String password) {
	 * System.out.println("I m heeeeere amounti el mezyennaa and i m working ;) ");
	 * System.out.println("No bugg yopiii ;) "); return userRepository.findAll(); }
	 */

	@PostMapping("/connect")
	public Boolean connect(@RequestParam String email, @RequestParam String password) {
		User user = userRepository.findByEmailAndPassword(email, password);
		if (user == null) {
			return false;
		} else {
			return true;
		}
	}

	
	@GetMapping("/users")
	public List<User> users() {
		return userRepository.findAll();
	}

	@PostMapping("/users")
	public User CreateUser(@Valid @RequestBody User user) {
		return userRepository.save(user);
	}

}
