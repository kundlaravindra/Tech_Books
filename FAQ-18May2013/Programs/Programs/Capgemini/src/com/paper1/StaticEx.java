package com.paper1;

public class StaticEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticCall s = new StaticCall(10);
		StaticCall s1 = new StaticCall(20);
		//s.setSid(15);
		change();
		System.out.println(s.sid);
	}
static int change(){
	StaticCall.sid = StaticCall.sid + 10;
	
	return 0;
}
}
