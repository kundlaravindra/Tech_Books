package com.s1;
import com.oops.*;
public class X extends FinalBase {
	
	void do1() {
		System.out.println("I am at X");
	}
	
	public static void main(String[] args) {
		FinalBase f = new FinalBase();
		f.call();
		X x = new X();
		x.call();
		
	}

}
