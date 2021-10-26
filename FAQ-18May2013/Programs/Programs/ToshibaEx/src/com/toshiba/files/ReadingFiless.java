package com.toshiba.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFiless  {
	public static void main(String[] args) throws IOException {
try {
	File a = new File("D:/Programs/ToshibaEx/src/com/toshiba/files/ReadingFiless.java")	;
	FileReader f=new FileReader(a);
		//571 page
//BufferedReader br =new BufferedReader(f);
Scanner br = new Scanner(f);
String s;
//while((s=br.readLine()) != null){
	while((s=br.next()) != null) {
	System.out.println(s);
}
	f.close();
	}
catch(FileNotFoundException e){
	System.out.println("notfound");
}
	}
}