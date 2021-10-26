package com;

public class Acenture {
	  int i=0;
	  //int i;
	//  static int i;
	 static Acenture a;
	/**
	 * @param args
	 */
	public static void sum(){
		System.out.println(a.i);
	}
	
	static {
		a.i = a.i+1;
		System.out.println(a.i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new Acenture();
		sum();
	}

}
