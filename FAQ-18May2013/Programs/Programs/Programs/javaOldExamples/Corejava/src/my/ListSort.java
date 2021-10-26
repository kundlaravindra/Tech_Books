package my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
public static void main(String[] args) {
List<Integer> l=new ArrayList<Integer>();
l.add(6);
l.add(9);
l.add(11);
l.add(1);
l.add(0);
l.add(5);
Collections.sort(l);
for (Integer a:l)
	System.out.println(a);
		Collections.reverse(l);
		for (Integer b:l)
			System.out.println(b);
		

		
	}

}
