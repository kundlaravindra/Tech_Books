package in.CookBook.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyCount {
	public static void main(String[] args) {
List<String> l=new ArrayList<String>();
l.add("yes");
l.add("n");
l.add("yew");
l.add("y");
l.add("n");
Set<String> s=new HashSet<String>();
s.addAll(l);
Iterator<String> i=s.iterator();
while(i.hasNext()){
	int a=0;
	String s1=i.next();
	//System.out.println(s1);
	for(String s2:l){
		if(s2.equals(s1)){
			System.out.println(s2);
			a++;
		}	
	}
	System.out.println(s1+"-------"+a);
	}

}}
