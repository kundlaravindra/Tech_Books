package com.toshiba.thread;

public class YourThread implements Runnable  {
	 Account account;
	        public YourThread (Account s) { account = s;}
	        public void run() { account.withdraw(); }     
	} // end class YourThread

