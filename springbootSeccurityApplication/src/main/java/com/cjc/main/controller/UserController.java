package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;
import com.cjc.main.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServices userservice;
	
	//all users ,
	@GetMapping("/")
	public List<User> getAllUsers(){
		return this.userservice.getallUser();
	}
	 
	// return single user
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userservice.getUser(username);
	}
	
	@PostMapping("/")
	public User add(@RequestBody User user) {
	  return this.userservice.addUser(user);	
	}
}
