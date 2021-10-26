package com.toshiba.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<java.lang.String, java.lang.String> map = new HashMap();
		map.put("1", "Jan");
		map.put("2", "Feb");
		map.put("3", "Mar");
		map.put("4", "Apr");
		map.put("5", "May");
		map.put("6", "Jun");
/*for(Map.Entry<Object,Object> obj: map.entrySet()){
			
		}*/
for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
	//
	
	System.out.println(entry.getKey() +"...."+entry.getValue());
			
		}
	/*	Map<String, String> map = new HashMap<String, String>();
		map.put("sfg","adgvagv");
		map.put("1", "Jan");
		map.put("raj", "Raj");
		map.put("raj1", "Raj");
		map.put("raj2", "Raj");
		map.put("raj3", "Raj");
		map.put("raj4", "Raj");
		for(Map.Entry<Object,Object> obj: map.entrySet()){
			
		}
		*/
	}

}
