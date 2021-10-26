/**
 * 
 */
package com.deepak.random.triplet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kumadeep
 *
 */
public class FindTriplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = 11;
		int array[] = {4,5,1,6,8,9};
		System.out.println(tripletExist(array, sum));
	}

	public static boolean tripletExist(int array[],int sum){
		
		for (int i = 0; i < array.length; i++) {
			if(dupletExist(array, sum-array[i], i)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean dupletExist(int array[],int sum,int index){
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < array.length && i != index; i++) {
			//if(i != index){
				if(map.containsKey(sum-array[i])){
					return true;
				}else{
					map.put(array[i], i);
				}
			//}
		}
		
		return false;
	}
}
