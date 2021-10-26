package logic;
import java.util.*;

public class Sun {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Short> s = new HashSet<Short>();
		for(Short i=0;i<100;i++){
			s.add(i);
			
			s.remove(i-1);

		}
System.out.println(s.size());
	}

}
