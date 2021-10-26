package sortings;
import java.util.*;
public class StringTokenizers {
	static String s="Fname=rajashekar;"+"Lname=reddy;"+"phno=9848935359;";
public static void main(String[] args) {
	Map m=new HashMap();
	String s4;
	//Enumeration<String> e;
	StringTokenizer st=new StringTokenizer(s,"=;");
	while(st.hasMoreTokens()) {
		String key=st.nextToken();
		String val=st.nextToken();
		System.out.println(key+":"+val);
		//System.out.println("\n");
	m.put(key,val);
	
	}
	//e=m.keys();
	Set<String> s1=m.keySet();
	Iterator r=s1.iterator();
	while( r.hasNext()){
		 s4=(String)r.next();
	//	System.out.println(s4+"="+m.get(s4));
	}


	}
}
