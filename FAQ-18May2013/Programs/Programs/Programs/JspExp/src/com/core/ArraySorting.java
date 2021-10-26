package com.core;

public class ArraySorting {
	public static void main(String[] args) {
int a,b,c,d,e=0;
int[] j=new int[8];
		int[] i={4,7,8,9,3};
		for(a=0;a<4;a++){
			b=i[a];
			for(c=1;c<4;c++){
			if(b<i[c]){
				
				j[e]=b;
				e++;
			
			}
			}
			
		}
		for(int s=0;s<5;s++){
		System.out.println(j[s]);
		
	
		}
}}
