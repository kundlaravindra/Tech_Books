package com.hackerRank.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String[] str = new String[n];
		
		Map<String,Integer> stringMap = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			str[i] = in.next();
			
			if(stringMap.containsKey(str[i])){
				stringMap.put(str[i], stringMap.get(str[i])+1);
			}else{
				stringMap.put(str[i], 1);
			}
			
		}
		
		
		int noOfQuery = in.nextInt();

		for (int i = 0; i < noOfQuery; i++) {
			String input = in.next();
			if(stringMap.containsKey(input)){
				System.out.println(stringMap.get(input));
			}else
				System.out.println(0);
		}
		in.close();
	}

}
