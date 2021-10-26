package eprism;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
public class SalarySort {
	int i=9;
@SuppressWarnings("unchecked")
public static void main(String[] args) {
Vector<Dogs> vector = new Vector<Dogs>();
	//List l=new ArrayList();
vector.add(new Dogs("vinod",9,40000.00));
vector.add(new Dogs("vinod.m",5,49000.00));
vector.add(new Dogs("vin",4,46000.00));
vector.add(new Dogs("vinodreddy",7,40780.00));
vector.add(new Dogs("vinodkumar",1,40067.00));
Collections.sort(vector);
for (Dogs b:vector){
	System.out.println(b.getName()+"...."+b.getId ()+"...."+b.getSalary());
}
/*Collections.sort(l,new Dogs());
for (Dogs a:l){
	//System.out.println(a.getD()+a.getN()+a.getI());
}*/


List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");


//Iterator ir = l.iterator();
//Collections.sort(vector,new Dogs());
Iterator<Dogs> ir = vector.iterator();
while (ir.hasNext()){
	//Dogs dg = ()ir.next();
	Dogs dg = ir.next();
	System.out.println(dg.getName());
	//Dogs d = l.elementAt(0);
    /*Dogs d1 = l.get(0);
	System.out.println(d1.getD());
	System.out.println(d1.getN());
	System.out.println(d1.getI());*/
}

}
	}


