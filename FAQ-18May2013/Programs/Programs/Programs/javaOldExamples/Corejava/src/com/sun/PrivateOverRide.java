package com.sun;

public class PrivateOverRide {
	//private static final String UNUSED = "unused";
	//@SuppressWarnings(UNUSED)
	private void sum(){
		System.out.println("i am in main class");
	}
public void run(){
	sum();
}
}
