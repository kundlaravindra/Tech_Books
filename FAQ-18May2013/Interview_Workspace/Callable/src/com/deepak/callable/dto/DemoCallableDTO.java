package com.deepak.callable.dto;

public class DemoCallableDTO {

	int i;
	
	public DemoCallableDTO() {
		System.out.println("Called...");
	}
	
	public DemoCallableDTO(int i) {
		this.i = i;
		System.out.println("Called..." + i);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
