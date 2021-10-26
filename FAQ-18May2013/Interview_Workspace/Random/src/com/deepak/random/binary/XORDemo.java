/**
 * 
 */
package com.deepak.random.binary;

/**
 * @author kumadeep
 *
 */
public class XORDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a = {1,2,3,1,2,3,4,5,5,6,4};
		int num=0;
		for (int i = 0; i < a.length; i++) {
			num =num^a[i];
		}
		System.out.println(num);
	}

}
