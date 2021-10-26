/**
 * 
 */
package com.deepak.cdl;

import java.util.concurrent.CountDownLatch;

/**
 * @author kumadeep
 *
 */
public class CountDownLatchThread implements Runnable{
	
	int startTime;
	CountDownLatch cdl;
	
	public CountDownLatchThread(int startTime, CountDownLatch cdl) {
		this.startTime = startTime;
		this.cdl = cdl;
	}

	@Override
	public void run() {
		try {
			System.out.println("Waiting" + Thread.currentThread());
			Thread.sleep(startTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Starting countDown" + Thread.currentThread() + "Count : " + this.cdl.getCount());
		this.cdl.countDown();
		System.out.println("Wait Over : " + Thread.currentThread());
	}
	
	

}
