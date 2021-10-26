package com.toshiba.interview;

public class A {
	A a = new A();// will rise stack overflow exception
	public A() throws Exception {
		System.out.println("hi");
		//throw new Exception("Exception");
	}
	
	public static void main(String[] args) {
		try {
			A a1 = new A();
			System.out.println("hi---------");
		}
		catch (Exception e){
			System.out.println(e.getMessage()+"-----");
		}
	}

}
