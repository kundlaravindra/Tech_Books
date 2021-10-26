/**
 * 
 */
package com.deepak.locks.resource;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author kumadeep
 *
 */
public class ReadWriteMap {
	
	Map<String,String> mapLock = null;
	ReadWriteLock rwLock = null;
	
	public ReadWriteMap() {
		this.mapLock = new HashMap<String, String>();
		this.rwLock = new ReentrantReadWriteLock();
	}
	
	public void addValue() throws InterruptedException{
		
		this.rwLock.writeLock().lock();
		try{
			for(int i=0 ; i < 5 ; i++){
				Thread.sleep(1000);
				this.mapLock.put(i+"", i+"");
				System.out.println("Add : " + i);
			}
		}finally{
			this.rwLock.writeLock().unlock();
		}
		
		
	}
	
	
	public void getValue() throws InterruptedException{
		
		
		this.rwLock.readLock().lock();
		try{
			
			for(int i=0 ; i< 5 ; i++){
				Thread.sleep(1000);
				System.out.println("Get : " +  mapLock.get(i+""));
			}
			
		}finally{
			this.rwLock.readLock().unlock();
		}
		
	}

}
