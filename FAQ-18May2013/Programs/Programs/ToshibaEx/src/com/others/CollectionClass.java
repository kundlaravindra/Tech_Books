package com.others;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Vector v = new Vector(5,2);
		//ArrayList a = new ArrayList(10);
		v.add(10);
		v.add(6);
		System.out.println(v.elementAt(0));
		
		/*Map map = new HashMap ();
	    // Add key/value pairs 
	    map = Collections.unmodifiableMap (map);
	    map.put(1,3);*/
		/*Map map = new Hashtable();
	    // Add key/value pairs 
	    map = Collections.unmodifiableMap (map);
	    map.put(1,3);*/
		/*List map = new ArrayList();
	    // Add key/value pairs 
	    map = Collections.unmodifiableList (map);
	    map.add(1);*/
	   /* List map = new Vector();
	    // Add key/value pairs 
	    map = Collections.unmodifiableList (map);
	    map.add(1);*/
		 Set map = new HashSet();
		    // Add key/value pairs 
		    map = Collections.unmodifiableSet (map);
		    map.add(1);
	    

		
		

	}

}
