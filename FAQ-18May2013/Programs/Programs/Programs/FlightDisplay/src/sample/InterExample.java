package sample;

public abstract   class InterExample implements Sample , Sample2,Sample3 {
	interface infter{
		public void some();
	}
	public void method(){
		System.out.println("i am in class");
	}
	public void method(int y){
		System.out.println("i am in class"+y);
	}
}

