/**
 * 
 */
package com.deepak.random.producerConsumer;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author indkumar07
 *
 */
public class Resource {
	
	LinkedBlockingQueue<Integer> list = new LinkedBlockingQueue<Integer>(5);
	LinkedList<Integer> list1 = new LinkedList<Integer>();
	boolean isProduced = false;
	String data = "EMPTY";
	
	public synchronized void put(String data){
		if(isProduced){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			this.data = data;
			isProduced = true;
			notify();
			System.out.println("Produced : " + this.data);
		}
	}
	
	public synchronized String get(){
		if(!isProduced){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			String data = this.data;
			this.data = "EMPTY";
			isProduced = false;
			notify();
			System.out.println("Comsumed : " + this.data);
			return data;
		}
		return data;
	}

}
