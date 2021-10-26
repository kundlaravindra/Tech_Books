package com.toshiba.genarics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GnericsTest {

	public static void main(String[] args) {
//List<String> l1 = new ArrayList<String>();
//List<String> l2 = new ArrayList<String>();
		GnericsTest g = new GnericsTest();
		System.out.println(g.hashCode()+"======"+g.getClass());
				Set s = new HashSet();
		Set s1 = new HashSet();
		List l1 = new ArrayList();
		l1.add(5);
		List l2 = new ArrayList();
		//l2.add(5);
		s.add(l1);
		//s.add(l2);*/
	//	s.add(arg0)
System.out.println(l1.getClass()==l2.getClass());
System.out.println(l1.getClass());

		System.out.println(l1.hashCode()+"-----"+l2.hashCode());
		System.out.println(s.size()+"====="+s.hashCode());
		
	}

}
