package com.niit;

public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j;
		// TODO Auto-generated method stub
		for ( i=0;i<2;i++)
			for( j=2;j>=0;j--){
				if(i==j) break;
				System.out.println(i+":   and  :"+j);
			
			}

	}

}
