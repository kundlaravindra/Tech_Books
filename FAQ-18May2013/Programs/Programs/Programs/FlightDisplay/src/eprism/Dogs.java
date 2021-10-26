package eprism;
import java.util.*;
@SuppressWarnings("rawtypes")
public class Dogs implements Comparator, Comparable{
	private String n;
	private Integer i;
	private Double d;
	
	public Dogs(){
	}
	
	public Dogs(String n, Integer i, Double d) {
		super();
		this.n = n;
		this.i = i;
		this.d = d;
	}
	
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
	public Double getD() {
		return d;
	}
	public void setD(Double d) {
		this.d = d;
	}
	public int compare(Object o1, Object o2) {
Dogs d1=(Dogs)o1;
Dogs d2=(Dogs)o2;
double i=d1.getD();
double j=d2.getD();
		
		return (int)i- (int)j;
	}

	public int compareTo(Object o) {
		Dogs d5=(Dogs)o;
		return (this.n).compareTo(d5.getN());
	}
}
