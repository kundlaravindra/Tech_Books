package com.paper1;

public class FinalDec {

	//public final static String s;
	public final  String s ="hello";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "hai";
FinalDec f = new FinalDec();
System.out.println(f.s);
//System.out.println(FinalDec.s);
	}
	static {
		String s = "hi";
	}
}
