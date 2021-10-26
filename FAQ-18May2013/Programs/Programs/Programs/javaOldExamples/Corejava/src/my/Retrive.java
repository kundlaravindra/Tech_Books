package my;

import java.util.ArrayList;
import java.util.List;

public class Retrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		User u2=new User();
		User u3=new User();
		User u1=new User();
		u.setId(1);
		u.setName("java");
		u1.setId(2);
		u1.setName("jav");
		u2.setId(3);
		u2.setName("ja");
		u3.setId(4);
		u3.setName("J");
		List<User> l=new ArrayList<User>();
		l.add(u);
		l.add(u1);
		l.add(u2);
		l.add(u3);
		for (User a:l)
			System.out.println(a.getName());
		
		
		

	}

}
