/**
 * 
 */
package com.deepak.random.searchWord;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class Permutation {

	static List<String> listOfWords = new ArrayList<String>();
	static int i = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		allPermutation("ABCD");
		System.out.println(listOfWords);
		System.out.println("I : " + i);
	}
	
	public static void allPermutation(String str){
		
		if(str == null){
			return ;
		}
		
		char[] ch = str.toCharArray();
		int length = ch.length;
		boolean[] used = new boolean[length];
		StringBuffer outputString = new StringBuffer();
		
		permute(ch, used, outputString, length, 0);
		
	}

	public static void permute(char[] ch,boolean[] used,StringBuffer outputString, int length,int level){
		i++;
		if(length == level){
			listOfWords.add(outputString.toString());
			return;
		}
		
		for (int i = 0; i < length; i++) {
			if(used[i]){
				continue;
			}
			
			used[i] = true;
			outputString.append(ch[i]);
			permute(ch, used, outputString, length, level+1);
			used[i]=false;
			outputString.setLength(outputString.length()-1);
		}
	}
}
