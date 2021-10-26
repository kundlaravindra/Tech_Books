/**
 * 
 */
package com.deepak.random.singleton;


/**
 * @author kumadeep
 *
 */
public class SingletonMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		
		FixedInstanceSingleton.getInstance();
		FixedInstanceSingleton.getInstance();
		FixedInstanceSingleton.getInstance();
		FixedInstanceSingleton.getInstance();
		FixedInstanceSingleton.getInstance();
		FixedInstanceSingleton.getInstance();
		FixedInstanceSingleton.getInstance();
		FixedInstanceSingleton.getInstance();
		
	}

}
