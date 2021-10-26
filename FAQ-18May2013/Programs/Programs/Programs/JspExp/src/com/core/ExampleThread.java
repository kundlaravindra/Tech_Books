package com.core;

public class ExampleThread  {
	public void run(){
		System.out.println("this is run method");
	}
	public synchronized void wish(String name){
		
		for (int i = 0; i < 10; i++) {
			System.out.println("this is wish method");
			try {
				System.out.println(Thread.currentThread());
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("this is catch block");
			}
			
			System.out.println(name);
		}
		
	}

}










