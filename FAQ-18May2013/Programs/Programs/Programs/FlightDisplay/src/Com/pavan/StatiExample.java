package Com.pavan;

public class StatiExample {
	static boolean[] b = new boolean[8];
	static Boolean[] b1 = new Boolean[8];
	static int i=10;
	static void Do(){
		System.out.println("hello method");
	}
	static{
		System.out.println("hello block");
	}
	
	public static void main(String[] args) {
		
		StatiExample statiExample =new StatiExample();
		statiExample.Do();
		System.out.println(b[1]);
		System.out.println(b1[1]);
	}

}
