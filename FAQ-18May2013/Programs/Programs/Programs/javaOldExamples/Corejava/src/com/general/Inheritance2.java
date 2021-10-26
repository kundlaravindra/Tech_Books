package com.general;

public class Inheritance2 extends Inheritance1{
	int i=9;
	/*private void print(){
		System.out.println("rsreddy");
	}*/
	void print1(){
		super.print();
		System.out.println("i can call");
	}

}
