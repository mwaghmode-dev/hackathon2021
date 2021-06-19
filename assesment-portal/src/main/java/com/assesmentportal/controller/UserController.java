package com.assesmentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assesmentportal.model.User;
import com.assesmentportal.services.UserService;

@RestController
@RequestMapping(value = "/api/assesmentportal", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable String id){
		return userService.getUser(id);
	}

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}

	@PostMapping("/users")
	public boolean addUser(@RequestBody User user){
		return userService.addUser(user);
	}

	@PutMapping("/users")
	public boolean updateUser(@RequestBody User user){
		return userService.updateUser(user);
	}
}
