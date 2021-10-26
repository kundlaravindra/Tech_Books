package com.deepak.random.brackets;

import java.util.List;

public class DemoPossibleBrackets {

	public static void main(String[] args) {

		brackets(3, 0, 0,"");
	}

	public static void brackets(int n ,int open, int close,String str){
		
		if(close == n){
			System.out.println(str);
		}else{
			if(open > close){
				str= str + "]";
				brackets(n, open, close+1,str);
			}
			if(open < n){
				str = str + "[";
				brackets( n, open+1, close,str);
			}
		}
		
	};
	
	public static String[] getProbables(List<String> used, String[] probables,String probable){
		
		for(String str : used){
			// if contains opening braces remove from probables and add corresponding closing braces in probables
			//add 
			// Get all opening braces from used.
			// Add all remaining opening braces in probables
			// 
			if(str.equals("("));
		}
		
		return probables;
	}
}
