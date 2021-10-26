/**
 * 
 */
package com.deepak.random.synchronization;

/**
 * @author kumadeep
 *
 */
public class EvenOddMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Resource resource = new Resource();
		Thread t1 = new Thread(new Odd(resource));
		Thread t2 = new Thread(new Even(resource));
		
		t1.start();
		t2.start();
	}

}
