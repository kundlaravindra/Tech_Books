/**
 * 
 */
package com.deepak.threadDemo.thread;

import com.deepak.threadDemo.resource.Resource;


/**
 * @author kumadeep
 *
 */
public class Even extends Thread{

	Resource resource;
	
	public Even(Resource resource) {
		this.resource = resource;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			this.resource.printEven();
		}
		
		//this.resource.printEven();
	}
}
