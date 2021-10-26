package Com.pavan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		List list= new ArrayList();
		list.add("a");
		list.add(0,"b");
		list.add(1,"c");
		list.add(1,"d");
		list.add(3,"d");
		System.out.println("List is ...."+list);
		
		
		int size=list.size();
		Object element = list.get(list.size()-1);
		
		
		System.out.println("Element at "+size+"location is "+element);
		
		
		element=list.get(0);
		
		System.out.println("--------------"+element);
		
		Collections.sort(list);
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		
		System.out.println("================"+list);
		boolean b= list.remove("c");
		//element=list.delete(0);
		System.out.println("dddddddd....."+b);

	}

}
