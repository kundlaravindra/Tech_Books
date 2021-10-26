package genericEx;

public class ClassEx<T> {
	
	T ob;
	ClassEx(T ob){
		this.ob=ob;
	}
	public T getob(){
		return ob;
	}
	public void showType(){
		System.out.println(ob.getClass().getName());
	}

}
