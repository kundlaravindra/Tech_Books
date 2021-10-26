package Com.pavan;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionClass {
	/*int a=10,b=0,c;
	@SuppressWarnings("finally")
	public int hello(){
		try {
			@SuppressWarnings("unused")
			FileInputStream f=new FileInputStream("elwqq");
			c=a/b;
			
			return 20;
		} 
		
		catch (IOException e){
			
		}
		 catch (NullPointerException e) {
				System.out.println("exception catch blockNull");
				System.exit(1);
				return 1;
				
			}
		 catch (ArithmeticException e) {
				System.out.println("exception catch blockArth");
				
				return 1;
				
			}
		
		 catch (Exception e) {
				System.out.println("exception catch block");
				return 1;
			}
		
		finally {
			System.out.println("this is finally block");
			return 10;
		}
		
	}
	*/
		
	public static void main(String[] args) {
		
		/*ExceptionClass exceptionClass = new ExceptionClass();
		int x=exceptionClass.hello();
		System.out.println("this is from main"+x);
		*/
		
		int i=30;
		int j=21;
		System.out.println(j | i);
	}
}
