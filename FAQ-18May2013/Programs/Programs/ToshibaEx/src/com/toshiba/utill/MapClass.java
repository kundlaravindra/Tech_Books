package com.toshiba.utill;

import java.util.HashMap;
import java.util.Iterator;

public class MapClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MapClass mc = (MapClass)
				//class.forName("MapClass.class").new Instance();
		
		HashMap m = new HashMap();
		m.put("1","vinod");
		m.put("2", "value");
		//Set s = m.keySet();
		Iterator i = m.keySet().iterator();
		while(i.hasNext()){
			String a = (String)i.next();
			if(a.equals("2")){
				//System.out.println("hi");
				//m.remove(a);
			}
			
		}
		
		m.remove("2");
		System.out.println(m.get("03"));
		
		double d = 0.0/0.0;
		if(d==0){
			System.out.println("its equals");
		}else 
			System.out.println("not equals");
	}

}
