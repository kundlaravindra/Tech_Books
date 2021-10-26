package com.toshiba.sorting;

import java.util.Scanner;

public class StringSorting {
static String[] s1 = { "raja", "shekar", "vinod", "reddy", "kumar", "karthik"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(s.length);
		
		Scanner sc = new Scanner(System.in);
		String[] s = new String[args.length];
		
		for (int k = 0; k < args.length;k++){
			s[k]= args[k]; 
		}
		
		
		//System.out.println(s1.);
		for (int i=0; i < s.length;i++){
			for (int j = i+1; j<s.length;j++){
				if(s[j].compareTo(s[i]) < 0){
				String t = s[i];
				s[i] = s[j];
				s[j] = t;
					
				}
			}
			System.out.println(s[i]);
		}

	}

}
