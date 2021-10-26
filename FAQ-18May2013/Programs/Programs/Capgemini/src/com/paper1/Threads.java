package com.paper1;

public class Threads extends Thread{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Thread t = new Threads();
		t.yield();
		t.start();*/
		//Thread t = new Threads();
		Thread t = new Thread();
		t.setPriority(5);
		//t.setDaemon(true);
		t.start();

	}
public void run(){
	System.out.println("runing");
}
}
