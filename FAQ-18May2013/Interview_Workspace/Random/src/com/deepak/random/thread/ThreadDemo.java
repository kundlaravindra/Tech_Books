/**
 * 
 */
package com.deepak.random.thread;

/**
 * @author indkumar07
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread();
		t.start();
		t.wait(1500);	
		System.out.println("Abcskjn");
	}

}
