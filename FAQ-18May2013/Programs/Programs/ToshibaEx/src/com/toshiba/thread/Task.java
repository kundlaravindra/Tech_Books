package com.toshiba.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Task{  
	   AtomicInteger var1 = new AtomicInteger(); 
	   
	   
	   public void setComplexVar1(int param1, int param2){  
	      while (true) {  
	         int origval = var1.get();  
	   
	        // int newval = someComplexOperation(param1, param2);  
	        // if (var1.compareAndSet(origval, newval)) return;  
	      }  
	   } 
}
