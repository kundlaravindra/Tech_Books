package com.core;

import org.aspectj.lang.ProceedingJoinPoint;

public class SongLogger {
	
	public void songLogger(ProceedingJoinPoint jp,String song1)
	{
		System.out.println("Logging: Starting " +  song1);
		
		try {
				String str = (String)jp.proceed();
				System.out.println("Return value " +  str);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Logging: Ending " + song1);
	}

}
