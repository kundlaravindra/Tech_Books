package com.paper2;

public class EqualsMethod {

	EqualsMethod(int i){
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsMethod e1 = new EqualsMethod(3);
		EqualsMethod e2 = new EqualsMethod(3);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));

	}
	public int hashCode(){
		return 1;
	}

}
