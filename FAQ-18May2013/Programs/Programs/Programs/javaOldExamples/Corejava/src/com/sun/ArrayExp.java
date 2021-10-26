package com.sun;

//import java.lang.reflect.Array;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class ArrayExp {
public static void main(String[] args) {
	Integer i[]={2,4,2,7,3,4,3,9,9,1,3};
	//List y=Array.asList(i);
    Integer j[]=new Integer[i.length];
    int l,d=0,k=0,s,t=0,f=0;
    System.out.println(j[0]);
    for(l=0;l<i.length;l++){
	k++;
	System.out.println(k);
	for (s=0;s<k;s++){
		//System.out.println();
		if(i[l]==j[s]){
			d=1;
		    k--;
		}
	}
	if(d==0){
		j[k-1]=i[l];
		t++;	
	}
	d=0;
	
}
for(int c=0;c<t;c++){
	f=0;
	for (int e=0;e<i.length;e++){
		if(j[c]==i[e]){
			f++;
			
		}
	
	}
	System.out.println(j[c]+":::::::is:::::::"+f);
}	}}
