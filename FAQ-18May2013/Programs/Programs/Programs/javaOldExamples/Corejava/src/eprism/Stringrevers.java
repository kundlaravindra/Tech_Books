package eprism;

import java.io.*;

public class Stringrevers {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
int i,j,l,Flag=0;
l=s.length();
 for(i=0,j=l-1;i<=j;i++,j--){
	 if(s.charAt(i)==s.charAt(j)){
		 Flag=1;	 
 }
	 else{
		 Flag=0;
	 break;
	 }
	}
 if(Flag==1)
	 System.out.println(s+"-------is polindram");
 if(Flag==0)
	 System.out.println(s+"----is Not palindram");

}}
