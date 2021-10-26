package com.core.hibernate;

public interface EmployeeDAO {
	
	public void addEmployee(Employee e);
	public Employee getEmployee(long id);
	public void delEmployee(long id);
	public void insertNamedEmployee(Employee e);
	

}
