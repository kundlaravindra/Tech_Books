/**
 * 
 */
package com.deepak.random.anagram;

/**
 * @author kumadeep
 *
 */
public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		System.out.println("as1dfg".matches("[a-zA-Z]+"));
		String str = "abcd";
		
		int []intCh = new int[26];
		for(char ch : str.toLowerCase().toCharArray()){
			intCh[ch-'a']++;
		}
		System.out.println(isAnagram(str, "abcd", intCh));
		
	}
	
	private static boolean isAnagram(String oldStr,String newStr, int[] intCh){
		
		
		if(newStr.length() != oldStr.length()){
			return false;
		}
		
		
		for(char ch : newStr.toLowerCase().toCharArray()){
			intCh[ch-'a']--;
			if(intCh[ch-'a'] < 0){
				return false;
			}
		}
		
		
		for(int i = 0 ;i < intCh.length ; i++){
			if(intCh[i] !=0){
				return false;
			}
		}
		return true;
	}

}
