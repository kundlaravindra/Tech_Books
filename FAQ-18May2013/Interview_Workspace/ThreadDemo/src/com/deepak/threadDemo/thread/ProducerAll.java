/**
 * 
 */
package com.deepak.threadDemo.thread;

import com.deepak.threadDemo.resource.Resource;

/**
 * @author kumadeep
 *
 */
public class ProducerAll implements Runnable{

	Resource resource;
	
	public ProducerAll(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for(int i=0; i <10 ; i++){
			this.resource.putAll();
			System.out.println(i);
		}
	}
}
