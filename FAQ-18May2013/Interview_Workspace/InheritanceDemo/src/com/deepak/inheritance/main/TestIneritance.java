/**
 * 
 */
package com.deepak.inheritance.main;

import com.deepak.inheritance.p2.ChildClass;

/**
 * @author kumadeep
 *
 */
public class TestIneritance {

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
