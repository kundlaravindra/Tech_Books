/**
 * 
 */
package com.deepak.customIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class CustomIterator implements Iterable<Integer>{

	
	private List<Integer> intList;
	private int currentSize;
	
	
	
	public CustomIterator(List<Integer> intList) {
		this.intList = intList;
		this.currentSize = intList.size();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		CustomIterator cust = new CustomIterator(list);
		for (Integer integer : cust) {
			System.out.println(integer);
			
		}
		cust.iterator().remove();
		System.out.println(cust.intList);
	}

	@Override
	public Iterator<Integer> iterator() {
		
		Iterator<Integer> it = new Iterator<Integer>() {
			
			private int currentIndex = 0;
			
			@Override
			public void remove() {
				intList.remove(currentIndex);
			}
			
			@Override
			public Integer next() {
				return intList.get(currentIndex++);
			}
			
			@Override
			public boolean hasNext() {
				if(currentIndex < currentSize && intList.get(currentIndex) != null){
					return true;
				}
				return false;
			}
		};
		return it;
	}

}
