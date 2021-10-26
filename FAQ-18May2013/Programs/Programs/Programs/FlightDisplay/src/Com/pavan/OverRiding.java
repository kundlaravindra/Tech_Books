package Com.pavan;




public class OverRiding extends OverRideAbstarct{
	static int i=10;
	
	public  void Fare(){
		System.out.println("this is fare parent ");
		
	}
	public static int Shedule(){
		System.out.println("this is parent shedule");
		return 0;
	}
	
	public void Book() throws Exception{
		System.out.println("i m in parent book"+i);
	}
	
	public final void price(){
		System.out.println("this is final method of parent price");
	}
	
	public Object object() {
		System.out.println("this is parent object method");
		
		return null;
	}
	public static void main(String[] args)throws Exception {
		System.out.println("hello");
	}

}
