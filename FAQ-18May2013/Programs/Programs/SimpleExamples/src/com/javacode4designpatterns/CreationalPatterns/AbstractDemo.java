package com.javacode4designpatterns.CreationalPatterns;

abstract class AbstractClass
{

	 AbstractClass()
	{
		System.out.println("AbstractClass Constructor");
	}

//	static AbstractClass()
//	{
//		System.out.println("FactoryPattern");
//	}

}

public class AbstractDemo
{
	public static void main(String args[])
	{
		Object ob = new Object();
		//ob.
		//AbstractClass.AbstractClass();
	}
}