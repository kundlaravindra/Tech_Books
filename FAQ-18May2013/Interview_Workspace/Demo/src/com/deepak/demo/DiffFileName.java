package com.deepak.demo;

class FileName {

	String str1;
	
	public FileName() {
		this.str1 = "hello";
		/*Demo d = new Demo();
		if(d.str == this.str1){
			System.out.println("Same pool");
		}else{
			System.out.println("Different pool");
		}*/
	}
	public static void main(String[] args) {

		System.out.println("Hello World.");
		FileName d1 = new FileName();
		FileName d2 = new FileName();
		
		d1.
		if(d1.str1 == d2.str1){
			System.out.println("Same pool");
		}else{
			System.out.println("Different pool");
		}
	}

}
