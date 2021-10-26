package com.deepak.random.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		Integer[] a={10,20,30,40};
		list = Arrays.asList(a);
		a[3] = 50;
		for(Integer i : list){
			System.out.println(i + " ");
		}
		System.out.println(list);
	}

}
