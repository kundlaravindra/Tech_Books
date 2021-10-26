package com.core.spel;

public class SPEL2 {

	int value1;
	String value2;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		
		str = value1 + " "+ value2 + " ";
		return str;
		
		
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}
	
	
	
	
}
