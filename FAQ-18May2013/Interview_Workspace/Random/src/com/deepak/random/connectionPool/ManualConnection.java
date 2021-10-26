/**
 * 
 */
package com.deepak.random.connectionPool;

import java.sql.Connection;

/**
 * @author kumadeep
 *
 */
public class ManualConnection {
	
	String name;
	Connection connection;
	boolean utilised;
	
	public ManualConnection() {
		this.name = null;
		this.connection = null;
		this.utilised = false;
	}
	
	public ManualConnection(String name,Connection con,boolean utilised) {
		this.name = name;
		this.connection = con;
		this.utilised = utilised;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public boolean isUtilised() {
		return utilised;
	}

	public void setUtilised(boolean utilised) {
		this.utilised = utilised;
	}
	

	@Override
	public boolean equals(Object obj) {
		ManualConnection that = (ManualConnection) obj;
		return this.connection.equals(that.name);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.isUtilised();
	}
}
