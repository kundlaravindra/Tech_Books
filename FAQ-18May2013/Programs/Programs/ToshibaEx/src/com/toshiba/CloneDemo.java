package com.toshiba;

public class CloneDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClone x = new TestClone();
		TestClone y;
		x.a = 10;
		x.b = 20.9;
		y = x.cloneTest();
		System.out.println("x:"+x.a+"---"+x.b+"-------"+x.hashCode());
		System.out.println("y:"+y.a+"-----"+y.b+"-------"+y.hashCode());

	}

}
