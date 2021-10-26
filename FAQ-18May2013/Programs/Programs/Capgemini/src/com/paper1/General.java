package com.paper1;

public class General {

	public static void main(String[] args) {
		int[] a = {4,8,16};
		int i = 1;
		a[++i] = --i;
		System.out.println(a[0]+a[1]+a[2]);
	}

}
