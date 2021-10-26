package com.oops;

public class Deried extends Base{
	
	private Deried(){ 
		System.out.println("derived");
	}
	Deried(float f){ 
		//super();
		System.out.println("derived......");
	}
	Deried(int i){
		//super();
		//this();
		System.out.println("derived parameter");
	}
	
	public void print(){
		String s = "vinod";
		int a = 9;
		int b = 8;
		s = s + a + b;
		s  = s + 7 + 8;
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deried d = new Deried(9);
		Base d1 = new Deried(9.0f);
		d.print();
		d.call();
		d1.call();
	}

}
