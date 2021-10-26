/**
 * 
 */
package com.deepak.semaphore.resource;

import java.util.concurrent.Semaphore;

/**
 * @author kumadeep
 *
 */
public class Connection {

	public static Connection instance = new Connection();
	public int connections = 0;
	
	public Semaphore sem = new Semaphore(10, true);
	
	private Connection(){
		
	}
	
	public static Connection getInstance(){
		return instance;
	}
	
	public void connect(){
		try {
			this.sem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			doConnect();
		}finally{
			this.sem.release();
		}
	}
	
	public void doConnect(){
		
		synchronized (this) {
			connections++;
			System.out.println("Current connection : " + connections);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (this) {
			connections--;
		}
	}
	
}
