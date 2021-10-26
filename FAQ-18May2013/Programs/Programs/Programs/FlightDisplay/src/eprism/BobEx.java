package eprism;

public class BobEx {
void print(int a){
	System.out.println("this is int");
}
void print(String s){
	System.out.println("this is String");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BobEx i=new BobEx();
		char c='g';
		i.print(c);
		String s="infoint";
		int b=s.indexOf("info");
		System.out.println(b);
		
	}

}
