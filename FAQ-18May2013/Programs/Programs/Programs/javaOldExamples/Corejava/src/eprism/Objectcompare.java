package eprism;
import java.util.*;
public class Objectcompare {
	String s;
	int i;
	Objectcompare(String q,int b){
		s=q;
		i=b;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		/*Integer i=2;
		List<Integer> y=new ArrayList<Integer>();
		y.add(1);
		y.add(2);
		y.add(3);
		y.add(4);
		*/
		//Object[] y=new Object[5];
		Objectcompare e=new Objectcompare("java",1);
		Objectcompare e1=new Objectcompare("java",1);
		List<Comparable> m=new ArrayList();
		List m1=new ArrayList();
		//y[0]=e;
		//y[1]=e1;
		//System.out.println(y[0].equals(y[1]));
		m.add(e.i+e.s);
		//m.add(e.s);
		m1.add(e1.i+e1.s);
		//m1.add(e1.s);
		System.out.println(m.equals(m1));
        /*Map l=new HashMap();
        Map l1=new HashMap();  
       // l.add(1,e);
        l.put(2,e.s);
		l.put(1,e.i);
		l1.put(2,e1.s);
		l1.put(1,e1.i);
		//System.out.println(getProperties("java.version"));
	//System.out.println(l);
	//System.out.println(l1);
	System.out.println(l1.equals(l));
	try{
		System.out.println("vinod");
	}
	catch(Exception q){
		System.out.println("in catch");
		}*/
	}}
