package com.deepak.cb;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {

	public static void main(String[] args) {

		CyclicBarrier cb =new CyclicBarrier(4, new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Common point reached...");
			}
		});
		
		
		
		Thread t1 = new Thread(new CyclicThread(cb));
		Thread t2 = new Thread(new CyclicThread(cb));
		Thread t3 = new Thread(new CyclicThread(cb));
		Thread t4 = new Thread(new CyclicThread(cb));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
