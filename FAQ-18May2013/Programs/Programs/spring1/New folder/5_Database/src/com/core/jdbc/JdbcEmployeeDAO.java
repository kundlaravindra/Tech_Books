package com.core.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JdbcEmployeeDAO implements EmployeeDAO {

	SimpleJdbcTemplate jdbcTemplate;
	
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		String INSERT_EMP_SQL = "INSERT INTO EMPLOYEE(FIRST_NAME,LAST_NAME,DEPT)VALUES(?,?,?)";
		jdbcTemplate.update(INSERT_EMP_SQL, e.getFirstName(),e.getLastName(),e.getDept());
		System.out.println("Log: Employee Inserted");
		
		
	}

	public SimpleJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		String GET_EMP_SQL = "SELECT * FROM EMPLOYEE WHERE ID = ?";
		return jdbcTemplate.queryForObject(GET_EMP_SQL, new ParameterizedRowMapper<Employee>(){
			public Employee mapRow(ResultSet rs, int row) throws SQLException
			{	Employee emp = new Employee();
			emp.setFirstName(rs.getString(2));
			emp.setLastName(rs.getString(3));
			emp.setDept(rs.getString(4));
			return emp;
				
			}
			
		}, id);
		
		
	}

	@Override
	public void delEmployee(long id) {
		// TODO Auto-generated method stub
		String DEL_EMP_SQL = "DELETE FROM EMPLOYEE WHERE ID = ?";
		jdbcTemplate.update(DEL_EMP_SQL,id);
		System.out.println("Log: Employee Deleted");
		
		
	}

	@Override
	public void insertNamedEmployee(Employee e) {
		// TODO Auto-generated method stub
		String INSERT_EMP_SQL = "INSERT INTO EMPLOYEE(FIRST_NAME,LAST_NAME,DEPT)VALUES(:first,:last,:dept)";
		Map<String,Object>params=new HashMap<String,Object>();
		params.put("first",e.getFirstName());
		params.put("last",e.getLastName());
		params.put("dept",e.getDept());
		jdbcTemplate.update(INSERT_EMP_SQL,params);
		System.out.println("Log: Employee Inserted");
		
		
		
		
	}

}
