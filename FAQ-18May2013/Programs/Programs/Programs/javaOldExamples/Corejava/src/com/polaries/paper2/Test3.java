package com.polaries.paper2;

import java.util.Vector;

public class Test3 {
private void changeVector(Vector v){
	v.addElement("two");
	v=null;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector x=new Vector();
		Test3 t=new Test3();
		x.addElement("one");
		t.changeVector(x);
		for (int i=0;i<x.size();i++)
			System.out.println(x.get(i));

	}

}
