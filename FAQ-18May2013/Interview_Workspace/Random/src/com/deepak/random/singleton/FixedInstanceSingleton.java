/**
 * 
 */
package com.deepak.random.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class FixedInstanceSingleton {
	
	public static final List<FixedInstanceSingleton> listInstance = new ArrayList<FixedInstanceSingleton>(5);
	
	static int count = 0;
	
	private FixedInstanceSingleton() {
		System.out.println("Started : " + count);
	}
	
	public static synchronized FixedInstanceSingleton getInstance(){
		
		if(listInstance.size() < 5){
			listInstance.add(new FixedInstanceSingleton());
		}
		FixedInstanceSingleton instance = listInstance.get(count);
		
		count = (count + 1)%5;
		
		return instance;
	}
}
