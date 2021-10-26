/**
 * 
 */
package com.deepak.random.producerConsumer;

/**
 * @author indkumar07
 *
 */
public class Producer extends Thread{
	
	Resource resource = null;
	
	public Producer(Resource resource) {
		this.resource = resource;
		this.start();
	}
	
	public void run(){
		for (int i = 0; i < 50; i++) {
			this.resource.put("DATA ADDED");
		}
	}

}
