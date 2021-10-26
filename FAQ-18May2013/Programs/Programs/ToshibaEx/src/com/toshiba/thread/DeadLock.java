package com.toshiba.thread;

public class DeadLock {
String s = "java";
String s1 = "oracle";
 Thread t = new Thread("Thread 1"){
	 public void run(){
		 while(true){
			 synchronized (s) {
				 synchronized (s1) {
					 System.out.println(s + s1);
					
				}
			}
		 }
	 }
 };
 
 Thread t1 = new Thread("Thread 2"){
	 public void run(){
		 while(true){
			 synchronized (s1) {
				 synchronized (s) {
					 System.out.println(s1 + s);
					
				}
			}
		 }
	 }
 };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock d = new DeadLock();
		d.t.start();
		d.t1.start();

	}

}
