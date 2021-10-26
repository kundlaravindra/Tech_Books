package com.toshiba;

public class MyException extends RuntimeException{
	MyException(String s){
		super(s);
		System.out.println(s);
	}

}
