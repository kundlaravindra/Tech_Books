package com.core;

public class Demo1 {
public static void main(String[] args){
		
		ExampleThread exampleThread =new ExampleThread();
		Mythread mythread=new Mythread(exampleThread,"pavan");
		Mythread mythread2=new Mythread(exampleThread,"Raj");
		mythread.start();
		mythread2.start();
		//Thread thread =new Thread();
		//exampleThread.start();
		
	}

}
