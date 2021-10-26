/**
 * 
 */
package com.deepak.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author kumadeep
 *
 */
public class Demo1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String str = "aabcccdee";
		int len = str.length();
		int i = 0;
		while(i < len-1){
			if(str.charAt(i) == str.charAt(i+1)){
				
				str = str.substring(0, i) + str.substring(i+2);
				len = str.length();
				i=0;
			}
			i++;
		}
		
		System.out.println(str);
		
	}
	
	
	public static TreeMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
		Comparator<String> comparator = new ValueComparator(map);
		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
		result.putAll(map);
		System.out.println(result);
		return result;
	}
	
	public void writeObject(ObjectOutputStream oos){
		
	}

}
