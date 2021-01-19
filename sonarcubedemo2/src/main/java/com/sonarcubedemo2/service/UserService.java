package com.sonarcubedemo2.service;

import java.util.List;

import com.sonarcubedemo2.entity.User;

public interface UserService {

	public User createUser(User user);
	
	public List<User> getAllUsers();
}
