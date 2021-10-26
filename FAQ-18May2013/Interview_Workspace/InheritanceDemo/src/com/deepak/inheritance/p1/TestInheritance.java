/**
 * 
 */
package com.deepak.inheritance.p1;


/**
 * @author kumadeep
 *
 */
public class TestInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ChildClass child= new ChildClass();
		System.out.println(child.publicI);
		System.out.println(child.protectedI);
		System.out.println(child.privateI);
		System.out.println(child.defaultI);
		child.publicMethod();
		child.protectedMethod();
		child.privateMethod();
		child.defaultMethod();
		
	}

}
