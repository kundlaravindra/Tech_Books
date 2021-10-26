package com.general;

public class Inheritance3 extends Inheritance2{
int i=10;
	/**
	 * @param args
	 */
	public void print(){
		super.print1();
		System.out.println("subclass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance3 i=new Inheritance3();
		Inheritance2 i1=new Inheritance3();
		//i.print();
		System.out.println(i.i);
		System.out.println(i1.i);
	}

}
