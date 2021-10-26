package Com.pavan;

public class InterClass implements InterFace {

	public void book() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		InterClass InterClass =new InterClass();
		InterFace i=new InterClass();
		
		
		Test ts=new Test();
		ts.book();
		int j=ts.i;
		System.out.println(ts.i);
		System.out.println("........./////."+j);
	}

}
