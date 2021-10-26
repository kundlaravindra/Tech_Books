package com.toshiba.inheritanc;

public class B extends A{
	public void run() {
		try{
			System.out.println("rf");
		}
		catch(Exception e){
			System.out.println("ghh");
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
	B b = new B();
	b.run();
	//b.wait();
	/*System.out.println(b.getClass());
	A c = new B();
	B a = (B)c;
	System.out.println(c.getClass());
	Object o = new Object();
	System.out.println(o.getClass());*/
	
	

	}

}
