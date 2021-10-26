package com.deepak.demo;

public class Comparator {

	boolean compare(int a,int b){
		
		if(a == b){
			return true;
		}
		return false;
	}
	
	boolean compare(String a,String b){
		
		if(a.equals(b)){
			return true;
		}
		return false;
	}
	
	
	boolean compare(int[] a,int[] b){
		
		if(a.length == b.length){
			int len = a.length;
			for (int i = 0; i < len; i++) {
				if(a[i] != b[i]){
					return false;
				}
			}
		}else{
			return false;
		}
		
		return true;
	}
	
	
}
