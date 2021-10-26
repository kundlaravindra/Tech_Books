package com.core.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateDemo {
	
	public static void main(String args[])
	
	{	ApplicationContext context = new ClassPathXmlApplicationContext("com/core/hibernate/hibernate.xml");
		Employee emp = new Employee();
		//emp.setFirstName("Jack11");
		//emp.setLastName("Fuller11");
		//emp.setDept("technology consulting11");
		
		EmployeeDAO empDAO = (EmployeeDAO)context.getBean("employeeDAO");
		
		
		//empDAO.addEmployee(emp);
		
		empDAO.delEmployee(1);
		
		//Employee emp1 = empDAO.getEmployee(2);
		
		//System.out.println(emp1.getFirstName());
		
		
		
		
		
		
		
		
	}

}
