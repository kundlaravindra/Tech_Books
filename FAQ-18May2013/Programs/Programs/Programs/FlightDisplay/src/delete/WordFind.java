package delete;
	
	import java.io.File;
import java.io.IOException;
import java.util.Scanner;
	public class WordFind {
		public static void main(String[] args) throws IOException {
	File f=new File("Delete.java");
	Scanner br=new Scanner(f);
	String s="Deletetu";
	String s1="";
	while(br.hasNext()){
		s1=br.next();
		if(s1.equals(s))
		System.out.println("it is matched");
		
			}
			
		}

	}

