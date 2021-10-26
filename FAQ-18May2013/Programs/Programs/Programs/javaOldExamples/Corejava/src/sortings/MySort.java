package sortings;

import java.util.Comparator;


public class MySort implements Comparator{
static int l =0;
//MySort(){}
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		int i=Integer.parseInt(s1);
		int j=Integer.parseInt(s2);
		String e="example";
		System.out.println(++l);
		System.out.println(e.substring(2, 4));
		if(i>j){
			return -1;	
		}
		if(j<i)
			return 1;
		else
			return 0;


	}

}
