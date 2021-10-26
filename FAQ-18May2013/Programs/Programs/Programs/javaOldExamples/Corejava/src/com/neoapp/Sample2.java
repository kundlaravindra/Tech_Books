package com.neoapp;

public class Sample2 {

	/**
	 * @param args
	 */
	private int a,b;
	public Sample2(int x, int y){
		a=x;
		b=y;
	}
	public int add(){
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Sample2 obj=new Sample2();
Sample2 obj=new Sample2(10,20);
int sum=obj.add();
System.out.println(sum);
	}

}
