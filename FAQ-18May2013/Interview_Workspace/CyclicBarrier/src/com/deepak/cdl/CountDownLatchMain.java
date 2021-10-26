/**
 * 
 */
package com.deepak.cdl;

import java.util.concurrent.CountDownLatch;

/**
 * @author kumadeep
 *
 */
public class CountDownLatchMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CountDownLatch cdl = new CountDownLatch(3);
		
		Thread t1 = new Thread(new CountDownLatchThread(1000, cdl));
		Thread t2 = new Thread(new CountDownLatchThread(1000, cdl));
		Thread t3 = new Thread(new CountDownLatchThread(1000, cdl));
		
		t1.start();
		t2.start();
		t3.start();
		
		try { 
			System.out.println("AWaiting ..." + Thread.currentThread());
			cdl.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Running..." + Thread.currentThread());
	}

}
