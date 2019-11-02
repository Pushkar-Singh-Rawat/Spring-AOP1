package com.springaopapp.aopapp.aopconfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	@Before("com.springaopapp.aopapp.aopconfig.PointcutsDef.logIntialGreetings()")
	public void logInfo(JoinPoint joinPoint) {
		logger.info("Greeting endpoint is hit an the join point is {}",joinPoint);
	}
}
