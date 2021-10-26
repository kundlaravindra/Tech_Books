package notSort;

import java.util.*;

public class Map2List {

public static void main(String[] args) {
Map m=new HashMap();	
Map m1=new HashMap();	

List l=new ArrayList();

l.add(8);
System.out.println(l.get(0));



m.put(1, 10);
m.put(2, 3);
m.put(3, 8);
m1.putAll(m);

Set<String> s=m1.keySet();
Collection  y=m1.values();
//System.out.println(y);
String p=System.getProperty("java.version");
System.out.println(p);
for(Object i:s){
	Integer d=(Integer)m1.get(i);
	//System.out.println(d);
	l.add(d);
}
//System.out.println(l);
}

}
