package eprism;

public class BobEx5 {
public static void main(String[] args) {
boolean t=true;
boolean s=false;
boolean r=true;
if(t==true)
	if(s==true)
		if(r==true)
			System.out.println("its in if");
		else
			System.out.println("it is in else");
	else if(t && (s=r))
		System.out.println("its in");
	else 
		System.out.println("its main else");
	
	
	
	}

}
