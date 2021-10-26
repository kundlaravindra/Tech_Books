package eprism;
public class MyPrivate {
	static class mys{
		
	}
	
	private interface I{
//static interface I{
	//protected interface I{
//	abstract interface I{
	 void sum();
}
//static class My implements I{
	//private class My implements I{
class My implements I{
	public void sum(){
		System.out.println("in interface");}
		public void sub(){
			System.out.println("rsr");
		}}
void sub(){
	System.out.println("vinod");
	//mys m=new  mys();
	//m.sum();
}
public static void main(String[] args) {
	MyPrivate a=new MyPrivate();
a.sub();
}}


