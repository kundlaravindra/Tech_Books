package eprism;

import java.util.*;

public class HasMa {

	String s;
	int i;
	HasMa(String q,int e){
		s=q;
		i=e;
	}
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasMa m=new HasMa("java",1);
		HasMa m1=new HasMa("java",1);
		HashMap p=new HashMap();
		Hashtable ht=new Hashtable();
		ht.put(1, m);
		//HashMap p1=new HashMap();
		p.put(1, m);
		//p1.put(1,m);
		System.out.println(p.equals(ht));
		System.out.println(p.keySet());
		
		
		
		

	}

}
