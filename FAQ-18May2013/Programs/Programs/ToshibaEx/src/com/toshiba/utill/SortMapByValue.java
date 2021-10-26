package com.toshiba.utill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java",1);
		map.put("C",2);
		map.put("C++",3);
		map.put("Oracle",1);
		map.put("Jquery",5);
		Set<Entry<String, Integer>> set = map.entrySet();//***
		/*Iterator<Entry<String, Integer>> i = set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
			{
		public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2){
			return (o2.getValue()).compareTo(o1.getValue());
		} });
	for(Map.Entry<String, Integer> entry: list){
		System.out.println(entry.getKey()+"="+entry.getValue());
		}
			}
	}


