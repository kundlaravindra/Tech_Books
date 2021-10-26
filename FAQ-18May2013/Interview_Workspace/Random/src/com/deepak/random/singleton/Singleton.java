/**
 * 
 */
package com.deepak.random.singleton;

/**
 * @author kumadeep
 *
 */
public class Singleton {
	
	public static Singleton instance;
	
	private Singleton() {
		System.out.println("Singleton class created...");
	}
	
	public static Singleton getInstance(){
		synchronized (Singleton.class) {
			if(instance == null)
				instance = new Singleton();
			return instance;
		}
		
	}

}
