/*package healthcare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

public class JdbcProgram {

	*//**
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet s1=new HashSet();
		try{
			  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("select * from product");
			 
			 ArrayList a=new ArrayList();
			
		while(rs.next()) {
			//String d=new String(rs.getString(1),rs.getString(2));

a.add(rs.getString(1));	
System.out.println(a);
a.add(rs.getString(2));
s1.add(a);

			 }
			else {
			  
			  }
			 }catch(SQLException e){
				 e.getMessage();
				 
			 }
		for(Object o:s1)
		System.out.println(o);

	}

}
*/