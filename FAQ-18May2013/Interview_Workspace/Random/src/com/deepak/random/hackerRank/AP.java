/**
 * 
 */
package com.deepak.random.hackerRank;

import java.util.Scanner;

/**
 * @author indkumar07
 *
 */
public class AP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 2 || n >2500){
			sc.close();
			return;
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(!checkRange(a) || !checkRange(b)){
			sc.close();
			return;
		}
		int diff = b-a;
		boolean isDiff = false;
		int sum1 = a+b;
		for (int i = 0; i < n-2; i++) {
			int temp = sc.nextInt();
			if(diff == (temp-b) && !isDiff){
				isDiff = true;
			}else if(!isDiff){
				diff = temp-b;
			}
			if(checkRange(temp)){
				sum1 = sum1 + temp;
			}else{
				sc.close();
				return;
			}
			b=temp;
		}
		int sum = ((n+1)*(2*a + (n)*diff))/2;
		System.out.println(diff);
		System.out.println("sum : " + sum);
		System.out.println(sum1);
		System.out.println(sum-sum1);
		sc.close();
	}
	
	public static boolean checkRange(int num){
		if(num < -Math.pow(10, 6) || num > Math.pow(10,	6)){
			return false;
		}
		return true;
	}

}
