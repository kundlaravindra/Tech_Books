package com.hackerRank.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArraySplitting {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int a[] = new int[n];
			int sum = 0;
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt();
				sum = sum + a[j];
			}
			System.out.println(getMaxScore(a,sum,0));
		}
	}
	
	public static int getMaxScore(int[] a, int sum){
		
		int count = 0;
		if(sum % 2 == 0){
			return 0;
		}
		
		int[] lA = new int[a.length];
		int[] rA = new int[a.length];
		boolean hasSubArray = getSubArray(a,a.length, sum/2, lA, rA);
		return count;
	}
	
	
	public static boolean getSubArray(int[] a,int n, int sum, int[] lA,int[] rA){
		if(sum % 2 != 0){
			return false;
		}
		
		if( getSubArray(a, n-1, sum, lA, rA) || getSubArray(a, n-1, sum-a[n-1], lA, rA)){
			return true;
		}
		
		return false;
	}

	
	public static int getMaxScore(int[] a, int sum, int count){
		
		int leftSum = 0;
		int rightSum =0;
		int splitIndex = 0;
		
		for (int i = a.length - 1 ; i >= 0 ; i--) {
			if(rightSum + a[i] <= sum/2 ){
				rightSum = rightSum + a[i];
				splitIndex = i;
			}else{
				leftSum = leftSum + a[i];
			}
		}
		
		if(rightSum == leftSum && rightSum == sum/2){
			count++;
			if(leftSum%2 == 0){
				count = getMaxScore(Arrays.copyOf(a, splitIndex+1), leftSum,count);
			}
		}
		
		return count;
	}
	
	
}
