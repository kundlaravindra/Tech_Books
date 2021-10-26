package com.core;

public class Raj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Command c=new Command();
		
		
		Thread t=new Thread(c);
		//extends Thread 
		Thread t1=new Thread();
	 t.start();
	 c.start();
	}
	
	catch( Exception e){
		
	}
}
}