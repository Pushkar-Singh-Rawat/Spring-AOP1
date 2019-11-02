package com.springaopapp.aopapp.aopconfig;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutsDef {

	@Pointcut("execution(public String com.springaopapp.aopapp.services.GreetingService.displayGreeting())")
	public void logIntialGreetings() {
		
	}
	
	@Pointcut("execution(* com.springaopapp.aopapp.services.GreetingService.*(..))")
	public void doSomethingElse() {
		
	}
	
	@Pointcut("@annotation(com.springaopapp.aopapp.aopconfig.LogHit)")
	public void doSomethingWithAnnotatedMethods() {
		
	}
}
