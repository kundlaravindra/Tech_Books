package com.hackerearth.test.printNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        /*if(t < 1 || t>100000){
        	return;
        }*/
        
        String[] secondLine = br.readLine().split(" ");
        
        int[] n =new int[t];
        int[] k = new int[t];
        int j=0;
        for(int i=0; i<secondLine.length ;i++){
        	n[j]=Integer.parseInt(secondLine[i]);
        	k[j]=Integer.parseInt(secondLine[i++]);;
        	j++;
        }
        
        

        //System.out.println(getNummberOFPAlins(str));
    	
    }
    
    public static void countRequiredDishes(int[][] n){
    	
    	for(int i=0 ;i < 10 ; i++){
    		for(int j=0; j < n[i].length ;j++){
    				
    		}
    	}
    }
    
}
