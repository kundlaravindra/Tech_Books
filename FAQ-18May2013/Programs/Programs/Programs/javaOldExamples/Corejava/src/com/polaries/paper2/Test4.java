package com.polaries.paper2;

public class Test4 {
	private Test4(){
		System.out.println("inside Test");
	}
	//new Example no 22
	/*public void test(int x){
		int odd=1;
		if(odd)
			System.out.println("odd");
		else
			System.out.println("even");
	}*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t=new Test4();
		// new example 18 no
		//float f=1f;
		//float f=1.0;
		//float f="1";
		//float f=1.0d;
		
		////////////////////////////////////////
		// new example 20 no
		final int[] i={1,2,3};
		i[1]=10;
		System.out.println(i[1]);
		final int s=9;
		//s=8;
		
		
	}

}
