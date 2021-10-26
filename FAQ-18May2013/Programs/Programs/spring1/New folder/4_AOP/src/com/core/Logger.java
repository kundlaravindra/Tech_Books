package com.core;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
	
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

}
