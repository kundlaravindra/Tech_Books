package eprism;

import java.util.Comparator;
import java.util.Date;

@SuppressWarnings("rawtypes")
public class Datess implements Comparable , Comparator{
	int i;
	String s;
	Date d;
	
	public Datess() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
public Datess(int i, String s,Date d) {
		this.i = i;
		this.s = s;
		this.d = d;
	}

public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

public int compareTo(Object o) {
	
	Datess d5=(Datess)o;
	return (this.d).compareTo(d5.getD());
	
}
public int compare(Object o7, Object o8) {
Datess d7=(Datess)o7;
Datess d8=(Datess)o8;
Date i=d7.getD();
Date j=d8.getD();
System.out.println(i);
		
		return i.compareTo(j);
	}
}
