package com.core.spel;

public class SPEL1 {

	int value1;
	float value2;
	float value3;
	String value4;
	boolean enabled;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		
		str = value1 + " "+ value2 + " " + value3 + " "  + value4   + " " + enabled;
		return str;
		
		
	}
	
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public float getValue2() {
		return value2;
	}
	public void setValue2(float value2) {
		this.value2 = value2;
	}
	public float getValue3() {
		return value3;
	}
	public void setValue3(float value3) {
		this.value3 = value3;
	}
	public String getValue4() {
		return value4;
	}
	public void setValue4(String value4) {
		this.value4 = value4;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
	
	
}
