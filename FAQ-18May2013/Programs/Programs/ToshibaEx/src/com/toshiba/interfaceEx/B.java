package com.toshiba.interfaceEx;

public class B implements A{
	
	static interface C{
		
	}
	public void run(){
		System.out.println("interface method");
		sum();
	}
	
public void sum(){
	System.out.println("class method");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.run();

	}

}
