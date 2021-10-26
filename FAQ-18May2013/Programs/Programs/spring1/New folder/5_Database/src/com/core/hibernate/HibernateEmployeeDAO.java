package com.core.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class HibernateEmployeeDAO implements EmployeeDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public HibernateEmployeeDAO(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
		
		
	}
	
	
	
	public void addEmployee(Employee e) {
		
		sessionFactory.getCurrentSession().save(e);
		System.out.println("Log: Employee Inserted");
		
		
	}

	

	@SuppressWarnings("deprecation")
	
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		return (Employee)sessionFactory.getCurrentSession().get(Employee.class, id);
		
		
		
		
	}

	
	public void delEmployee(long id) {
		Employee emp = (Employee)sessionFactory.getCurrentSession().get(Employee.class, id);
		
		sessionFactory.getCurrentSession().delete(emp);
		
	}


	public void insertNamedEmployee(Employee e) {
		
		System.out.println("Log: Employee Inserted");
		
		
		
		
	}

}
