package com.elitech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.model.User;

@RestController
public class UserController {
	@GetMapping("user")
	public String sayHello()
	{
		return "<h2>Welcome User</h2>";
	}
	@PostMapping("user")
	public String getOneUser(@RequestBody User user)
	{
		String remarque="";
		
		if(user.getAge()>=18)
			remarque="majeur";
		else
			remarque="mineur";
		return user.toString()+" est "+remarque;
	}
}
