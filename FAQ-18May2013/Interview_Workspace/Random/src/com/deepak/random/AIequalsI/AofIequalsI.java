/**
 * 
 */
package com.deepak.random.AIequalsI;

/**
 * @author indkumar07
 *
 *Check if their exists value such that A[i]=i.
 */
public class AofIequalsI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] a = {-1,0,1,3,5,6,7,8,132};
		System.out.println(checkCondition(a,0,a.length));
		System.out.println(checkCondition(a));
	}
	
	/**
	 * With Recursion
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	public static boolean checkCondition(Integer[] a, int start,int end){
		//System.out.println("Start : " + start + " end : " + end);
		int index = start + end/2;
		//System.out.println("Index : " + index);

		if(start <= end){
			if(a[index] == index){
				return true;
			}else if(a[index] > index){
				return checkCondition(a, start, end/2);
			}else{
				return checkCondition(a, end/2, end);
			}
		}else{
			return false;
		}
		
	}
	
	
	/**
	 * Without Recursion
	 * @param a
	 * @return
	 */
	public static boolean checkCondition(Integer[] a){
		
		int index = 0;
		int start = 0;
		int end = a.length;
		
		while(index >= 0){
			//System.out.println("Index : " + index + " Start : " + start + " end : " + end);
			index = start + end/2;
			if(a[index] == index){
				return true;
			}else if(a[index] > index){
				end = end/2;
			}else{
				start=end/2;
			}
			
		}
		return false;
	}

}
