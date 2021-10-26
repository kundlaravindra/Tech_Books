package com.paper1;

public class TryEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = new int[4];
		//int c;;
		try {
			//System.out.println(c);
			//int[] b = new int[4];
			int t = 10/0;
		} catch(ArithmeticException a){
			System.out.println(b[2]);
			System.out.println(a);
			
		}
		finally{
			System.out.println("hiii");
		}

	}

}
