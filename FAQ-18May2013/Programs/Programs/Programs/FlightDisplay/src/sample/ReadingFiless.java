package sample;

import java.io.*;
public class ReadingFiless  {
	public static void main(String[] args) throws IOException {
FileReader f=new FileReader("ClaaIlp.java");
		//571 page
BufferedReader br=new BufferedReader(f);
String s;
while((s=br.readLine()) != null){
	System.out.println(s);
}
	f.close();
	}

}

