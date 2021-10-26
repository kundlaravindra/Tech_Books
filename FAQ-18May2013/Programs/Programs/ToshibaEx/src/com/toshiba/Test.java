package com.toshiba;

public class Test {
	
	public boolean equals(Object o){
		
		return false;
	}
	public static void main(String[] args) {
		char[] c = {'a','b','c'};
		char d = 'y'+'r';
		//char d = 'a'+'A';
		String[] r = new String[]{"ysy","ryyay"}; 
		System.out.println(r[1]);
		System.out.println(d);
		String s = new String("abc");
		String s1 = new String(c);
		System.out.println(s1.equals(s));
	}

}
