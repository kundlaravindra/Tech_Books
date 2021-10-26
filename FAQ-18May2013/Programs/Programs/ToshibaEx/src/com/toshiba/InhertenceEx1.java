package com.toshiba;

public class InhertenceEx1 extends InhertenceEx {
	private void sum() {
		System.out.println("hi+++++++++");
	}
	
	public static void sum2(){
		System.out.println("static++++++++++++++");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InhertenceEx1 i = new InhertenceEx1();
		//i.sum();
		//i.sum1();
		//sum2();
		InhertenceEx i1 = new InhertenceEx1();
		i1.sum2();
		i.sum2();

	}

}
