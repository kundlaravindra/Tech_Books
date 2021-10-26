package com.paper1;

public class CallwithNull {
public void call(Object o){
	System.out.println("Hi o");
}
public void call(String o){
	System.out.println("Hi s");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = null;
CallwithNull b = new CallwithNull();
b.call(s);
	}

}
