package com.toshiba.utill;

import java.util.Comparator;

public class Comparing implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		
		return b.compareTo(a);
	}

}
