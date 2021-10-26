package com.polaries.paper1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Foo{
			public int i=3;
					}
//Object o=(Object)new Foo();
		Object o=(Object)new Foo();
Foo f=(Foo)o;
System.out.println(f.i);
	}

}
