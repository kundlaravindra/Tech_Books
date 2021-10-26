package com.s1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnMoifyCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap ();
	    // Add key/value pairs 
		map.put(1,2);
	    map = Collections.unmodifiableMap (map);
	     map.put(1,9);
	     System.out.println("hi");


	}

}
