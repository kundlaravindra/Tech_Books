package notSort;

import java.util.*;

public class List2Map {
public static void main(String[] args) {
List l=new ArrayList();
Map m=new HashMap();
	//Set l=new HashSet();
l.add(7);
l.add(9);
l.add(7);
Iterator b=l.iterator();
System.out.println(l);
//int i=l.size();
//for (Integer a=0;a<i;a++){
while(b.hasNext()){
	int a=0;
	Integer i=(Integer)b.next();
	m.put(a, i);
	System.out.println(i+""+a);
	a=a+1;
}
Set<String> s=m.keySet();
System.out.println(s);
for(Object c:s){
	Integer d=(Integer)m.get(c);
	System.out.println(d);
	
}

	}

}
