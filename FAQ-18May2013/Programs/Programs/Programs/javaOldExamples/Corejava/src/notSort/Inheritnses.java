package notSort;
class my{
	 void m1(){
	System.out.println("super class");	
	}
}
public class Inheritnses extends my{
	 void m(){
		System.out.println("sub class");
	}
public static void main(String[] args) {
	//Inheritnses m=new Inheritnses();
my m=(my)new Inheritnses();
Inheritnses m1=(Inheritnses)m;
	m1.m1();
m1.m();
	
	//Inheritnses m=new my();
	
	}

}
