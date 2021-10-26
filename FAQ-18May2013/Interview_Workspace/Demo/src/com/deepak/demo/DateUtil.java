/**
 * 
 */
package com.deepak.demo;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author kumadeep
 *
 */
public class DateUtil {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {

		
		
		String epochString = "1466053593103";
		long epoch = Long.parseLong( epochString );
		Date expiry = new Date( epoch);
		System.out.println(expiry);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		//Date dateObj = sdf.parse("2013-10-22T01:37:56");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));   // This line converts the given date into UTC time zone
		String aRevisedDate = new SimpleDateFormat("MM/dd/yyyy KK:mm:ss a").format(expiry);
		System.out.println(aRevisedDate);
	
//		Date expiry1 = new Date( System.currentTimeMillis());
//		System.out.println(System.currentTimeMillis() + " : " + expiry1);
		Timestamp t = new Timestamp(epoch);
		System.out.println(new Timestamp(epoch));
		
	}

	
}
