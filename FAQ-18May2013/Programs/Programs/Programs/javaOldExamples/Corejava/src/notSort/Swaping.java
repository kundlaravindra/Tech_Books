package notSort;

public class Swaping {
public static void main(String[] args) {
	String s=System.getProperty("user.name");
	
	int a=1;
	int b=9;
	System.out.println(a+"and"+b);
	

	a=a^b;
	b=a^b;
	a=a^b;
System.out.println(s);
System.out.println(a+"and"+b);
	
	
	}

}
