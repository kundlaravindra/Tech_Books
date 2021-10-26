package sortings;

import java.util.*;

public class TreeSort {

static int j;
public static void main(String[] args) {
//TreeSet<Integer> s=new TreeSet<Integer>(new MySort());
List s = new ArrayList();
s.add(1);
s.add(2);
s.add(3);
s.add(4);
s.add(5);
System.out.println(s);


Collections.sort(s,new MySort());
System.out.println(s);
//Iterator i=s.descendingIterator();
/*while(i.hasNext()){
	 j=(Integer)i.next();
System.out.println(j);
	}*/
}
}
