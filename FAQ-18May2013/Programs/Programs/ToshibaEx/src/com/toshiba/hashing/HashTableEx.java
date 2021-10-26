package com.toshiba.hashing;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new Hashtable();
		try{
	m.put(1,5);
	m.put(null,3);
	m.put(3,null);
		}
		catch(Exception e){
	//int f = 5/0;
		}
		finally{
			
			System.out.println("hiiii........."+m.get(3));
			
		}
	}

}
