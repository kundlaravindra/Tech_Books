package com.toshiba.files;

import java.io.*;

public class AppendFileExample
{
    public static void main(String[] args) 
    {
        File file = new File("D:/Programs/ToshibaEx/src/com/toshiba/files/user.txt");

        try 
        {            
           // FileWriter writer = new FileWriter(file, false); it will not append,
        	//it override full file
            FileWriter writer = new FileWriter(file, true);
            writer.write("username=kodejava;password=secret'/n'" );
                  //  + System.getProperty("line.separator"));
           // writer.flush();
            writer.close();
        } catch (IOException e) 
        {
            e.printStackTrace();
            System.out.println("jjjjjjjj");
        }
    }
}