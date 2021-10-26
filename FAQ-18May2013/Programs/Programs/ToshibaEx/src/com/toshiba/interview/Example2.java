package com.toshiba.interview;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e = new Example2();
		boolean b = e.run();
		System.out.println(b);
	}
	
	public boolean run(){
		try {
			return true;
		}
		finally {
			//break;
			return false;
		}
		//return false;
	}

}
