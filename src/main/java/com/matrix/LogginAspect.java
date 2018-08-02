package com.matrix;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

	private static final Logger logger = Logger.getLogger(LogginAspect.class);
	
	@Pointcut(" (execution(* com.matrix.Department.*(..))) ||  (execution(* com.matrix.Person.*(..)))" )
	public void logAllMethod(){}
	
	@Around("logAllMethod()")
	public void logging(ProceedingJoinPoint pjp) throws Throwable{
		
		logger.info("args are :" +Arrays.toString(pjp.getArgs()));
		
		
		logger.info("entering into class :"+pjp.getSignature().getDeclaringTypeName()+ " executing method :"+pjp.getSignature().getName()
				+ " with args "+Arrays.toString(pjp.getArgs()));
		pjp.proceed();
		
		logger.info("exiting from class :"+pjp.getSignature().getDeclaringTypeName()+ " executing method :"+pjp.getSignature().getName()+ " with args "+Arrays.toString(pjp.getArgs()));
		
		
	}
	
}
