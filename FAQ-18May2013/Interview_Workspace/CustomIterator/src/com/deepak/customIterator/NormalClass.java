/**
 * 
 */
package com.deepak.customIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class NormalClass {

	private List<Integer> intList;
	private int currentSize;
	
	public NormalClass(List<Integer> intList) {
		this.intList = intList;
		this.currentSize = intList.size();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		NormalClass cust = new NormalClass(list);
		for (Integer integer : cust) {
			System.out.println(integer);
		}
	}

}
