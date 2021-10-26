package Com.pavan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Retriving {
	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) { 
	Map map = new HashMap(); 
	map.put("man", "john"); 
	map.put("woman", "jane"); 
	System.out.println("Key for john is: " + 
	getKey(map, "john")+map.get("man")); 
	} 

	private static String getKey(Map map, String value) { 
	for (Iterator i = map.keySet().iterator(); i.hasNext();) { 
	String key = (String)i.next(); 
	if (map.get(key).equals(value)) { 
	return key; 
	} 
	} 
	return "No value found"; 
	} 
	} 
	



