package sample;


	public class Interch extends InterExample{
		public void method(int x,int y){
		}
		public static void main(String[] args) {
			Interch interch=  new Interch();
			
	int x=6;
	int y=7;
	int a=x++ + y++;
	System.out.println(a);
	System.out.println(x);
	System.out.println(y);
	
			System.out.println(Sample.i);
			Sample s= new Interch();
			Sample2 s2= new Interch();
			s2.method(20);
			s.method();
			
		}
		}


