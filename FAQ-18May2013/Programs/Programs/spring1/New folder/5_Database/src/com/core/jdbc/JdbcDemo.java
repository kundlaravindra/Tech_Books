package com.core.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {
	
	public static void main(String args[])
	
	{	ApplicationContext context = new ClassPathXmlApplicationContext("com/core/jdbc/jdbc.xml");
		Employee emp = new Employee();
		emp.setFirstName("Jack");
		emp.setLastName("Fuller");
		emp.setDept("technology consulting");
		
		EmployeeDAO empDAO = (EmployeeDAO)context.getBean("employeeDAO");
		
		//empDAO.insertNamedEmployee(emp);
		empDAO.delEmployee(1);
		
		Employee emp1 = empDAO.getEmployee(2);
		
		System.out.println(emp1.getFirstName());
		
		
		
		
		
		
		
		
	}

}
