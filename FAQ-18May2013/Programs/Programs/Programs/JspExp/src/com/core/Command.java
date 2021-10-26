package com.core;


public class Command extends Thread implements Runnable{
	
	public static void main(String[] args) {
Command c=new Command();
		
		Thread t=new Thread(c);
		//extends Thread 
		Thread t1=new Thread();
	 t.start();
	 c.start();
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
