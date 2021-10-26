package sortings;
import java.util.*;
public class IteratarsEx extends notSort.HashSetss{
	int a,b;
	String d;
	IteratarsEx(int i,String s,int j){
		a=i;
		b=j;
		d=s;
	}
public static void main(String[] args) {
	
	Set<Object> a=new HashSet<Object>();
	//Object[] a=new Object[6];
a.add(new IteratarsEx(2,"vinod",44));
a.add(new IteratarsEx(2,"vinod",44));
a.add(new IteratarsEx(2,"vinod",44));
System.out.println(a.size());
//a.add(9);
//a.add(12);
//List l=a.list();
Iterator<Object> i=a.iterator();

while (i.hasNext()){
	IteratarsEx e=(IteratarsEx)i.next();
    System.out.println(e.a+e.d+e.b);
}}

}
