/**
 * 
 */
package com.deepak.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kumadeep
 *
 */
public  class ValueComparator implements Comparator{

	Map<String, Integer> map = new HashMap<String, Integer>();
	
	public ValueComparator(Map<String, Integer> map) {
		this.map = map;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		if(map.get(o1) > map.get(o2)){
			return -1;
		}
		return 1;
	}

	

}
