package com.others;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "RajashekarReddy";
		String s;
		StringReader sr = new StringReader(str);
		PrintWriter pw;
		
		//String
		try {
		 pw = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
		
		int c;
		while((c=sr.read())!= -1)
		{
			//System.out.println(sr.read());
			System.out.println((char)c);
			pw.write((char)c);
		}
		sr.close();
		
		pw.close();
		}
		catch (Exception e){
			System.out.println("hi");
			
		}


	}

}
