package com.oops;

public class FinalOveride extends FinalBase {
	public final void sum(){
		System.out.println("Subclass");
	}
public static void main(String[] args) {
	FinalBase f = new FinalOveride();
	f.call();
}
}
