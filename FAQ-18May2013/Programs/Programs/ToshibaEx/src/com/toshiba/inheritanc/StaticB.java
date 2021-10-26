package com.toshiba.inheritanc;

public class StaticB extends StaticA {

	/**
	 * @param args
	 */
	static int a = 9;;
	public void run(){
		System.out.println(super.a + this.a);
		this.call();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticB b = new StaticB();
		b.run();
	}
	public static void call(){
		System.out.println("I called with this");
		
	}

}
