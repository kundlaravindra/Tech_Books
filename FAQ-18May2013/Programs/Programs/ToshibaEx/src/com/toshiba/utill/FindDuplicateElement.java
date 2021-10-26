package com.toshiba.utill;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {
@SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList();
list.add("A");
list.add("B");
list.add("C");
list.add("A");
list.add("D");
list.add("C");
list.add("E");
System.out.println("List:"+list);
Set set = new HashSet();
for(int i=0; i<list.size();i++){
	String s = (String)list.get(i);
	if(set.contains(s)){
	
		System.out.println("Duplicate found:" +s);
	}
	else {
		set.add(s);
	}
}

}

}
