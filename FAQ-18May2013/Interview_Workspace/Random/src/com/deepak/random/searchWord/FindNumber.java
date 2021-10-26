/**
 * 
 */
package com.deepak.random.searchWord;

/**
 * @author kumadeep
 *
 */

public class FindNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {1,2,3,4,3,4,1,2,3,4,5,6,7,8};
		System.out.println(findNumberFromSeries(array, 6));
	}

	public static boolean findNumberFromSeries(int[] array, int num){
		
		int index = num;
		int tempPosition=array[index-1];
		
		if(tempPosition == num){
			return true;
		}
		
		while(tempPosition != num){
			index = index + (num - array[index-1]);
			tempPosition = array[index-1];
			if(tempPosition == num){
				return true;
			}
		}
		
		return false;
	}
}
