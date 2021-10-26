package myfiles;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ReadingFiless  {
	public static void main(String[] args) throws IOException {
FileReader f=new FileReader("WritingFile.java");

		//571 page
//BufferedReader br=new BufferedReader(f);
Scanner br=new Scanner(f);

//List s1=new ArrayList();
String s;
String s1=new String();
while((s=br.next()) != null){
	//System.out.println(s);
	s1=s1+s;
	
	
}
s1.trim();
System.out.println(s1.length());
//System.out.println(br.);
	f.close();
	}

}
