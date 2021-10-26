/**
 * 
 */
package com.hackerearth.test.printNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author kumadeep
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int a[] = new int[t];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		while(st.hasMoreTokens()){
			a[i++] = Integer.parseInt(st.nextToken());
		}
		
		for(int j=0;j<t;j++){
			for(int k=1;k<=a[j];k++){
				
				if((k%15)==0){
					System.out.println("FizzBuzz");
				}
				else if((k%3)==0){
					System.out.println("Fizz");
				}else if((k%5)==0){
					System.out.println("Buzz");
				}else{
					System.out.println(k);
				}
			}
		}
	}

}
