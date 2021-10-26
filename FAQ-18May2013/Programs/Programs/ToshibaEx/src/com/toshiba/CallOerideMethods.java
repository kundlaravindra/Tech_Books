package com.toshiba;

import java.util.HashSet;
import java.util.Set;

public class CallOerideMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CallOerideMethods c = new CallOerideMethods();
		OverrideEqualHashcode o = new OverrideEqualHashcode(1,"java");
		OverrideEqualHashcode o1 = new OverrideEqualHashcode(1,"java1");
		OverrideEqualHashcode o2 = new OverrideEqualHashcode(2,"java");
		OverrideEqualHashcode o3 = new OverrideEqualHashcode(3,"java");
		Set<OverrideEqualHashcode> s = new HashSet<OverrideEqualHashcode>();
		s.add(o);
		s.add(o1);
		s.add(o2);
		s.add(o3);
		System.out.println(s.size());
		if( o.equals(o1)){
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}

	}

}
