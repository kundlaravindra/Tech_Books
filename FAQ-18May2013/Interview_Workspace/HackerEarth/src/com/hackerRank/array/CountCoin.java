package com.hackerRank.array;

import java.util.ArrayList;
import java.util.List;

public class CountCoin {

	static List<Integer[]> lis = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int[] coin = {2,3,5};
		System.out.println("Count : " + getCoinCount(10, coin));
		System.out.println(lis);
	}
	
	public static int getCoinCount(int sum , int coin[]){
		
		if(sum < 0){
			//lis.add(usedCoin);
			return 0;
		}
		if(sum == 0){
			return 1;
		}
		
		int[] c = new int[coin.length];
		
		for (int i = 0; i < coin.length; i++) {
			
			c[i] = getCoinCount(sum - coin[i], coin); 
			
		}
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			count = count + c[i];
		}
		return count;
	}
	

}
