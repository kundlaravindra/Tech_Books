package Com.pavan;

import java.io.IOException;



public class OverRiding2 extends OverRiding {
	int i=20;
	public  void Fare(){
		System.out.println("this is fare child ");
		
	}
	/*here we are doing co-varient return type ,we have to return object here string obj passing 
	 * it is accepted but in reverse we get CE. 
	 * (non-Javadoc)
	 * @see Com.pavan.OverRiding#object()
	 */
	public Object object() {
		String str = "hello";
		System.out.println("this is child object method");
		
		return str;
	}
	public void Book()throws IOException {
		System.out.println("i m in child book");
	}
	/*here i am trying to do static method overriding ,we can override 
	 * it but parent is hiding the child method 
	 * when ever u calling in dynamic poly it calls only parent method.
	 * if we want to override staic with non static or non static with  static  we get CE
	 * 
	 */
	public static int Shedule(){
		System.out.println("this is child shedule");
		return 0;
	}
	/*here  i am trying to do final ovrriding but it can not override it gives CE
	public final void price(){
		System.out.println("this is final method of parent price");
	} */

	/**
	 * @param args
	 * @throws Exception 
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Exception  {
		String s[]={};
		// TODO Auto-generated method stub
		OverRiding pover =new OverRiding();
		
		//pover.Book();
		//pover.Fare();
		OverRiding2 cover = new OverRiding2();
		//cover.Book();
		//cover.Shedule();
		OverRiding over =new OverRiding2();
		over.Book();
		/*
		 * the book in parent having exception but in child we does't handle exception then
		 * we calling that method that time we get "Unhandled exception type Exception" Error
		 * in child compulsory handle that exception .for that u need to call throws Exception 
		 * at main method.
		 */
		over.Shedule();
		over.Fare();
		over.object();
		System.out.println(over.i);

	}

}
