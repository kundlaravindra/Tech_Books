package Com.pavan;

public class Overloding {
	/*
	 * here we are creating same method name but diff arg and diff return types with in a single class
	 * if same return type but compulsory diff args is only possible.
	 * 
	 */
	
	public int sum(int x ,int y){
		int z=x+y;
		System.out.println(z);
		return z ;
	}
	public int sum(float x ,float y){
		float z=x+y;
		System.out.println(z);
		int w=0;
		return w ;
	}
	public double sum(double x ,double y){
		double z=x+y;
		System.out.println(z);
		return z ;
	}
	public int sum(double x ,int y){
		int q=20;
		double z=x+y;
		System.out.println(z);
		
		return q;
	}
	public String sum(String x ,String y){
		String z=x+y;
		System.out.println(z);
		return z ;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Overloding overloding =new Overloding();
		overloding.sum(10f, 2f);
		
		// TODO Auto-generated method stub

	}

}
