/**
 * 
 */
package com.deepak.random.ExcelPattern;

/**
 * @author kumadeep
 *
 */
public class ExcelPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getNumber("ZAXASDEBCDEF"));
		System.out.println(getString(getNumber("ZAXASDEBCDEF")));
	}
	
	public static long getNumber(String str){
		
		long num=0;
		for(int i = 0; i<str.length() ; i++){
			char ch = str.charAt(str.length() - i -1);
			num = (long) (num + (ch-'A' + 1) * Math.pow(26, i));
			//System.out.println(i + " : " + num);
		}
		
		return num;
	}
	
	public static String getString(long num){
		String str = "";
		long strNum=0;
		while(num > 26){
			strNum = num % 26;
			num = num/26;
			strNum = strNum + 'A' -1;
			//System.out.println(String.valueOf((char) strNum));
			str = String.valueOf((char) strNum).concat(str);
		}
		num = num -1 + 'A';
		//System.out.println(String.valueOf((char) num));
		str = String.valueOf((char) num).concat(str);
		return str;
	}

}
