package com.javacode4designpatterns.CreationalPatterns;

public abstract class FactoryPattern1
{

	FactoryPattern1(){
		System.out.println("FP1");
	}

/*
	static FactoryPattern1(int a){
		System.out.println("FP1");
	}
*/

	static void FactoryPattern1(int a){
		System.out.println("FP1 - a: "+a);
	}

	public static void main(String args[])
	{
		System.out.println("hello");

		//FactoryPattern1.FactoryPattern1();

		FactoryPattern1.FactoryPattern1(4);

		//FactoryPattern1 f = (FactoryPattern1) new Object();
		//f.FactoryPattern1(55);
	}
}