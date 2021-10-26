package com.toshiba.utill;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListVectot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1,"java");
		Student s1 = new Student(1,"java");
		Student s2 = new Student(1,"java");
		Student s3 = new Student(1,"java");
		Student s4 = new Student(1,"java");
		ArrayList a = new ArrayList();
		Vector v = new Vector();
		a.add(s);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		v.add(s);
		v.add(s1);
		v.add(s2);
		v.add(s3);
		v.add(s4);
		System.out.println(a.get(2));
		for (int I=0;I<v. size ();I++)
		{
		System.out.println (v.elementAt (I));
		System.out.println (v.get(I));
		}
		for (int I=0;I<a. size ();I++)
		{
		System.out.println (a.get (I));
		}

		//System.out.println(a.get(20));
	}

}
