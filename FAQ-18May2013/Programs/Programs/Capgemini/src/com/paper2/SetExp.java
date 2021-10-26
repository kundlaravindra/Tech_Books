package com.paper2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExp {

	public static void main(String[] args) {

		String s1 = "Akash";
		String s2 = "akash";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Set s = new HashSet();
		s.add("akash");
		s.add("AkaSH");
		
		
		s.add("ashu");
		
		System.out.println(s.size());
		Iterator i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
