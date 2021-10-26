/**
 * 
 */
package com.deepak.semaphore.resource;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

/**
 * @author kumadeep
 *
 */
public class GetConnection implements Runnable{
	
	Semaphore semaphore = null;

	public GetConnection(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	
	public void getConnection(){
	}


	@Override
	public void run() {
		
		System.out.println("Getting Connection");
		for(int i =0 ; i< 5 ; i++){
			try {
				System.out.println(Thread.currentThread().toString() + " Acquiring : " + this.semaphore.availablePermits() );
				this.semaphore.acquire();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/*public void releaseConnection() throws InterruptedException{
		System.out.println("Release Connection : " + this.semaphore.availablePermits());
		this.semaphore.release();
		Thread.sleep(1000);
		//return this.semaphore.availablePermits();
	}*/

}
