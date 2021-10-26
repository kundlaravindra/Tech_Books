package eprism;
import java.util.ArrayList;
//import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
public class DateSorting {
/**
 * @param args
 */
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	//System.out.format(t, "gjjkluy");
	//Calendar c1 = Calendar.getInstance();



/*SimpleDateFormat SDF = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
Date date1 = new Date("2012/12/12");
*/
	/*SimpleDateFormat SDF = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
	SimpleDateFormat date1 = new SimpleDateFormat("2012/12/12");
Date date=new Date();
System.out.println(SDF.format(date1));*/


	long k=System.currentTimeMillis();
	Date date=new Date(k);
	//String kk=String.valueOf(k);
	SimpleDateFormat SDF = new SimpleDateFormat();
	System.out.println(SDF.format(date));
	System.out.println(k);
	List<Datess> l=new ArrayList<Datess>();
/*l.add(new Datess(1,"vinod",new Date(Calendar c1 = Calendar.getInstance();
c1.set(2006, 12, 29);long l=c1.getTimeInMillis();));*/
l.add(new Datess(2,"vinod.m",new Date()));
l.add(new Datess(3,"vin",new Date("2012/12/12")));
l.add(new Datess(4,"vinodreddy",new Date("2013/12/12")));
l.add(new Datess(5,"vinodkumar",new Date("2011/12/12")));
Collections.sort(l);
for (Datess b:l){
	System.out.println(b.getI()+"---------"+b.getS()+"-----------------------"+b.getD());
}

Collections.sort(l,new Datess());
for (Datess a:l){
	System.out.println(a.getD()+"-------"+a.getS()+"---------"+a.getI());
}

	
	
}
	}


