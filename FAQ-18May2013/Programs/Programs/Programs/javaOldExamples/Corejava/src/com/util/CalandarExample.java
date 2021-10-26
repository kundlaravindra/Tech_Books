/**
 * 
 */
package com.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author vinod
 * 
 */
public class CalandarExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		//System.out.println(c1.getTime());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		c1.set(2006, 12, 29);
		
		c2.set(2007, 5, 25);
		//long m = c1.getTimeInMillis();
		long m=c1.getTimeInMillis();
		long m1 = c2.getTimeInMillis();
		Date d =new Date(m1 - m);
		System.out.println(d);
		// subtract 30 days from current date
		c1.add(Calendar.DATE, -30);
		//System.out.println(c1.getTime());
	}

}
