package notSort;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Serialization {
public static void main(String[] args) {
	String value="";
try {
	char v1[] = value.toCharArray();
	Myclass m= new Myclass("hello",78,8.98);
	//System.out.println("m=\n"+m);
	File f= new File("raj1.txt");
	FileOutputStream fos= new FileOutputStream(f);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(m);
	//oos.flush();
	
	oos.close();			
}
catch (Exception e){
	System.out.println("Exception");
	System.exit(0);
}
try {
	Myclass m2;
	FileInputStream fis=new FileInputStream("raj1.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	m2=(Myclass)ois.readObject();
	ois.close();
	System.out.println(m2);
}
catch( Exception e1){
	System.out.println(e1);
	System.exit(0);
       }
	}
}
