package com.toshiba.thread;

public class MyThread implements Runnable  {
	 Account account;
	        public MyThread (Account s) {  account = s;}
	        public void run() { account.deposit(); }
	} // end class MyThread
