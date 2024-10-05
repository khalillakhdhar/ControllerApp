package com.elitech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//post get put (PATCH) delete 
// Get default method
// spring default (localhost:8080)
@RestController
public class HomeController {
	@GetMapping("")
	public String sayHello()
	{
		return "Welcome home";
	}
	
	@GetMapping("named")
	public String welcomeMe(@RequestParam(required = false) String nom,@RequestParam(required = false,defaultValue = "user") String prenom)
	{
		return "hello "+nom+" "+prenom;
		
	}
	@GetMapping("search/{id}")
	public String findMe(@PathVariable long id)
	{
		return "user number "+id;
	}
	
	
//
//	@GetMapping("web2")
//	public String welcome() {
//		return "welcome.html";
//	}
}
