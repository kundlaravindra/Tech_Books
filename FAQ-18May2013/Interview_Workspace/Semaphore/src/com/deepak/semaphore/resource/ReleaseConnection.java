/**
 * 
 */
package com.deepak.semaphore.resource;

import java.util.concurrent.Semaphore;

/**
 * @author kumadeep
 *
 */
public class ReleaseConnection implements Runnable {

	Semaphore semaphore = null;
	
	public ReleaseConnection(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	public void releaseConnection(){
		
	}

	@Override
	public void run() {
		System.out.println("Releasing Connection");
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().toString() + " Releasing : " + this.semaphore.availablePermits() );
				Thread.sleep(1000);
				this.semaphore.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
