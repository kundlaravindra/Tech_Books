/**
 * 
 */
package com.deepak.locks;

import com.deepak.locks.resource.ReadWriteMap;
import com.deepak.locks.thread.ReadThread;
import com.deepak.locks.thread.WriteThread;


/**
 * @author kumadeep
 *
 */
public class LockDenmo {
	
	public static void main(String[] ags){

		Thread t = null;
		ReadWriteMap readWriteMap = new ReadWriteMap();
		for(int i=0; i<10 ; i++){
			
			if(i%2==0){
				t =  new Thread(new WriteThread(readWriteMap));
			}else{
				t =  new Thread(new ReadThread(readWriteMap));
			}
			
			t.start();
			System.out.println(t.toString());
		}
	}

}
