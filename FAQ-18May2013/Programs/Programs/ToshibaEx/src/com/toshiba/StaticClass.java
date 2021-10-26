package com.toshiba;

public class StaticClass {
static String s = "hi" ;
public static void sum(String s1,String s2){
	System.out.println("hi----------"+s+"----"+s1+s2.trim());
	System.out.printf("hi '/'s", s);
	System.out.format("hi '/'s", s);
}
public void sum() {
	System.out.println("hoeuypruwi");
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass x = new StaticClass();
		x = null;
		System.out.println(x.s);
		x.s = "Vinod Garu";
		//x.sum();
		x.sum("Software ","    Engineer");
	}
}
