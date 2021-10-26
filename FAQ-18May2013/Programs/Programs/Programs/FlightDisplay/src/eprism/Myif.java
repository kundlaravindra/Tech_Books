package eprism;

public class Myif {
	void my(String s){
		if(s==null){
		System.out.println("true");	
	}	
		else{
			System.out.println("false");
			}	
	}
public static void main(String[] args) {
Myif m=new Myif();
String s1=null;
//String s=new String(s1);
m.my(s1);
//boolean b=false;
//b=True; //this way it is not work
}
}
