package com.deepak.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        if(t < 1 || t>100000){
        	return;
        }
        
        String[] str = new String[t];
        for (int i = 0; i < t; i++) {
        	str[i] = br.readLine();
        	if(str[i].length() > 10){
        		return;
        	}
        	for(int j = 0;j<str.length;j++){
        		
        		if(!((str[i].charAt(j) >= 'a' && str[i].charAt(j) <= 'z') || (str[i].charAt(j) >= 'A' && str[i].charAt(j) <= 'Z'))){
        			return;
        		}
        	}
        }

        System.out.println(getNummberOFPAlins(str));
    	
    }
    
    public static int getNummberOFPAlins(String[] str){
    	int count = 0;
    	
    	List<String> listInput = new ArrayList<String>();
    	
    	for(int i=0;i<str.length;i++){
    		
    		if(!listInput.contains(str[i].toLowerCase())){
    			listInput.add(reverse(str[i].toLowerCase()));
    		}else{
    			count++;
    		}
    	}
    	
    	return count;
    }
    
    public static String reverse(String str){
		char[] ch = new char[str.length()];
		for(int i = 0; i < str.length()/2;i++){
			ch[str.length()-1-i] = str.charAt(i);
			ch[i]=str.charAt(str.length()-i-1);
			
		}
    	
		if((str.length()%2) !=0){
			ch[str.length()/2] = str.charAt((str.length()/2));
		}
		
    	return new String(ch);
    }
}
