package com.toshiba.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import com.toshiba.twointerfacessamemethod.MainForTwoInterfaceSameMethod;

 
public class OracleJDBC {
	static Properties p;
	static {
		  p = new Properties();
		 // InputStream in = OracleJDBC.class.getResourceAsStream("DriverProp.properties");
		  try {
			  p.load(OracleJDBC.class.getResourceAsStream("DriverProp.properties"));
			//p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 /* try {
			//in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		}
 
	public static Connection connectionObject() {
		//public static void main(String[] ar) {
		
		/* Properties p = new Properties();          // Empty properties
         
             try {
            	
            	 p.load(new FileInputStream("DriverProp.properties")); 
            	// p.load(OracleJDBC.class.getClassLoader().getResourceAsStream("DriverProp.properties"));
            	 // For non Static methods
            	 }
             catch (Exception e2) {
            	 System.out.println("Properties not loading");
             }*/

         // Read values from Properties file
         String driver = p.getProperty("driver");
         System.out.println(driver);
         String database = p.getProperty("database");
         String user = p.getProperty("user", "");
         String password = p.getProperty("password", "");
         
         if (driver == null) 
     		throw new IllegalArgumentException("No driver specified!");
     	    if (database == null) 
     		throw new IllegalArgumentException("No database specified!");

 
		System.out.println("-------- Oracle JDBC Connection Testing ------");
 
		try {
 //DriverManager.registerDriver(oracle.jdbc.driver.OracleDriver);
			Class.forName(driver);
 
		} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			//return;
 
		}
 
		System.out.println("Oracle JDBC Driver Registered!");
 
		Connection connection = null;
 
		try {
 System.out.println(database);
			
			connection = DriverManager.getConnection(
					database, user,
					password);
 
		} catch (SQLException e) {
 
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			//return;
 
		}
 
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	return connection;
	}
 
}
