package com.polaries.paper2;

public class PassS {
	void start(){
		String s1="slip";
		String s2=fix(s1);
		System.out.println(s1+"----------"+s2);
	}
	String fix(String s1){
		s1=s1+"strem";
		//System.out.println(s1+"");
		return s1;
	}
	/*void test(){
		int i=9;
		test1(i);
		System.out.println(i);
	}
	void test1(int i){
		i=i+1;
		return;
	}*/

	public static void main(String[] args) {

		PassS p=new PassS();
		p.start();
		//p.test();
		int x=20;
		String s=(x<15)?"small":(x<22)?"tiny":"huge";
		System.out.println(s);

	}

}
