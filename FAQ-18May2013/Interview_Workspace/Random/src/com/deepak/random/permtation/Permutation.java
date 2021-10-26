/**
 * 
 */
package com.deepak.random.permtation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * @author kumadeep
 *Find min 
 *
 */
public class Permutation {

	public static List<String> listSum = new ArrayList<String>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> arrayInt = new ArrayList<Integer>();
		//arrayInt.add(-1);
		arrayInt.add(25);
		arrayInt.add(-1);
		arrayInt.add(-0);
		arrayInt.add(18);
		/*sumAllPossibleSubSet(arrayInt);
		System.out.println(listSum);
		*/
		
		//powerSet(arrayInt);
		permuteForLength(arrayInt);
		System.out.println("listSum : " + listSum);
		//System.out.println(findMinDifference(listSum));
	}

	public static void sumAllPossibleSubSet(int[] arrayInt){
		
		for (int i = 0; i < arrayInt.length; i++) {
			for (int j = i; j < arrayInt.length; j++) {
				sum(i, j, arrayInt);
			}
		}
	}
	
	public static void sum(int i ,int j,int[] arrayInt){
		int sum = 0 ;
		while(i<=j){
			sum = sum + arrayInt[i];
			i++;
		}
		
		listSum.add(((Integer)sum).toString());
	}
	
	public static int findMinDifference(List<Integer> listSum){
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < listSum.size(); i++) {
			for (int j = i+1; j < listSum.size(); j++) {
				if(min > Math.abs(listSum.get(i)-listSum.get(j))){
					min  = Math.abs(listSum.get(i)-listSum.get(j));
				}
				
			}
		}
		
		return min;
	}
	
	public static void permuteForLength(List<Integer> arrayInt){
		permute(arrayInt,new boolean[arrayInt.size()], new ArrayList<Integer>(), arrayInt.size(), 0);
		/*for (int i = 1; i < arrayInt.length; i++) {
			permute(arrayInt,new boolean[arrayInt.length], 0, i, 0);
		}*/
		
	}
	
	public static void permute(List<Integer> arrayInt,boolean[] used,List<Integer> sum,int length,int level){
		
		if(length == level){
			//System.out.print(sum +  " ");
			//listSum.add(sum);
			listSum.add(sum.toString());
			return;
		}
		
		for (int i = 0; i < arrayInt.size(); i++) {
			if(used[i]){
				continue;
			}
			used[i]=true;
			//sum = sum+arrayInt[i];
			
			sum.add(arrayInt.get(i));
			//System.out.print(sum + " ");
			//listSum.add(sum.toString());
			permute(arrayInt, used, sum, length, level+1);
			
			/*if((arrayInt.size() - i)==1){
				arrayInt.remove(0);
			}*/
			used[i]=false;
			//sum = sum-arrayInt[i];
			sum.remove(sum.size()-1);
			
			/*if(level == 0){
				used[i]=false;
				sum = sum-arrayInt[i];
				
			}*/
		}
	}
	
	
	public static void powerSet(ArrayList<Integer> input) {
		ArrayList<ArrayList<Integer>> powerSet = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> set = new ArrayList<Integer>();
		powerSet.add(set);
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int focused;
		int counter=0,dupCounter;
		if (input.isEmpty())
			System.out.println("null");
		else {
			while (!input.isEmpty()) {
				focused = input.remove(0);
				int psize = powerSet.size();
				counter=0;
				dupCounter=0;
				{
					if(hm.containsKey(focused))
					{
						hm.put(focused, hm.get(focused)+1);
						dupCounter = hm.get(focused);
						for (int i = 0; i < psize; i++) {
							for(Integer ii : powerSet.get(i)){
								if(ii==focused){
									counter++;
								}
							}
							if(counter==dupCounter-1)
							{
								powerSet.get(i).contains(focused);
								set = (ArrayList<Integer>) powerSet.get(i).clone();
								set.add(focused);
								powerSet.add(set);
							}
							counter=0;
						}
					}
					else{
						hm.put(focused, 1);
						for (int i = 0; i < psize; i++) {
							set = (ArrayList<Integer>) powerSet.get(i).clone();
							set.add(focused);
							powerSet.add(set);
						}
					}
				}
			}
			System.out.println("PowerSet : " + powerSet.toString());
		}
	}
	
}
