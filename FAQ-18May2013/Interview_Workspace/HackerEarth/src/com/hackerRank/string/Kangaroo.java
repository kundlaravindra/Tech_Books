package com.hackerRank.string;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	Scanner in = new Scanner(System.in);
	        int x1 = in.nextInt();
	        int v1 = in.nextInt();
	        int x2 = in.nextInt();
	        int v2 = in.nextInt();
	        
	        if(x1 < 0 || x1 > 10000 || x2 < 0 || x2 > 10000 || v1 < 1 || v1 > 10000 || v2 < 1 || v2 > 10000){
	           // System.out.println("NO");
	            return;
	        }
	        if((x2-x1)*(v2-v1) < 0 && (x2-x1)/(v1-v2) > 0){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	}

}
