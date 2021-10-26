package eprism;
class My2  {
	public static void main(String[] args) {
		My2 s=new My2();
		s.mr();
	}
	private void mr(){
		
		System.out.println("vinod");
	}
	
	}

public class Myclass extends My2  {

	
	
	public static void main(String[] args) {
	Myclass m=new Myclass();
	//My s=new My();
	//s.mr();
	m.mr();
	//m.ms();
	
	}
		public final void mr(){
			
			System.out.println("Ra");
		}
		
	}

