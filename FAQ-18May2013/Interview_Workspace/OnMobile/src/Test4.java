
public final class Test4 {

	class Inner{
		void test(){
			if(Test4.this.flag);{
				sample();
			}
		}
	}
	
	private boolean flag = true;
	
	public void sample(){
		System.out.println("Sample");
	}
	
	public Test4() {
		(new Inner()).test();
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test4();
	}

}
