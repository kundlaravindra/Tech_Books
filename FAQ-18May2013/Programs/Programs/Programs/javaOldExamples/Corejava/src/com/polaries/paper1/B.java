package com.polaries.paper1;
class A{
	public int add(int a,int b){
		return a+b;
	}
}

public class B extends A{
	public int add(int a,int b){
		return (a+b)*2;
	}
	public int subtract(int a,int b){
		return a-b;
	}

	
	public static void main(String[] args) {
		A a=new B();
		//System.out.println(a.subtract(10,5));
		

	}

}
