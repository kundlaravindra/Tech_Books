package com.deepak.threadDemo.main;

public class ThreadDemo extends Thread{

	
	public static void main(String[] args){
		ThreadDemo A = new ThreadDemo();
		A.start();
		//A.run();
		/*synchronized (ThreadDemo.class) {
			try {
				A.wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
	}
	
	@Override
	public void run() {
		System.out.println("Inside run...");
		method();
	}
	
	public synchronized void method(){
		System.out.println("Inside method");
		try {
			wait();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
