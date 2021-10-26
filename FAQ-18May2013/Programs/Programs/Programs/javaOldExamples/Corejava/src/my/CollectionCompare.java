package my;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionCompare {

	@SuppressWarnings("unused")
	private static String a;
	@SuppressWarnings("unused")
	private static String b;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l=new ArrayList<Integer>();
List<Integer> d=new ArrayList<Integer>();
Set<Integer> s=new HashSet<Integer>();
l.add(7);
d.add(7);
d.add(9);
l.add(9);
s.add(7);
a = "vinod";
b = "vinod";
//System.out.println(a.com);
s.add(9);
System.out.println(l.contains(7));
	}

}
