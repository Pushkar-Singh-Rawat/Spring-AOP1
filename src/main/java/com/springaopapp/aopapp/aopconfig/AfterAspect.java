package com.springaopapp.aopapp.aopconfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

	Logger logger=LoggerFactory.getLogger(this.getClass());
	@After("com.springaopapp.aopapp.aopconfig.PointcutsDef.doSomethingElse()")
	public void logAfterEndpointHit(JoinPoint joinpoint) {
		logger.info("endpoint has been hit with join point being {}",joinpoint);
	}
	@After("com.springaopapp.aopapp.aopconfig.PointcutsDef.doSomethingWithAnnotatedMethods()")
	public void logAfterAnnotatedMethodHit(JoinPoint joinpoint) {
		logger.info("endpoint has been hit and exe for annotated method for joinpoint {}",joinpoint);
	}
	
	
}
