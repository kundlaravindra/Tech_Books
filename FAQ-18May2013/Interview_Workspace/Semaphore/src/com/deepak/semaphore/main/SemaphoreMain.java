/**
 * 
 */
package com.deepak.semaphore.main;

import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import com.deepak.semaphore.resource.Connection;
import com.deepak.semaphore.resource.GetConnection;
import com.deepak.semaphore.resource.ReleaseConnection;

/**
 * @author kumadeep
 *
 */
public class SemaphoreMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t = null;
		Semaphore semaphore = new Semaphore(5);
		
		for(int i = 0 ; i < 10 ; i++){
			t = new Thread(new GetConnection(semaphore));
			t.start();
			
		}
		
		for (int i = 0; i < 10; i++) {
			t = new Thread(new ReleaseConnection(semaphore));
			t.start();
		}
		
		/*ExecutorService exec = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 200; i++) {
			exec.submit(new Runnable() {
				
				@Override
				public void run() {
					Connection.getInstance().connect();
				}
			});
		}
		
		exec.shutdown();
		try {
			exec.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
