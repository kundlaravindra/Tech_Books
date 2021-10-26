package com.toshiba.thread;

public class ImplimentsThread implements Runnable {
static Thread t;

	/**
	 * @param args
	 */
	public void run(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImplimentsThread i = new ImplimentsThread();
		 t = new Thread(i);
		
	}
	 
	
	public void sum() throws Exception{
		t.sleep(11);
		
		t.wait();
	}

}
