package com.polaries.paper2;

public class Test {

	public void method(Object o){
		System.out.println("object");
	}
	public void method(String s){
		System.out.println("String");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test();
		obj.method(null);

	}

}
