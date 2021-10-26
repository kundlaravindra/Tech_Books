/**
 * 
 */
package com.deepak.random.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author kumadeep
 *
 */
public class FutureDemo {

	
	private static ExecutorService threadPool = Executors.newFixedThreadPool(3);
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Factorial fact = new Factorial(5);
		
		Future future = threadPool.submit(fact);
		
		while(!future.isDone()){
			System.out.println("Task not completed yet.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Task is complete,Check Result");
		
		long factorial=0;
		try {
			factorial = (Long) future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("factorial : " + factorial);
		threadPool.shutdown();
		
	}

}
