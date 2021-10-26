package com.core.spel;

public class SPEL3 {

	float value1;
	float value2;
	float value3;
	float value4;
	float value5;
	String value6;
	
	boolean condition1;
	
	public String getValue6() {
		return value6;
	}
	public void setValue6(String value6) {
		this.value6 = value6;
	}
	boolean condition2;
	boolean condition3;
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		str = value1 + " "+ value2 + " " + value3 + " "  + value4 + " "  + value5 + " " + condition1 + " " + condition2 + " " + condition3 + " " + value6;
	
		return str;
		
		
	}
	public float getValue1() {
		return value1;
	}
	public void setValue1(float value1) {
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
	
	public float getValue4() {
		return value4;
	}
	public void setValue4(float value4) {
		this.value4 = value4;
	}
	public float getValue5() {
		return value5;
	}
	public void setValue5(float value5) {
		this.value5 = value5;
	}
	public boolean isCondition1() {
		return condition1;
	}
	public void setCondition1(boolean condition1) {
		this.condition1 = condition1;
	}
	public boolean isCondition2() {
		return condition2;
	}
	public void setCondition2(boolean condition2) {
		this.condition2 = condition2;
	}
	public boolean isCondition3() {
		return condition3;
	}
	public void setCondition3(boolean condition3) {
		this.condition3 = condition3;
	}
	
	
	
}
