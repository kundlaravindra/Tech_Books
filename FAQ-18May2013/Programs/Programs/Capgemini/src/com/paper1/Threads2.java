package com.paper1;

public class Threads2 implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Thread t = new Thread();
Threads2 f = new Threads2();
new Thread(f).start();
new Thread(f).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

}
