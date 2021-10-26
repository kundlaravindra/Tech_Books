/**
 * 
 */
package com.deepak.inheritance.p1;

/**
 * @author kumadeep
 *
 */
public class ParentClass {

	private int privateI;
	protected int protectedI;
	public int publicI;
	int defaultI;
	public ParentClass() {
	}
	
	private void privateMethod(){
		System.out.println("private Method");
	}
	
	protected void protectedMethod(){
		System.out.println("protected Method");
	}
	
	public void publicMethod(int i){
		System.out.println("Public Method");
	}
	void defaultMethod(){
		System.out.println("default Method");
	}
	
	
}
