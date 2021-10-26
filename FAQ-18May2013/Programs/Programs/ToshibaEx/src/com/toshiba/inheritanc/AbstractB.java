package com.toshiba.inheritanc;

public class AbstractB extends AbstractA implements InterfaceA{
	
	synchronized public void run(){
		System.out.println("hi");
		
	}
	
	public static void main(String[] args) {
		AbstractB a = new AbstractB();
		a.run();
		
	}

	@Override
	synchronized public void sum() {
		// TODO Auto-generated method stub
		
	}

}
