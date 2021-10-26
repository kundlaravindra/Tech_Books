package com.core.annotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(* com.core.annotations.Performer.perform(..))")
	public void performance(){}
	
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("The Audience is taking seats");
		
		  
	}
	
	@Before("performance()")
	public void turnOffCellPhones(){
		System.out.println("The audience is turning off cell phones");
		
		
	}
	
	@AfterReturning("performance()")
	public void applaud()
	{
		System.out.println("The audience is applauding");
		
	}
	
	
	@AfterThrowing("performance()")
	
	public void demandRefund()
	{
		System.out.println("The audience is demanding refund");
		
		
		
	}

}
