package eprism;
class Fin{
	static int i=8;
	Fin(){
		//System.out.println("hi");
	}
	Fin(int a){
		System.out.println("hi----");
	}
   void sum(){
	  System.out.println(i);
		System.out.println("vinod");
	}
}
public class FinalTest extends Fin{
   void sum(int i){
	// r.sum();
	  System.out.println(i);
	System.out.println("rsreddy");
}
//Fin r=new Fin(9);

public static void main(String[] args) {

	FinalTest f= new FinalTest();
//System.out.println("my name");
//f.sum(3);
	}

}
