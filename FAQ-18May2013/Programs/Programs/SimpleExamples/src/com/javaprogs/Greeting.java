package com.javaprogs;
public class  Greeting{
	private String salutation;
	Greeting(String s){
		salutation = s;
	}
	public void greet(String whom){
	System.out.println(salutation+" "+whom);
	}
}
