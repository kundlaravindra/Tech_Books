package com.hackerRank.array;

import java.util.Scanner;

public class MaxSubArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
       
        if(t < 1 && t > 10 ){
            return;
        }
        for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			
			if(n < 1 && n > 100000){
                return;
            }
			
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt();
			}
			
			findMaxSubArray(a,n);
		}
	}

	private static void findMaxSubArray(int[] a, int n){
		
		int cSum = a[0];
		int tempCSum = a[0];
		int ncSum = a[0];
		int tempNCSum = a[0];
		
		boolean allNegative = true;
		
		if(a[0] > 0){
			allNegative = false;
		}
		for(int i = 1; i < n; i++) {
			
			if(a[i] >= 0){
				if(ncSum < 0){
					ncSum =0;
				}
				ncSum = ncSum + a[i];
				allNegative = false;
				
			}else if(a[i] < 0 && allNegative){
				ncSum = a[i];
				
				if(ncSum > tempNCSum){
					tempNCSum = ncSum;
				}
			}
			
			if(cSum >= 0 && (cSum + a[i]) >= 0){
				
				cSum = cSum + a[i];
			
			}else if(cSum < 0 && a[i] >= 0){
				cSum = a[i];
			}
			
			
			if(tempCSum <= cSum){
				tempCSum = cSum;
			}
			
			/*if(cSum < 0){
				cSum = 0;
			}*/
			
		}
		
		if(allNegative){
			System.out.println(tempNCSum + " " + tempNCSum);
		}else{
			System.out.println(tempCSum + " " + ncSum);
		}
	}
}
