package sample;

import java.util.ArrayList;
import java.util.List;

public class NewEx {
int a;
String b;
	NewEx(int i,String s){
		a=i;
		b=s;
	}
	public static void main(String[] args) {
		NewEx n=new NewEx(1,"java");
		NewEx n1=new NewEx(1,"java");
		List i=new ArrayList();
		List i1=new ArrayList();
		i.add(n.a);
		i.add(n.b);
		i1.add(n1.a);
		i1.add(n1.b);
		String s="4"+5;
		//System.out.println(i.get(0));
		//System.out.println(i1);
		System.out.println(i.equals(i1));
		
		
	}

}
