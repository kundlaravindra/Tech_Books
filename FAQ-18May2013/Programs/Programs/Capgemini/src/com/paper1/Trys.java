package com.paper1;

public class Trys {

	public static void main(String[] args) {
try {
	int s = 5/0;
} catch(Exception e) {
	//throw new Exception(); compile time exception
	new Exception();
	
}
finally {
	System.out.println("this will print");
}
	}

}
