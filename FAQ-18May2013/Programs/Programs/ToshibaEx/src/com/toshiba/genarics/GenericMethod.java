package com.toshiba.genarics;

public class GenericMethod {

	static <T, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length; i++)
		if(x.equals(y[i])) return true;
		return false;
	}
	
	 <T> void isIn(T y) {
		 String x = y.toString();
		System.out.println(x);
		
	}
			public static void main(String[] args) {
				GenericMethod g = new GenericMethod();
//Use isIn() on Integers
				Integer nums[] = {1,2,3,4,5};
				if(isIn(2, nums))
					System.out.println("2 is  it is num");
				if(isIn(7, nums))
					System.out.println("7 not  it is num");
				String str[] = {"one","two","three","four"};
				//if(isIn(2, str)) It willgive error
				if(isIn("one", str))
					System.out.println("one is  it is str");
				if(!isIn("seven", str))
					System.out.println("seven is  it is str");
				g.isIn(5);
				g.isIn("Raju");
	}

}
