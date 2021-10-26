package com.toshiba.utill;

import java.util.Arrays;

public class MyArrayList {

	/**
	 * @param args
	 */
	private Object[] myStore;
	private int actSize = 0;
	
	public MyArrayList(){
		myStore = new Object[10];
	}
	
	public Object get(int index){
		if(index < actSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void add(Object obj){
		if (myStore.length - actSize <=5) {
			increaseListSize();
		}
		myStore[actSize++] = obj;
	}
	
	private void increaseListSize() {
		// TODO Auto-generated method stub
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		System.out.println("\n New length: "+myStore.length);
	}

	public Object remove(int index){
		if(index < actSize){
			Object obj = myStore[index];
			//System.out.println(obj);
			//System.out.println(index);
			myStore[index] = null;
			int tmp = index;
			while ( tmp < actSize) {
				myStore[tmp] = myStore[tmp+1];
				myStore[tmp+1] = null;
				//System.out.println(tmp);
				tmp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	public int size() {
		return actSize;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList mal = new MyArrayList();
		mal.add(new Integer(2));
		mal.add(new Integer(3));
		mal.add(new Integer(4));
		mal.add(new Integer(7));
		mal.add(new Integer(8));
		mal.add(new Integer(12));
		mal.add(new Integer(21));
		
		mal.remove(3);
		for (int i = 0; i < mal.size(); i++) {
			System.out.println(mal.get(i) + "");
		}
	}
	

}
