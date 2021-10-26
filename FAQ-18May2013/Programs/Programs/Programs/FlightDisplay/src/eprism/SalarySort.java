package eprism;
import java.util.*;
public class SalarySort {
	int i=9;
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	List<Dogs> l=new ArrayList<Dogs>();
l.add(new Dogs("vinod",9,40000.00));
l.add(new Dogs("vinod.m",5,49000.00));
l.add(new Dogs("vin",4,46000.00));
l.add(new Dogs("vinodreddy",7,40780.00));
l.add(new Dogs("vinodkumar",1,40067.00));
Collections.sort(l);
for (Dogs b:l){
	System.out.println("\t"+b.getI()+"\t"+b.getN()+"\t"+b.getD());
}
System.out.println("///////////////////////////////////////////////////////////////");
Collections.sort(l,new Dogs());
for (Dogs b:l){
	System.out.println("\t"+b.getI()+"\t"+b.getN()+"\t"+b.getD());
}

	
	
}
	}


