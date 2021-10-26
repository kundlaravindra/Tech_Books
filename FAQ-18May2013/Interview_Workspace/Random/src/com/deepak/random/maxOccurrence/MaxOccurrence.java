/**
 * 
 */
package com.deepak.random.maxOccurrence;

/**
 * @author kumadeep
 *
 *Given a sorted array, find a way to find the # of occurrence of a number 
for eg: [1, 1, 2, 3, 3, 3, 4, 5] 
find # of occurrence of 3 in time better than O(n)
 */
public class MaxOccurrence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {1,1,2,2,3,3,3,4,5}; 
		int num = 5;
		System.out.println(getMaxOccurrence(array, num));
		System.out.println(getOccurrenceMidAlgo(array, num));
	}
	
	
	public static int getMaxOccurrence(int[] array,int num){
		
		int start = 0;
		int end = array.length-1;
		
		int count = 0;
		while(start < end){
			if(array[start] == num){
				count++;
			}
			start++;
			if(array[end] == num){
				count++;
			}
			end--;
		}
		if(start == end && array[start] ==num){
			count++;
		}
		return count;
		
	}
	
	public static int getOccurrenceMidAlgo(int[] array, int num){
		int start = 0;
		int end = array.length-1;
		
		int mid = (start+end +1)/2;
		int count =0;
		while(true){
			mid = (start+end +1)/2;
			if(array[mid] > num){
				end = mid;
			}else if(array[mid] < num){
				start = mid;
			}else{
				count ++;
				break;
			}
		}
		start = mid -1;
		end = mid + 1;
		while(start > 0 || end < array.length){
			if(start >= 0 && array[start] == num){
				count++;
				start--;
			} if(end < array.length && array[end] == num){
				count++;
				end++;
			}
			
			if((start < 0  ||array[start] != num ) && (end > array.length-1  ||array[end] != num )){
				break;
			}
		}
		return count;
	}

}
