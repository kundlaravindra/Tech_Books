package com.core;

public class Mythread extends Thread {
	
	ExampleThread et;
	String name;
	public Mythread(ExampleThread et, String name) {
		//super();
		this.et = et;
		this.name = name;
	}
	
	public void run(){
		et.wish(name);
	}
	
}


