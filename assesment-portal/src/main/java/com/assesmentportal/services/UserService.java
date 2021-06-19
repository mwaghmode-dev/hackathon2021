package com.assesmentportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesmentportal.model.User;
import com.assesmentportal.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User getUser(String id) {
		return userRepository.findOne(id);
	}

	public boolean addUser(User user) {
		userRepository.save(user);
		return true;
	}

	public List<User> getAllUsers() {
		return (List<User>)userRepository.findAll();
	}

	public boolean updateUser(User user) {
		userRepository.save(user);
		return true;
	}
}
