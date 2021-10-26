package com.core.autowire.annotations;

public class C {

	A instanceA;
	B instanceB;
	
	public C(){}
	
	public A getInstanceA() {
		return instanceA;
	}

	public void setInstanceA(A instanceA) {
		this.instanceA = instanceA;
	}

	public B getInstanceB() {
		return instanceB;
	}

	public void setInstanceB(B instanceB) {
		this.instanceB = instanceB;
	}

	public C(A a)
	{
		this.instanceA = a;
	}
	
	public C(A a, B b){
		
		this.instanceA = a;
		this.instanceB = b;
		
	}
	
	public void show(){
		System.out.println("This is show mehtod of class C");
	}
	
	
}
