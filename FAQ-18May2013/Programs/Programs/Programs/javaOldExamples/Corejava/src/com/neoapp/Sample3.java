package com.neoapp;

public class Sample3 {

	/**
	 * @param args
	 */
	private int a,b;
	public Sample3(int a, int b){
		a=this.a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
	public int add(){
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample3 obj=new Sample3(10,20);
int sum=obj.add();
System.out.println(sum);
System.out.println(14^23);
	}

}
