package Com.pavan;

import java.util.*;

public class Marlabs3 {
	static short a=10;
	static short b=20;
	 void hello(int x,int y){
		System.out.println("int");
	}
	 
	 void hello(byte x,byte y){
			System.out.println("byte");
		}
	 
	 void hello(short x,short y){
			System.out.println("short");
		}
	public static void main(String[] args) {
		
		Marlabs3 marlabs3=new Marlabs3();
		marlabs3.hello(a*10, b*20);
		marlabs3.hello(a+10, b+20);
		marlabs3.hello(a-1, b-2);
		marlabs3.hello(a,b);
		ArrayList a=new ArrayList();
		Set s= new HashSet();
		
		
		
		
		
	}

}
