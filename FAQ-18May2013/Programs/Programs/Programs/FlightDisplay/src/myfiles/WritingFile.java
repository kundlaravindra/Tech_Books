package myfiles;
import java.io.*;
public class WritingFile {
	static FileInputStream fis;
		static FileOutputStream fos;
		static int i;
		
	public static void main(String[] args) throws IOException{
		
		try{
	 fis=new FileInputStream("first.txt");		
	}
		catch(Exception e){
		System.out.println(e);
		}
	try{
		fos =new FileOutputStream("second.txt");
	}
	catch(Exception e1){
		System.out.println(e1);
	}
	try{
		do{
			i=fis.read();
			if(i != -1)
				fos.write(i);
			
		}while(i != -1);
		
	}
	catch(Exception e2){
		System.out.println(e2);
	}
	}


	}

