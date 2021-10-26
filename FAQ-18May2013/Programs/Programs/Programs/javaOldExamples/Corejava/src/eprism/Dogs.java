package eprism;
import java.util.*;
@SuppressWarnings("rawtypes")
public class Dogs implements Comparator, Comparable{
	private String name;
	private Integer id;
	private Double salary;
	
	public Dogs(){
	}
	
	
	public Dogs(String name, Integer id, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public int compare(Object object1, Object object2) {
Dogs d1=(Dogs)object1;
Dogs d2=(Dogs)object2;
double i=d1.getSalary();
double j=d2.getSalary();
		
		return (int)i- (int)j;
//return this.i.compareTo(d1.i);
	}

	public int compareTo(Object o) {
		Dogs d5=(Dogs)o;
		return (this.name).compareTo(d5.getName());
	}
}
