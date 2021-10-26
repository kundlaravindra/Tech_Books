/**
 * 
 */
package com.deepak.random.profit;

/**
 * @author kumadeep
 *
 */
public class MaxProfit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {-9,3,4,1,5,6,2,12,9,10,11};
		//int[] array = {1,1,1,1,1,1,1};
		//int[] array = {10,9,2,8,9,6,-1,5};
		
		System.out.println(getMaxProfit(array));
	}
	
	public static int getMaxProfit(int[] array){
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int minIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] > 0){
				if(min > array[i]){
					min = array[i];
					minIndex = i;
				}
				
				if(max < array[i] && minIndex != i){
					max = array[i];
				}
				
			}
			
		}
		if(max == Integer.MIN_VALUE){
			return 0;
		}
		return max - min;
		
	}

}
