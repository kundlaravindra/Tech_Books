/**
 * 
 */
package com.deepak.threadDemo.thread;

import com.deepak.threadDemo.resource.Resource;

/**
 * @author kumadeep
 *
 */
public class Consumer implements Runnable{

	Resource resource;
	
	public Consumer(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {

		for(int i=0;i < 10; i++){
			this.resource.get();
			System.out.println(i);
		}
	}
}
