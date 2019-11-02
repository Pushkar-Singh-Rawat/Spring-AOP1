package com.springaopapp.aopapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springaopapp.aopapp.services.GreetingService;

@RestController
@RequestMapping("/api/v1/")

public class RestControllers {

	@Autowired
	private GreetingService service;
	
	@GetMapping("greet")
	public String getInfo() {
		
		return service.displayGreeting();
	}
}
