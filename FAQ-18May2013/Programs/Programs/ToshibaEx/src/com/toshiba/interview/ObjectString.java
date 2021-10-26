package com.toshiba.interview;

public class ObjectString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String o = 7+7+"seven";
String o1 = "seven"+7+7;
System.out.println(o);
System.out.println(o1);
System.out.println(o+"    "+o1);
System.out.println(5-3^3);
		
String s = new String("vinod");
String s1 = new String("vinod");
Object s2 = s;
Object s3 = s1;
/*Object s2 = "vinod";
Object s3 = "vinod";*/
String s4 = s;
String s5 = s1;
System.out.println(s4==s5);
System.out.println(s2==s3);
System.out.println(s2.equals(s));
System.out.println(s.equals(s2));
System.out.println(s2.equals(s3));
System.out.println("-----------");
System.out.println(s2.hashCode());
System.out.println(s.hashCode());
System.out.println(s==s3);
	}

}
