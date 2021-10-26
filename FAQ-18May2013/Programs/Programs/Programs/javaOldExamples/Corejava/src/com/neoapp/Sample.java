package com.neoapp;

public class Sample {

	/**
	 * @param args
	 */
	private int a,b;
	public int add(){
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample obj=new Sample();
int sum=obj.add();
System.out.println(sum);
	}

}
