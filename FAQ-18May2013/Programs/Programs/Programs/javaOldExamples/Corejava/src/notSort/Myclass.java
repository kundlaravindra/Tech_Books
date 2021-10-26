package notSort;
import java.io.*;
public class Myclass implements Serializable
 {
	 String s;
	 transient final static int i = 9;
	 transient static double d;
	public Myclass(String s,int i,double d){
		this.s=s;
		//this.i=i;
		this.d=d;
	}
	public String toString(){
		return "s="+s+"\n"+"i="+i+"\n"+"d="+d;
		
	}

}
