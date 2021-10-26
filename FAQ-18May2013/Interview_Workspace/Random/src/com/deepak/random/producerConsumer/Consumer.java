package com.deepak.random.producerConsumer;

public class Consumer extends Thread{
	
	Resource resource = null;
	
	public Consumer(Resource resource) {
		this.resource = resource;
		this.start();
	}
	
	public void run(){
		for (int i = 0; i < 50; i++) {
			this.resource.get();
		}
	}

}
