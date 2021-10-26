package myfiles;

import java.io.*;

public class ReadingFile {
	static FileInputStream fis;
	
	static int i;
	
public static void main(String[] args) throws IOException{
	
	try{
 fis=new FileInputStream("first.txt");		
}
	catch(Exception e){
	System.out.println(e);
	}
do {
	i=fis.read();
	if(i != -1)
		System.out.print((char)i);
	
}while(i != -1);
fis.close();
	
}


}
