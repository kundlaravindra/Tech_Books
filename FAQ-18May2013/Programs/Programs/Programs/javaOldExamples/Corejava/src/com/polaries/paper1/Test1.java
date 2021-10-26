package com.polaries.paper1;

public class Test1 {

	public static int i=10;
	public int j=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		t1.i=20;
		t1.j=20;
		t2.i=30;
		t2.j=30;
		System.out.println(t1.i);
		System.out.println(t1.j);
		System.out.println(t2.i);
		System.out.println(t2.j);

	}

}
