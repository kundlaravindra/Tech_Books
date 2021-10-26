/**
 * 
 */
package com.deepak.random.patternMatch;

/**
 * @author kumadeep
 *
 */
public class PatternMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Deepakkukummar";
		String pattern = "mar";
		System.out.println(checkPattern(str, pattern));
	}
	
	public static boolean checkPattern(String str,String pattern){
		
		int s = str.length();
		int p = pattern.length();
		
		for(int i=0; i<(s-p+1) ;i++){
			int k = 0;
			if(str.charAt(i) == pattern.charAt(k)){
				k=0;
				while((i+k) < s  && k < p && str.charAt(i+k) == pattern.charAt(k)){
					k++;
				}
				if(k==p){
					System.out.println("Pattern found");
					return true;
				}
			}
			
		}
		
		return false;
	
	}

}
