package com;

public class Accenture2 {
	volatile static int c;
	Accenture2(int i){
		c=i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accenture2 a = new Accenture2(10);
		Accenture2 b = new Accenture2(20);
        System.out.println(a.c);
        System.out.println(b.c);
	}

}
