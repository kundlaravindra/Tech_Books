package com.others;
import com.toshiba.A;

public class B<Integer> {

	/**
	 * @param args
	 */
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		//B<?> sd = new B<Integer>();
		float t = 0;
		System.out.printf("this is %f",t);
A a = new A();
a.sum();
System.out.println(a.s + t);
System.err.println("hi--------");

	}
	
}
