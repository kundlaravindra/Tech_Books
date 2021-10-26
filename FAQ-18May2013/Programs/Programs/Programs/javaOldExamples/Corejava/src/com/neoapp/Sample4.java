package com.neoapp;

public class Sample4 {

	/**
	 * @param args
	 */
static	Sample4 obj;
	private int x;
	public static final double pi=3.14;
	public Sample4(){
		x=100;
		
	}
	public  void printData(){
		System.out.println(x);
		System.out.println(pi);
		System.out.println(obj.x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 obj=new Sample4();
obj.printData();
	}

}
