/**
 * 
 */
package com.deepak.random.binary;

/**
 * @author kumadeep
 *
 */
public class PrintBinaryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//System.out.println(8 << 1);
		System.out.println(1 ^ 1231);
		//binary(8);
	}
	
	public static void printBinary(int n){
		for (int i = 0; i < n; i++) {
			binary(i);
		}
	}

	public static void binary(int n) {

		if(n>1){
			binary(n >>1 );
		}
		System.out.println(n&1);
	}
}
