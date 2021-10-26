package com.general;

public class Counter {
	static int count;
	int n;
	Counter(){
		n=n+ ++count;
		System.out.println(n);
	}
	public static void main(String[] args) {
		Counter a= new Counter();
		Counter b= new Counter();
		Counter c= new Counter();
	}
	
	
	
}