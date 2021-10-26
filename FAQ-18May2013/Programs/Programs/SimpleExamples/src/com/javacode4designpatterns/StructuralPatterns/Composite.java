package com.javacode4designpatterns.StructuralPatterns;
import java.util.Vector;
class Employee { 
  private String name;
private double salary;
private Vector subordinates;

public Vector getSubordinates() {
return subordinates;
} 
public void setSubordinates(Vector subordinates) {
this.subordinates = subordinates;
}


// constructor
public Employee(String name, double sal) {
setName(name);
setSalary(sal);
subordinates = new Vector();
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public double getSalary() {
return salary;
}

public void setSalary(double salary) {
this.salary = salary;
}

public void add(Employee e) {
subordinates.addElement(e);
}

public void remove(Employee e) {
subordinates.remove(e);
}

 
}// End of interface 

/**
* This will add employess to the tree. The boss, is PM
* and has subordinates.
*/ 
  private void addEmployeesToTree() { 
CFO = new Employee("CFO", 30000);

Employee headFinance1 = new Employee("Head Finance. North Zone", 20000);
Employee headFinance2 = new Employee("Head Finance. West Zone", 22000);

Employee accountant1 = new Employee("Accountant1", 10000);
Employee accountant2 = new Employee("Accountant2", 9000);

Employee accountant3 = new Employee("Accountant3", 11000);
Employee accountant4 = new Employee("Accountant4", 12000);

CFO.add(headFinance1);
CFO.add(headFinance2);

headFinance1.add(accountant1);
headFinance1.add(accountant4);

headFinance2.add(accountant2);
headFinance2.add(accountant3);
 
}// End of class 
