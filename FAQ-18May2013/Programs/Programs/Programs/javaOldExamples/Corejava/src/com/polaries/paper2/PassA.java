package com.polaries.paper2;

import javax.swing.tree.FixedHeightLayoutCache;

public class PassA {
	void start(){
		long[] a1={3,4,5};
		long[] a2=fix(a1);
		System.out.println(a1[0]+""+a1[1]+""+a1[2]+"");
		System.out.println(a2[0]+a2[1]+a2[2]);
	}
	long[] fix(long[] a3){
		a3[1]=7;
		return a3;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassA p=new PassA();
		p.start();
	}

}
