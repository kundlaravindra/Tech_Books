/**
 * 
 */
package com.deepak.locks.thread;

import com.deepak.locks.resource.ReadWriteMap;

/**
 * @author kumadeep
 *
 */
public class WriteThread implements Runnable{
	
	ReadWriteMap readWriteMap = null;
	
	public WriteThread(ReadWriteMap readWriteMap ) {
		this.readWriteMap = readWriteMap;
	}

	@Override
	public void run() {
		System.out.println("WriteThread Starts...");
		
		try {
			this.readWriteMap.addValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
