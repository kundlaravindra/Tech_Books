package notSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2String {

public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ;
String s=br.readLine();
int n=s.length();
int m=n;

int l=Integer.parseInt(s);
int k=l%100;
System.out.println(k);
int a=l%10;
if(a==0){
	m=m-2;
}

if(k<=11 || k<=19 ){
	m=m-2;
	System.out.println(k);
}
for(int i=0;i<m;i++){
	int j=Character.digit(s.charAt(i),11);
	switch(j){
	case 0:System.out.print("zero");
	break;
	case 1:System.out.print("one");
	break;
	case 2:System.out.print("two");
	break;
	case 3:System.out.print("three");
	break;
	case 4:System.out.print("four");
	break;
	case 5:System.out.print("five");
	break;
	case 6:System.out.print("six");
	break;
	case 7:System.out.print("seven");
	break;
	case 8:System.out.print("eight");
	break;
	case 9:System.out.print("nine");
	break;	
	}
	if(n==4){
		System.out.print("thousand,");
	}
	if(n==3){
		System.out.print("Hundred,");	
	}
	--n;			
}
if(k>10 || k<20){
	switch(k){
	case 11:System.out.println("eleven");
	break;
	case 20:System.out.println("twenty");
	break;
	case 30:System.out.println(" therty");
	break;
	

	}
}
	
	
	}
}


