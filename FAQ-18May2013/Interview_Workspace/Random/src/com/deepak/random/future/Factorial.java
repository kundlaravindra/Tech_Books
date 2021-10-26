/**
 * 
 */
package com.deepak.random.future;

import java.util.concurrent.Callable;

/**
 * @author kumadeep
 *
 */
public class Factorial implements Callable<Long>{

	private long number;

	
	public Factorial(long number) {
		this.number = number;
	}
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public Long call() throws Exception {
		System.out.println("Inside call...");
		return factorial(this.number);
	}

	
	private Long factorial(long n) throws InterruptedException{

		System.out.println("Inside factorial...");
		Long result =(long) 1;
		while(n>0){
			result = result * n;
			n--;
			Thread.sleep(1000);
		}
		
		return result;
	}
}
