package eprism;
public final class Imutabule {
	private int i;
	Imutabule(int i){
		this.i=i;}
public Imutabule modify(int i)
{if(this.i==i)
		return this;  else
		return (new Imutabule(i));	
}
public static void main(String[] args) {
	//int n=9;
Imutabule t1=new Imutabule(10);
Imutabule t2=t1.modify(10);
Imutabule t3=t1.modify(10);
Imutabule t4=t3.modify(10);
System.out.println(t1==t2 );
System.out.println(t1==t3 );
System.out.println(t3==t4);
String s=new String("vinod");
System.out.println(s.length());
Double g=new Double(10.0);
int k=10;
System.out.println(k);
System.out.println(g.hashCode());
}}
