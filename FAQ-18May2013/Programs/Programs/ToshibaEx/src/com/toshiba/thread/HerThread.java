package com.toshiba.thread;

public class HerThread implements Runnable  {
	 Account account;
	        public HerThread (Account s) { account = s; }
	        public void run() {account.enquire(); }
	} // end class HerThread
