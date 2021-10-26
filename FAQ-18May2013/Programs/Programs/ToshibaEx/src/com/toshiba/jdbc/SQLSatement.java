package com.toshiba.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//http://www.java2s.com/Code/Java/Database-SQL-JDBC/SerializedAndDeserializeObjectOracle.htm
public class SQLSatement {
	static Connection connection;
	static private ResultSet resultSet = null;
	static Statement statement = null;
	static List<POJOObject> list;

	private static void getStatement() {
		// TODO Auto-generated method stub
		connection = OracleJDBC.connectionObject();
		String sql = "select * from student";
		try {
			statement = connection.createStatement();
			System.out.println("Statement created");
			resultSet = statement.executeQuery(sql);
		    list = new ArrayList<POJOObject>();
			while(resultSet.next()){
		         //Retrieve by column name
				POJOObject pojo = new POJOObject();
		         pojo.setId(resultSet.getInt("id"));
		         pojo.setName(resultSet.getString("Name"));
                 pojo.setCourse( resultSet.getString("Course"));
		         System.out.println(resultSet.getString("Course"));
		         list.add(pojo);
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try{
			resultSet.close();
			statement.close();
		      connection.close();
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	  }
	}
	
public static List<POJOObject> getResultSet(){
	getStatement();
	return list;
}
}
