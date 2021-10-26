package com.polaries.paper1;

import java.util.Vector;

public class VectorEx {
	public void test(){
		Vector<String> v=new Vector<String>(5,10);
		//ArrayList v=new ArrayList();
		/*v.add("1");
		v.add("1");
		v.add("1");
		v.add("1");
		v.add("1");
		v.add("1");
		//v.ensureCapacity(10);
*/		    
		/*v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");
		v.addElement("2");
		v.addElement("1");*/
		v.addElement("2");
		//v.addElement("1");
		v= add(new Vector());
		v.addElement("2");
		change(new Vector());
		VectorEx c= new VectorEx();
		c.change(v);
		v.addElement(changed());
		//change(v);
		System.out.println(v.size());
		
	}
	public void change(Vector<String> v){
		v.addElement("3");
		
	}
	public String changed(){
		return "3";
		
	}
	public Vector<String> add(Vector<String> v){
		v.addElement("3");
		return v;
	}
	public static void main(String[] args) {
		VectorEx a=new VectorEx();
		a.test();
		
	}

}
