package com.toshiba;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionExp {
	int i = 0;
public void run()  {
	if(i==0){
		System.out.println("hi");
		throw new MyException("got");
		//throw new NullPointerException("got");
		
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExp e = new ExceptionExp();
		e.run();
		try {
			//File f = new File("c:/my");
			System.out.println("hi---------");
		e.run();
		}
		/*catch(FileNotFoundException f){
			System.out.println("hi");
		}*/
		catch(Exception a){
			System.out.println("hiiiiiii");
		}
	}

}
