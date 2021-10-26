/**
 * 
 */
package com.deepak.random.searchWord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author kumadeep
 *
 */
public class FetchWord {

	static List<String> listOfWord = new ArrayList<String>();
	static int count = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String str = "ABC";
		int length = str.length();
		char[] ch = str.toCharArray();
		StringBuffer outputString = new StringBuffer();  
		boolean[] used = new boolean[length];
		permute(ch, used, outputString, length, 0);
		
		int i = 'c' + 'a' + 'a';// + 'e' + 'f' + 'g';
		System.out.print(i);
		//fetchWord(i);
		System.out.println(listOfWord);
		System.out.println(count);
	}
	
	public static void fetchWord(int n){
		
		Map<Character,Integer> mapChar =  new HashMap<Character, Integer>();
		
		for(int i = 'a' ; i < 'z' + 1 ; i++){
			if((n/i)  > 0){
				mapChar.put((char)i, n/i);
			}
		}
		System.out.println(mapChar);
		
		printWord(mapChar, "", n);
		
	}

	
	public static void printWord(Map<Character,Integer> mapChar, String prefix,int num){
		count++;
		if(num == 0){
			listOfWord.add(prefix);
			return;
		}else if(num < 0){
			return;
		}else{
			Iterator<Entry<Character, Integer>> it = mapChar.entrySet().iterator();
			while(it.hasNext()){
				Entry<Character, Integer> entry = it.next();
				Character tempChar = entry.getKey();
				int tempValue = entry.getValue();
				tempValue--;
				
				if(tempValue ==0){
					it.remove();
				}
				
				Map<Character,Integer> mapCharTemp = new HashMap<Character, Integer>();
				mapCharTemp.putAll(mapChar);
				mapCharTemp.put(tempChar, (entry.getValue()-1));  
				printWord(mapCharTemp, prefix+tempChar, (num-tempChar));
			}
		}
	}
	
	/*
	 * Finds all possible permutation of word.
	 */
	public static void permute(char[] ch, boolean used[],StringBuffer outputString,int length,int level ){
		
		if(length == level){
			System.out.println(outputString.toString());
			return;
		}
		
		for(int i=0; i<length ; i++ ){
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
