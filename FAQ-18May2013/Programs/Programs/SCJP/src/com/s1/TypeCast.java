package com.s1;

public class TypeCast {

	
	public static void main(String[] args) {
		
		X x = new X();
		X x1 = new Y();
		Y y = new Y();
		//(Y)x1.do2();
		((Y)x1).do2();
		//((Y)x).do2();
		//y.do2();
	}

}
