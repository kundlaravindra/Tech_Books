/**
 * 
 */
package com.deepak.threadDemo.thread;

import com.deepak.threadDemo.resource.Resource;

/**
 * @author kumadeep
 *
 */
public class Producer implements Runnable{

	Resource resource;
	
	public Producer(Resource resource) {
		this.resource = resource;
	}

	TreeSet td ;
	@Override
	public void run() {
		for(int i=0; i <10 ; i++){
			this.resource.put();
			System.out.println(i);
		}
	}
}
