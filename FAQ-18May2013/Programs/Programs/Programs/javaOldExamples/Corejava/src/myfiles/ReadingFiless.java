package myfiles;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
public class ReadingFiless  {
	public static void main(String[] args) throws IOException {
FileReader f=new FileReader("D:/Programs/Programs/javaOldExamples/Corejava/src/myfiles/ReadingFiless.java");
		//571 page
BufferedReader br=new BufferedReader(f);
//Scanner br = new Scanner(f);
String s;
int i =0;
//Set sh = new HashSet();
//while((s=br.next()) != null){
while((s=br.readLine()) != null){
	i++;
	//sh.add("}");
	System.out.println(s);
}
	f.close();
	//System.out.println(sh.size()+"-------");
	System.out.println(i);
	}

}
