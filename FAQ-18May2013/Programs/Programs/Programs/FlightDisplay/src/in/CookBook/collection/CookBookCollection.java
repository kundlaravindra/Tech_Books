package in.CookBook.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CookBookCollection {

public static void main(String args[]) {
List<CollectionBean> result = new ArrayList<CollectionBean>();
CollectionBean cb1 = new CollectionBean("1", "abc");
CollectionBean cb2 = new CollectionBean("2", "dsd");
CollectionBean cb3 = new CollectionBean("3", "gffg");
CollectionBean cb4 = new CollectionBean("4", "sfsd");
CollectionBean cb5 = new CollectionBean("5", "3343");
//##duplicate values#
CollectionBean cb6 = new CollectionBean("1", "abc");
List<CollectionBean> l=new ArrayList<CollectionBean>();
l.add(cb1);
l.add(cb2);
l.add(cb3);
l.add(cb4);
l.add(cb5);
l.add(cb6);
for(CollectionBean o:l){
	if (!result.contains(o)) {
		result.add(o);
		}	
}

/*//System.out.println(result.contains(cb1));
if (!result.contains(cb1)) {
result.add(cb1);
}
//System.out.println(result.contains(cb1));
if (!result.contains(cb2)) {
result.add(cb2);
}
if (!result.contains(cb3)) {
result.add(cb3);
}
if (!result.contains(cb4)) {
result.add(cb4);
}
//System.out.println(result.contains(cb1));
if (!result.contains(cb5)) {
result.add(cb5);
}
if (!result.contains(cb6)) {
result.add(cb6);
}
*/
System.out.println("List Value before sorting");

for (CollectionBean cb : result) {
System.out.println("idd-->" + cb.getId() + "'&& name---->"
+ cb.getName());
}

Collections.sort(result);

System.out.println("List Value after sorting && Remove duplicates");
for (CollectionBean cb : result) {
System.out.println("idd-->" + cb.getId() + "'&& name---->"
+ cb.getName());
}

}

}
