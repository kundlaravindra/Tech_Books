//************************************
package com.polaries.paper2;
//*****************************************************************//
class Test8{
	Test8(int i){
		System.out.println("in int");
	}
	Test8(){
		
	}
}
public class Test5 extends Test8{
	Test5(String s){
		//super(7);
		System.out.println("in String");
		}
	
	/*Test5(){
		
	}*/
	
	public static void main(String[] args) {
		Test5 t=new Test5("test");
	System.out.println("raja"+t);
	//Test8 t1=new Test5();
		

	}

}
