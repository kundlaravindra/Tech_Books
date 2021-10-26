package com.core.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;

@Aspect
public class Logger implements Ordered {
	
	@Pointcut("execution(* com.core.annotations.Performer.perform(..))")
	public void per(){}
	
	
	@Around("per()")
	public void logMethod(ProceedingJoinPoint jp)
	{
		System.out.println("Logging: Performance Entry");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Logging: Performance Exit");
		
	}


	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
  
}
