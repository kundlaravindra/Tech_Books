package com.deepak.demo;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println(abc());
	}
	
	public static int abc(){
		try{
			
			throw new RuntimeException();
			//return 0;
		}finally{
			
			return 1;
		}
	}

}
