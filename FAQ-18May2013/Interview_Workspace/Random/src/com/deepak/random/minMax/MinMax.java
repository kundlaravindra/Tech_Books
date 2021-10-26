/**
 * 
 */
package com.deepak.random.minMax;

/**
 * @author kumadeep
 *
 */
public class MinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int []a = {10,2,12,5,6,0,9};
		System.out.println(findProfit(a));
	}

	
	public static int findProfit(int []a){
		int max = 0;
		int []b = new int[a.length]; 
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[j] > a[i] && a[j] > b[i]){
					b[i]=a[j];
				}
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("a["+ i +"] = " + a[i] + "; b["+ i +"]" + b[i]);
			if((b[i]-a[i]) > max){
				max = b[i] - a[i];
			}
		}
		return max;
	}
}
