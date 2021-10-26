package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s = in.readLine();
	    String[] str= s.split(" ");
	  
	    System.out.println(calculate(Integer.valueOf(str[0]), Integer.valueOf(str[1]),
	    		Integer.valueOf(str[2]), Integer.valueOf(str[3]),
	    		Integer.valueOf(str[4]), Integer.valueOf(str[5]),
	    		Integer.valueOf(str[6]), Integer.valueOf(str[7])));
	  }
	
	private static boolean calculate(int r1x1, int r1y1, int r1w, int r1h, int r2x1, int r2y1, int r2w, int r2h)
	{
		int r1x2 = r1x1 + r1w;
		int r1y2 = r1y1 + r1h;
		int r2x2 = r2x1 + r2w;
		int r2y2 = r2y1 + r2h;

		//overlap conditions
		boolean isOverlap = true;
		if (r1x2 < r2x1)
			isOverlap = false;
		else if (r2x2 < r1x1)
			isOverlap = false;
		else if (r1y2 < r2y1)
			isOverlap = false;
		else if (r2y2 < r1y1)
			isOverlap = false;

		return isOverlap;
	}
}
