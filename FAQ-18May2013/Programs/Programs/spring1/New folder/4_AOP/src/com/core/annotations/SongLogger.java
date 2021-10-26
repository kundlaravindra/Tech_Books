package com.core.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class SongLogger {

	@Pointcut("execution(* com.core.annotations.Singer.sing(String)) && args(song))")
	public void per(String song){}
	
	
	@Around("per(song)")
	public void songLogger(ProceedingJoinPoint jp,String song)
	{
		System.out.println("Logging: Starting song " +  song);
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Logging: Ending song " + song);
	}

}
