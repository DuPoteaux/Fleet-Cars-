package com.poto.main.services;

import java.util.List;


import com.poto.main.models.User;
import com.poto.main.repositories.UserRepository;

import org.springframework.security.crypto.bcrypt.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {

private BCryptPasswordEncoder encoder;




	private UserRepository userRepository;
	
	//Get All Users
	public List<User> findAll(){
		return userRepository.findAll();
	}	
	
	//Get User By Id
	public User findById(int id) {
		return userRepository.findById(id).orElse(null);
	}	
	
	//Delete User
	public void delete(int id) {
		userRepository.deleteById(id);
	}
	
	//Update User
	public void save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
	}
}
