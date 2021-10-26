package org.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;

public class LoginModel {
	private JdbcTemplate jdbcTemplate;
	public LoginModel (JdbcTemplate jt){
		jdbcTemplate = jt;
	}
public String validate(String uname, String pass){
	String sql = "select type from Emp where username=\'"+uname+"\' and userpass=\'"+pass+"\'";
	/*try { 
		return (String)jdbcTemplate.queryForObject(sql, String.class);
	} 
	catch(EmptyResultDataAccessException e[]){
		//System.err.println(e.getMessage());
		return null;
	}*/
	
	
	return "";
	
	
	
}
}
