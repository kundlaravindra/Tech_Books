/**
 * 
 */
package com.deepak.random.connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author kumadeep
 *
 */
public class ConnectionPool {

	int numberOfConnection;
	ManualConnection[] connecitonArray;
	
	public ConnectionPool(int n) {
		this.numberOfConnection = n;
		connecitonArray = new ManualConnection[n];
	}

	public int getNumberOfConnection() {
		return numberOfConnection;
	}

	public void setNumberOfConnection(int numberOfConnection) {
		this.numberOfConnection = numberOfConnection;
	}

	public ManualConnection[] getConnecitonArray() {
		return connecitonArray;
	}

	public void setConnecitonArray(ManualConnection[] connecitonArray) {
		this.connecitonArray = connecitonArray;
	}
	
	public synchronized ManualConnection getConnection(){
		
		for(int i = 0 ; i < numberOfConnection ; i++){
			if(this.connecitonArray[i] == null){
			
				this.connecitonArray[i] = createConnection(i);
				this.connecitonArray[i].setUtilised(true);
				return this.connecitonArray[i];
			
			}else if(this.connecitonArray[i].getConnection() != null && !this.connecitonArray[i].isUtilised()){
				this.connecitonArray[i].setUtilised(true);
				return this.connecitonArray[i];
			}
		}
		
		System.out.println("All Connections are busy");
		return null;
	}
	
	public static ManualConnection createConnection(int i){
		Connection con = null;

		String connectionURL = null;
		String connectionUsername= null;
		String connectionPassword = null;
		
		/*String connectionURL = "jdbc:oracle:thin:@dbdwpsd3:1535:wpsd3";
		String connectionUsername= "BD_TASK_MGMT";
		String connectionPassword = "BD_TASK_MGMT";*/
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(
					connectionURL, connectionUsername,
					connectionPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return new ManualConnection(String.valueOf(i), con, false);
	}
	
	public void putConnection(ManualConnection manualConnection){
		
		for (int i = 0; i < connecitonArray.length; i++) {
			if(this.connecitonArray[i].equals(manualConnection)){
				this.connecitonArray[i].setUtilised(false);
				break;
			}
		
		}
	}
	
	public void closeConnections(){
		for (int i = 0; i < connecitonArray.length; i++) {
			try{
				this.connecitonArray[i].connection.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
}
