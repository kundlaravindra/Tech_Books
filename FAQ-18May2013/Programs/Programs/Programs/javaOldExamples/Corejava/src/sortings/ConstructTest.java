package sortings;

public class ConstructTest {
static private int c;
private int d;
	/**
	 * @param args
	 */
	ConstructTest(){
	// int i=9;
		c=80;
		d=40;
		System.out.println(c);
		System.out.println(d);
	}
	ConstructTest(int a,int d){
		c=a;
		this.d=d;
		System.out.println(c);
		System.out.println(this.d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructTest a=new ConstructTest(100,200);
		//ConstructTest b=new ConstructTest();
		//String s="vinod";
		//char c=s.charAt(9);
		System.out.println(a);
	}

}
