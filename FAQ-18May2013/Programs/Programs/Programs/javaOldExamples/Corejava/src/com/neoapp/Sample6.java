package com.neoapp;

public class Sample6 extends Sample5{

	/**
	 * @param args
	 */
	private int c,d;
	public Sample6(){
		c=2;
		d=1;
	}
	// we must defind default constructs
	public Sample6(int x, int y){
		c=x;
		d=y;
		System.out.println(c);
		System.out.println(d);

	}
	public int sub(){
		return c-d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample6 obj=new Sample6(15,10);
//int sum=obj.add();
System.out.println(obj.add());
System.out.println(obj.sub());
	}

}
