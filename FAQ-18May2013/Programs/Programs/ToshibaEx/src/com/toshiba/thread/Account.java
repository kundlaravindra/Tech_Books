package com.toshiba.thread;

public class Account {   // the 'monitor'
	   int balance;
	   boolean i,j;
	   	// if 'synchronized' is removed, the outcome is unpredictable
	 public boolean deposit( ) {
		// public synchronized void deposit( ) {
		 System.out.println("I called by 1");
	    // METHOD BODY : balance += deposit_amount;
		 return i=true;
	  } 

	   public  boolean withdraw( ) {
		  // public synchronized void withdraw( ) {
		   System.out.println("I called by 2");
		   
		 // METHOD BODY: balance -= deposit_amount;
		   return j=false;
	   } 
	   public  void enquire( ) {
	  // public synchronized  void enquire( ) {
		   
		   if(i==true && j==true){
		   System.out.println("I called by 3");
		   
		 // METHOD BODY: display balance.
	   }}
	}