package com.core.autowire;

public class B {

	A instanceA;
	
	public B(){}
	
	public void show(){
		System.out.println("This is show method of class B");
	}

	public A getInstanceA() {
		return instanceA;
	}

	public void setInstanceA(A instanceA) {
		this.instanceA = instanceA;
	}
	
	
}
