package Com.pavan;

public interface InterFace {
	/*
	 * in interface we declare or not a varible that is must and sould staic final compulsory initialise
	 * otherwise we get CE.
	 * in methods takes only default public as modifer other than public it will give CE.
	 */
	int x=10 ;
	 void book();
 interface Tty{
	 int book1();
		
	}
 class Test {
	public int book(){
		System.out.println("inside");
		 return 1;
	 }
		 
	 
 
 
		int i=10;
		
		public void hello(){
			book();
			System.out.println("this is interface Test class hello method");
		}
	

}}
