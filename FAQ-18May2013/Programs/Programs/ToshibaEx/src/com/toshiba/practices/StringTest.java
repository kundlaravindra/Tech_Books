package com.toshiba.practices;

public class StringTest {

	public static void main(String[] args) {
String s = "new";
Object o = "new";
StringBuffer sb = new StringBuffer("new");
System.out.println(s.equals(o));
System.out.println(s==o);
System.out.println(sb.equals(o));
System.out.println(sb == o);
		/*String s1 = "abc";
		String s2 = new String("abc");
		//s2.intern();
		String s3 = s1;
		String s4 = s2;
		s3 = s4;
		s4.intern();
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("----------");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println("+++++++++++++++");
		System.out.println(s2==s4);
		System.out.println(s1==s3);*/
	}

}
