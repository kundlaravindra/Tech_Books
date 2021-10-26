package my;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class Class1 {
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	@SuppressWarnings("unused")
	Set s=new TreeSet();
	s.add(9);
	s.add(8);
	s.add(7);
	s.add(1);
	s.add(12);
	s.add(4);
	s.add(6);
	List l=new ArrayList();
	l.add(s);
	System.out.println(l.indexOf(2));


}

}
