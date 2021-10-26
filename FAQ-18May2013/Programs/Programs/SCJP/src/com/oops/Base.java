package com.oops;

public class Base {
	int a;
	Base(){
		a = 8;
		System.out.println("base....");
	}
	Base(int i){
		a = i;
		System.out.println("base parameter");
	}
public void call(){
	System.out.println(a);
}
}
