package com.deepak.zigzag;

public class ZigZag {
	
	public static void main(String[] args){
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		int n =3;
				
		System.out.println(str.length());
		String newStr[]=new String[n];
		
		for(int i=0;i<str.length();i++){
			if(newStr[i%n] == null){
				newStr[i%n] = "";
			}
			newStr[i%n]=newStr[i%n] + str.charAt(i);
		}
		String finalString = "";
		for(int i=0;i<n;i++){
			System.out.println(newStr[i]);
			finalString = finalString + newStr[i]; 
		}
		
		System.out.println(finalString);
		
	}

}
