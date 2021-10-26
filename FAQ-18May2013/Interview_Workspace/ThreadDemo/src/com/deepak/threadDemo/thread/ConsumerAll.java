/**
 * 
 */
package com.deepak.threadDemo.thread;

import com.deepak.threadDemo.resource.Resource;

/**
 * @author kumadeep
 *
 */
public class ConsumerAll implements Runnable{

	Resource resource;
	
	public ConsumerAll(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {

		for(int i=0;i < 10; i++){
			this.resource.getAll();
			System.out.println(i);
		}
	}
}