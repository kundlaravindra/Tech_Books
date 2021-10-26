package eprism;
public class MyAbstact {
protected abstract class My{
		 abstract public void sum();
		 void sub(){
			System.out.println("vinod");
		}
	}
	class Myy extends My{
		public void sum(){
			System.out.println("Dr. RSREDDY");
		}
	}
	
public static void main(String[] args) {
	MyAbstact a=new MyAbstact();
	Myy m=a.new Myy();
	m.sum();
	m.sub();
	
	}

}
