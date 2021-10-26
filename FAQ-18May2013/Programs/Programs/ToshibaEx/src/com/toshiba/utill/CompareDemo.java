package com.toshiba.utill;

import java.util.TreeSet;

public class CompareDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<String>(new Comparing());
		ts.add("r");
		ts.add("f");
		ts.add("z");
		ts.add("t");
		ts.add("e");
		ts.add("a");

		for (String elm : ts) {
			System.out.println(elm);
		}

	}
}
