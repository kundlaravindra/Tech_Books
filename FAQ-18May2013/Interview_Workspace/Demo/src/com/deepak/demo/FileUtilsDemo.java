/**
 * 
 */
package com.deepak.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kumadeep
 *
 */
public class FileUtilsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File file = new File("d:\\processed\\Excel Sent to Vendor.xlsx");
		
		System.out.println(file.getName());
		
		//File file1 = new  File(file.getAbsolutePath());
		moveFile(file);
		
		System.out.println(convertToString(new Date()));
	}
	
	public static void moveFile(File file){
		File tempFile = new File(file.getParent()+"\\processed\\");
		System.out.println(tempFile.exists());
		
		if(!tempFile.exists()){
			System.out.println("Directory Created : "  + tempFile.getAbsolutePath() + " : " + tempFile.mkdir());
		}else{
			System.out.println(tempFile.getAbsolutePath() + " File Already exists.");
		}
		
		String strDate = convertToString(new Date());

		tempFile = new File(tempFile.getAbsolutePath()+ "\\"+strDate);
		File newFile = new File(file.getParent()+"\\processed\\" + strDate + "\\" +file.getName());
		if(!tempFile.exists()){
			System.out.println("Directory Created : " + newFile.getAbsolutePath() + " : " + tempFile.mkdir());
		}else{
			System.out.println(newFile.getAbsolutePath() + " File Already exists.");
		}
		try {
			Files.move(file.toPath(), newFile.toPath(), StandardCopyOption.ATOMIC_MOVE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String convertToString(Date date){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
		return formatter.format(date);
	}
	
}
