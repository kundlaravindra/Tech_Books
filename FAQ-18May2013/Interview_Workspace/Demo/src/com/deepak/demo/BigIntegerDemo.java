package com.deepak.demo;

import java.util.Scanner;


public class BigIntegerDemo {

	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        if(t < 1 || t > 100){
        	return;
        }
        int arr[][] = new int[t][3];
        for (int i = 0; i < t; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
			arr[i][2] = in.nextInt();
			if(arr[i][0] < 1 || arr[i][0] > Math.pow(10, 9)){
				return;
			}
			if(arr[i][1] < 1 || arr[i][1] > Math.pow(10, 9)){
				return;
			}
			if(arr[i][2] < 1 || arr[i][2] > Math.pow(10, 9)){
				return;
			}
		}
        
        
        for(int i = 0 ; i < t ; i++){
        	//System.out.print(((arr[i][2] + (arr[i][1] % arr[i][0]) - 1)));
        	System.out.print(((arr[i][2] + (arr[i][1] % arr[i][0]) - 1) % arr[i][0]) + " ");
        	
        }
        
    }

}
