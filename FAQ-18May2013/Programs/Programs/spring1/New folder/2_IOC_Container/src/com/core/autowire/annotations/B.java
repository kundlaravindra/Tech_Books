package com.core.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	@Autowired(required=false)
	@Qualifier("preffered")
	A instanceA;
	
	public B(){}
	
	public void show(){
		System.out.println("This is show mehtod of class B");
	}

	public A getInstanceA() {
		return instanceA;
	}

	public void setInstanceA(A instanceA) {
		this.instanceA = instanceA;
	}
	
	
}
