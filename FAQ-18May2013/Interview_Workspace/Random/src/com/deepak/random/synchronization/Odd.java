/**
 * 
 */
package com.deepak.random.synchronization;

/**
 * @author kumadeep
 *
 */
public class Odd implements Runnable{

	Resource resource = null;
	int i = 0;
	public Odd(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 10 ; i++){
			try {
				this.resource.printODD();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
