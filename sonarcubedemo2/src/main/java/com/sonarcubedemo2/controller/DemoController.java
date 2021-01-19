package com.sonarcubedemo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sonarcubedemo2.entity.User;
import com.sonarcubedemo2.service.UserService;

@RestController
public class DemoController {

	@Autowired
	public UserService userService;
	
	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String sayHello()
	{
		//TODO
		String name;
		return "Welcome to Sonar Cube";
	}
	
	@PostMapping(value="/create")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User userObj=userService.createUser(user);
		
		return new ResponseEntity<>(userObj,new HttpHeaders(),HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getall")
	public ResponseEntity<List<User>> getAllUsers()
	{
		List<User> users=userService.getAllUsers();
		return new ResponseEntity<>(users,new HttpHeaders(),HttpStatus.OK);
	}
}
