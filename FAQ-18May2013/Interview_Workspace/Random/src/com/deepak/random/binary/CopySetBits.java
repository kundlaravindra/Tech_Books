/**
 * 
 */
package com.deepak.random.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class CopySetBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 12;
		//System.out.println(getBinary(12));
		//System.out.println(getInteger(getBinary(12)));
		int[] n = {1,0,0,1};
		//System.out.println(getInteger(n));
		
		System.out.println(replace(10, 13, 2, 3));
	}
	
	public static int[] getBinary(int n){
		int binary[] =new int[25];
		int temp = n;
		int i =0;
		while(temp > 0){
			binary[i] = temp%2;
			temp = temp/2;
			i++;
		}
		return binary;
	}
	
	
	public static int replace(int x,int y,int s,int n){
		int binaryX[] = getBinary(x);
		int binaryY[] = getBinary(y);
		
		for(int i=s;s < n; s++){
			if(binaryY[s] > 0){
				if(binaryX[s] == 0){
					binaryX[s] = 1;
				}
			}
		}
		
		
		return getInteger(binaryX);
	}
	
	public static int getInteger(int[] n){
		int num = 0;
		for (int i = 0; i < n.length; i++) {
			num = (int) (num + (Math.pow(2, i) * n[i]));
		}
		
		return num;
	}

}
