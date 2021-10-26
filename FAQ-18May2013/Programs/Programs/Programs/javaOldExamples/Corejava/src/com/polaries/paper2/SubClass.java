package com.polaries.paper2;

public class SubClass extends Base {

	public void method(int j){
		System.out.println("value of j   "+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1=new Base();
		Base b2=new SubClass();
		b1.method(1);
		b2.method(2);
	}

}
