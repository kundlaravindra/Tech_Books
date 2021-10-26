package com.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class fy {
	int j=2;
	public int try1(int a){
		if(j==a){
			return a;
		}
		if(j==a){
			return 1;
		}
	return 5;	
	}
public static void main(String[] args) {
	//m a=null;	
	fy f=new fy();
	int b=f.try1(2);
	System.out.println(b);
	/*String s1="I am raja ";
	String s2=" very happy";
	System.out.println(s1.trim()+s2.trim());
	fy fy=new fy();*/
	
	try {
		Class class1=Class.forName("java.lang.Runtime");
		Constructor[] constructor=class1.getDeclaredConstructors();
		for(Constructor constructor2:constructor){
			Object object;
			try {
				constructor2.setAccessible(true);
				object = constructor2.newInstance();
				System.out.println(object.getClass());
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}
