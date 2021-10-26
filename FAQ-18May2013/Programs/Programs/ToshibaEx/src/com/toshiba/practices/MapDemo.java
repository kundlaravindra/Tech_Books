package com.toshiba.practices;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> h = new Hashtable<Integer,String>();
		h.put(100,"Example1");
		h.put(200,"Example2");
		h.put(300,"Example3");
		h.put(400,"Example4");
		h.put(500,"Example5");
		//System.out.println(h);
		//Enumeration<Integer> e = h.keys();
		//System.out.print(e);
		//HashSet & List we can't use, But Collection we can use
		//Set s = h.keySet();
		
		//We can't use List & Set
		//Collection c = h.values();
		
		//We can use Collection
		//Set s1 = h.entrySet();
	//-------------------------------------------------	
		for(Map.Entry<Integer, String> me : h.entrySet()){
			Integer k = me.getKey();
			String v = me.getValue();
			System.out.println(k+v);
		}
	//------------------------------------------------------
		/*Iterator itr = s1.iterator();
		while(itr.hasNext()){
			//To get next entry and casting required because values are object type
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+"-----------"+m.getValue());
			if(m.getKey().equals(400)){
				System.out.println("hiiiiiiiiii");
				m.setValue("good example");
			}
			System.out.println(m.getValue());
			
		}
		*/
		
	}

}
