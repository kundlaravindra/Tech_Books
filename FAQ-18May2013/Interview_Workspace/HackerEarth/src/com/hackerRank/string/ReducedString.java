package com.hackerRank.string;

import java.util.Scanner;

public class ReducedString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		System.out.println(reducedString(str));
		
	}

	public static String reducedString(String str){
                
		char[] ch = str.toCharArray();
		boolean isReduced = false;
		String result = "";
        for(int i = 0 ; i <ch.length-1 ; i++){
        	
        	if(str.charAt(i) == str.charAt(i+1)){
        		isReduced = true;
        		result = result.substring(0, i) + str.substring(i+2, str.length());
        	}
	        	/*if(ch[i] == ch[i+1]){
	        		isReduced = true;
	        		ch[i] = '/';
	        		ch[i+1] = '/';
	        	}*/
        }
        //String result = new String(ch).replaceAll("/", "");
        
        if(isReduced){
        	result = reducedString(result);
        }
        if(result.trim().length() == 0){
        	result = "Empty String";
        }
        return result;
    }
}
