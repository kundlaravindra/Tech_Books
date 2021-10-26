package com.sun;

public class PrivateOverRide1 extends PrivateOverRide{
	static PrivateOverRide1 pr;
private void sum1(){
	pr.run();
	System.out.println("i am in sub class");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am in main");
pr=new PrivateOverRide1();
		//PrivateOverRide p=new PrivateOverRide();
		//p.sum();
		pr.sum1();
		//pr.run();

	}

}
