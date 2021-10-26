/**
 * 
 */
package com.deepak.random.synchronization;

/**
 * @author kumadeep
 *
 */
public class Resource {

	int i;
	
	public Resource() {
		this.i = 0;
	}
	
	public synchronized void printODD() throws InterruptedException{
	
		if(i%2!=0){
			System.out.println(i);
			i++;
			notify();
		}else{
			wait();
		}
	}
	
	public synchronized void printEven() throws InterruptedException{
		
		if(i%2==0){
			System.out.println(i);
			i++;
			notify();
		}else{
			wait();
		}
		
	}
	
}
