package com.core;

import java.io.IOException;

import org.aspectj.lang.JoinPoint;

public class Audience1 {
	
	public void takeSeats(){
		System.out.println("The Audience is taking seats");
		
		
	}
	
	public void turnOffCellPhones(){
		System.out.println("The audience is turning off cell phones");
		
		
	}
	
	public void applaud(JoinPoint p, Object retVal)
	{
		System.out.println("The audience is applauding");
		System.out.println("Return value:" + (String)retVal);
		System.out.println("Signature:" + p.getSignature().getName());
		System.out.println("The audience is applauding"+p.getTarget());
		
	}
	
	public void demandRefund(Exception ex)
	{
		System.out.println("The audience is demanding refund" + ex);
		
		
		
	}

}
