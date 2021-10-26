package com.toshiba;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindRepitedNumbers {
	
	public static void main(String[] args) {
		Set s = new HashSet();
		Map m = new HashMap();
		Integer[] a = {1,2,1,5,7,9,8,9,6,5,1,4,3,2,1,4,9};
		for(int i = 0; i < a.length; i++)
			s.add(a[i]);
		//Integer[] b = (Integer[])s.toArray();
		//Array[] g = (Array[])s.toArray();
		//Integer[] b = (Integer[])o;
		Object[] b = s.toArray();
		for(int x = 0; x < b.length; x++) {
			int c = 0;
			for (int y = 0; y < a.length; y++) {
				if(b[x] == a[y]){
					c++;
					m.put(b, c);
				}
			}
		System.out.println(b[x]+"-------------"+c);
		}
	}

}
