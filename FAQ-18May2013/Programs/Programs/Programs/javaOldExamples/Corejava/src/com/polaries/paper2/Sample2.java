package com.polaries.paper2;

public class Sample2 {
	int x=100;
	public void checkValue(){
		x+=1;
		System.out.println(x++);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 t=new Sample2();
		t.x=5;
		t.checkValue();

	}

}
