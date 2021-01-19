package com.sonarcubedemo2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.sonarcubedemo2.entity.User;
import com.sonarcubedemo2.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes ={MyTest1.class})
public class LoginTest {

	@Autowired
	private UserService userService;
	
	User user;
	
	@Before
	public void setUp()
	{
		user=new User(12,"Ram","Ram@123","Ram@123");
	}
	
	@Test
	public void validateCreateUser()
	{
	   userService.createUser(user);
	}
	
	@Test
	public void validateGetAllUsers()
	{
		assertEquals(2,userService.getAllUsers().size());
	}
	
	@Test
	public void checkMethodThree()
	{
		
	}
}
