package com.elitech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("user")
	public String sayHello()
	{
		return "<h2>Welcome User</h2>";
	}
}
