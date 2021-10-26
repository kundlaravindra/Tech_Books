package com.deepak.locks.thread;

import com.deepak.locks.resource.ReadWriteMap;

public class ReadThread implements Runnable{
	
	ReadWriteMap readWriteMap = null;
	
	public ReadThread(ReadWriteMap readWriteMap) {
		this.readWriteMap = readWriteMap;
	}

	@Override
	public void run() {
		System.out.println("ReadThread Starts...");
		
		try {
			this.readWriteMap.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
