/**
 * 
 */
package com.deepak.random.checkPallindrome;

/**
 * @author indkumar07
 *
 */
public class Pallindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPallindrome("a$bc$cb!!!a"));
	}

	public static boolean isPallindrome(String str){
		
		int start=0;
		int end=str.length()-1;
		char chStart;
		char chEnd;
		while(start < end){
			chStart = Character.toLowerCase(str.charAt(start));
			chEnd = Character.toLowerCase(str.charAt(end));
			
			if( chStart < 'a' || chStart > 'z'){
				start++;
			}
			if( chEnd < 'a' || chEnd > 'z'){
				end--;
			}
			if(( chStart >= 'a' && chStart <= 'z') && ( chEnd >= 'a' && chEnd <= 'z') && (chStart!=chEnd)){
				return false;
			}else if(( chStart >= 'a' && chStart <= 'z') && ( chEnd >= 'a' && chEnd <= 'z') && (chStart==chEnd)){
				start++;
				end--;
			}
			
		}
		return true;
	}
}
