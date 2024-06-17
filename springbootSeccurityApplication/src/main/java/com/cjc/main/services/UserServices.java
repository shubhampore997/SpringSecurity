package com.cjc.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cjc.main.model.User;

@Service
public class UserServices {

	List<User> list = new ArrayList<>();

	public UserServices() {
		
		list.add(new User("Shubham","abcdef","shubhampore997@gmail.com"));
		list.add(new User("Piyush","pore","pore997@gmail.com"));
		list.add(new User("pravin","gire","pravin@gmail.com"));
		}
	
	// get all users
	public List<User> getallUser(){
		return this.list;
	}

	//get single users
	public User getUser(String usernamre) {
		return this.list.stream().filter((user)->user.getUsername().equals(usernamre)).findAny().orElse(null);
		
	}
	
	
	// add new user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
	
	
}
