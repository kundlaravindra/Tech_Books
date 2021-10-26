package sample;

import java.util.*;

public class GreatestNumber {

	public static void main(String[] args) {
//TreeSet t=new TreeSet();
		Set s=new HashSet();
		//Collection n=new ArrayList<Integer>();
		
		
ArrayList<Integer> a=new ArrayList<Integer>();
a.add(9);
a.add(65);
a.add(34);
a.add(39);
a.add(23);
a.add(77);
TreeSet t=new TreeSet(a);
ArrayList<Integer> d=new ArrayList<Integer>(t);

System.out.println(d.get(5)-d.get(4));
//Integer b= intValue(a.get(1));
Object c=a.get(0);
//int d= c-b;

Iterator<Integer> i=t.iterator();
/*for(Integer v:i){
	System.out.println(v);
	
}

*/	}

}
