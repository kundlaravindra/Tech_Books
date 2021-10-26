package com.toshiba;

public class Changevalues {
//static 
	int a=4;
	public void print(){
		int a = 90;
		change(a);
		System.out.println(a+this.a);
	}
	public static void change(int a){
		a = 80;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Changevalues c = new Changevalues();
		c.print();
	}

}
