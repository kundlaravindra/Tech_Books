package com.toshiba;

import java.util.HashMap;
import java.util.Iterator;

public class FindRefitedNoOfNumbersByOrdCode {
	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,2,3,4,5,3,4,5,4,5,5};

	    HashMap<Integer,Integer> duplicates = new HashMap<Integer,Integer>();
	    for(int i=0; i<array.length; i++)
	    {
	        if(duplicates.containsKey(array[i]))
	        {
	            int numberOfOccurances = duplicates.get(array[i]);
	            duplicates.put(array[i], (numberOfOccurances + 1));
	        }else{
	            duplicates.put(array[i], 1);
	        }
	    }
	    Iterator<Integer> keys = duplicates.keySet().iterator();
	    System.out.print("Duplicates : " );
	    while(keys.hasNext())
	    {
	        int k = keys.next(); 
	        if(duplicates.get(k) > 0)
	        {
	            System.out.print(" "+k+"times---"+duplicates.get(k));
	        }
	    }
	}

}
