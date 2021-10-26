package sample;

import java.io.IOException;

public class Exceptionpoly extends ExceptionEx{
	public void r(){
		System.out.println("hgfytt");
	}
public void run(){
	int p=9;
	r();
	System.out.println("rsreddy");
	sum(p);
}
public static void sum(int a){
	System.out.println("fiytri7ri"+a);
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptionpoly e=new Exceptionpoly();
		try{
		e.run();
			throw  new NullPointerException();
		}
		catch (Exception t){
			System.out.println("ufuP"+t);
		}
		catch (Throwable t){
			System.out.println(t);
		}
		
		
		finally{
			System.out.println("reddy");
		}
		//System.out.println("ghutr");
	}

}
