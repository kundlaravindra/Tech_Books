package com.general;

public class Inhinerirenss1 extends Inhinerirenss {
	public void sum(){
		super.sum();
		System.out.println("i am in subclass");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inhinerirenss1 i=new Inhinerirenss1();
		i.sub();
	}

}
