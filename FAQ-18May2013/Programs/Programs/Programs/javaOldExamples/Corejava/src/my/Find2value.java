package my;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Find2value {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	String v=a.next();
	
Set s=new TreeSet();
for (int i=0;i<v.length();i++) {
s.add(Character.digit(v.charAt(i), 10));
   }
/*s.add(Character.digit(v.charAt(1), 10));
s.add(Character.digit(v.charAt(2), 10));
s.add(Character.digit(v.charAt(3), 10));
s.add(Character.digit(v.charAt(4), 10));*/
List l=new ArrayList();
//l.add(s);
for (Object o:s){
	l.add(o);
	System.out.println(o);
}
//for (Object a:l)
System.out.println(l.get(s.size()-2));
		
/*
s.add(6);
//s.add(8);
s.add(3);
s.add(1);
for (int j=v.length();j>0;){
	s.add(Character.digit(v.charAt(--j), 10));}
List l=new ArrayList();
System.out.println(s);
l.add(s);
System.out.println(l);
Object[] i=new Object[10];
i=l.toArray();
System.out.println(i[0]);
*/
	}

}
