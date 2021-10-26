package com.polaries.paper2;

 abstract class A {
	abstract void a1();
	void a2(){
		System.out.println("A");
	}

}
class B extends A{
	void a1(){}
	void a2(){
		System.out.println("B");
	}
	
}
