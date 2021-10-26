package my;

public class Clone {
	Clone(){
		System.out.println("its cloning");
	}
public static void main(String[] args) throws CloneNotSupportedException {
	Clone c=new Clone();
//public Object Clone()Clone
Object d=c.clone();
System.out.println(c.hashCode());
System.out.println(d.hashCode());
	
	}

}
