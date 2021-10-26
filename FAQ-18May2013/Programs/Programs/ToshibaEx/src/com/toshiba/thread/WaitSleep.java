package com.toshiba.thread;

public class WaitSleep extends Thread {
	 static WaitSleep ws ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ws= new WaitSleep();
		ws.start();

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("tttttt");
		
		call();
		call1();
	}
	 private void call1() {
		// TODO Auto-generated method stub
		 try {
				ws.sleep(1000);
				System.out.println("hi....");
				} catch (InterruptedException i) {
					System.out.println("hi");
				}
		
		
	}
	 synchronized private void call() {
		// TODO Auto-generated method stub
		 try {
				ws.wait(1000);
				System.out.println("hi....");
				} catch (InterruptedException i) {
					System.out.println("hi");
				}
		
	}

}
