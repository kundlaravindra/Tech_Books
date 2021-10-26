/**
 * 
 */
package com.deepak.random.connectionPool;

/**
 * @author kumadeep
 *
 */
public class TestConnectionPool {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConnectionPool connectionPool = new ConnectionPool(5);
		
		ManualConnection[] manualConnections = new ManualConnection[6];
		
		for (int i = 0; i < manualConnections.length; i++) {
			
			manualConnections[i] = connectionPool.getConnection();
			System.out.println(manualConnections[i]);
		}
		
	}

}
