package com.sun;
public class ArrayComp {
	public static void main(String[] args) {
		Integer i[]={1,7,8,1,7,7,8,9};
		Integer j[]={1,7,8,9};
		int c=0;
		for(int a=0;a<j.length;a++){
			c=0;
			for(int b=0;b<i.length;b++){
				if(j[a]==i[b]){
					c++;
				}
			}
			System.out.println(j[a]+"="+c);
		}

	}

}
