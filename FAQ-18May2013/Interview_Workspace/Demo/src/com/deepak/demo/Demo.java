/**
 * 
 */
package com.deepak.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

import javax.management.ImmutableDescriptor;

import com.deepak.immutable.ImmutableDemo;

/**
 * @author kumadeep
 *
 */
public class Demo extends ImmutableDemo{

	String str;
	int i = 1_000_000;
	
	public Demo() {
		
		this.str = "hello";
	}
	public static void method(){
		System.out.println("m1");
	}
	/**
	 * @param args
	 * @throws ParseException 
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		int i = 10 + + 11 - - 12;// + + 13 - - 14;
		System.out.println("i:" + i);
		
		Demo d = new Demo();
		d.clone();
		
		String s1= "baab";
		
		//s1 = s1.substring(0, 2) + s1.substring(2+2, s1.length());
		s1 = s1.replaceAll("(.)\\1", "");
		
		System.out.println("s1 : " + s1);
		
		//System.out.println(reverse("abb"));
		
		/*String str = "00001111";
		System.out.println(str);
		System.out.println(str.getBytes());
		
		Date date = new Date();
		System.out.println(date.toGMTString());
		System.out.println(convertDatetoGMTString(date));*/
		//System.out.println(convertStringToGMTDateString("Tue Jul 21 00:00:00 EDT 2015"));
		
		int random = ((int) (Math.random()*100))%5;
		
		if(random == 1|| random ==2){
			System.out.println("Paper");
		}else if(random ==3 || random == 4){
			System.out.println("Stone");
		}else{
			System.out.println("Scissors");
		}
		System.out.println(random);
	}
	
	public static String convertDatetoGMTString(Date date){
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    sd.setTimeZone(TimeZone.getTimeZone("GMT"));
	    return sd.format(date) ;
	}
	
	
	public static String convertStringToGMTDateString(String dateString) throws ParseException{
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date date = (Date)formatter.parse(dateString);
		return convertDatetoGMTString(date);
	}
/*	public static String reverse(String str){
		char[] ch = new char[str.length()];
		System.out.println(str.length());
		for(int i = 0; i < str.length()/2;i++){
			ch[str.length()-1-i] = str.charAt(i);
			ch[i]=str.charAt(str.length()-i-1);
		}
    	
		if((str.length()%2) !=0){
			ch[str.length()/2] = str.charAt((str.length()/2)+1);
		}
    	return new String(ch);
    }*/

	
	
}
