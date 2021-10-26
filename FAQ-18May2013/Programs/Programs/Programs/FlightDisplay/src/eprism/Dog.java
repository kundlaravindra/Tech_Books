package eprism;
import java.util.*;

public class Dog {
	private int age;
	private String name;
	Dog(int n,String a){
		name=a;
		age=n;
	}
	@SuppressWarnings("rawtypes")
	List l=new ArrayList();
	//l.add(1,"java");
		
	@SuppressWarnings("unused")
	public static void main(String[] args){
		
		Dog obj1=new Dog(1,"java");
		Dog obj2=new Dog(1,"java");		
}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
//l.add(obj.getAge());
	
}