package com.javacode4designpatterns.CreationalPatterns;

class A{
	A(){}
	}

public abstract class FactoryPattern12
{
	static int a=10;
	void pattern1(int a){
		System.out.println("FP1 - a: "+a);
	}

//modifier abstract not allowed here
	//abstract FactoryPattern12();

	abstract void FactoryPattern12();

	void test()
	{
		FactoryPattern12(4,5);
	}

	FactoryPattern12(int a,int b)
	{
		a = 10;
		b = 30;

    }
    public static void main(String args[]){
		 //FactoryPattern12 f = (FactoryPattern12) new Object();

		 FactoryPattern12 f = ;

	 }
}