package eprism;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
public class Mysorting {
public static void main(String[] args) {
TreeSet<Integer> t=new TreeSet<Integer>();
//StringBuffer sb=new StringBuffer("vinodvinodvinodvinod");
//int i=sb.capacity();
Double d=new Double(78);
Double d1=new Double(78);
if(d==d1)
System.out.println("equal");
t.add(3);
t.add(4);
t.add(1);
t.add(9);
t.add(5);
ArrayList<Integer> l=new ArrayList<Integer>(t);
System.out.println(t);
Collections.sort(l);
for(Object j:l)
System.out.println(j);
Comparator<Integer> c=Collections.reverseOrder();
Collections.sort(l, c);
for(Object i:l)
System.out.println(i);
			}}

	
	
	

