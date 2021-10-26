package eprism;
class X{
	
	X(){
		System.out.println("X");
	}
	Y b=new Y();
}
class Y{
	Y(){
		System.out.println("y");
	}
}
public class BobEx3 extends X
{
	Y y=new Y();
	BobEx3(){
		
		System.out.println("Z");
	}
	
public static void main(String[] args) {
 new BobEx3();
	}

}
