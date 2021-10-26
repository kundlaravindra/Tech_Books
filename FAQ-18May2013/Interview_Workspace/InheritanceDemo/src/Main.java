
public class Main {

	public static void main(String[] args){
		
		A a = new B();
		a.foo();
		a.bar();
		System.out.println(a.a);
		B b = (B) new A();
		b.foo();
		//b.bar();
		System.out.println(b.b);
	}
}
