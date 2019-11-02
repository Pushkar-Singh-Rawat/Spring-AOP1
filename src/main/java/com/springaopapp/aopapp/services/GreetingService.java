package com.springaopapp.aopapp.services;

import org.springframework.stereotype.Service;

import com.springaopapp.aopapp.aopconfig.LogHit;

@Service
public class GreetingService {

	@LogHit
	public String displayGreeting() {
		return "hello world";
	}
}
