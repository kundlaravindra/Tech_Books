package com.toshiba;

public class DeadlockRisk {
    
      public int value;
    static  Resource resourceA ;
	   static Resource resourceB ;
     
    public int read() {
      synchronized(resourceA) { // May deadlock here
        synchronized(resourceB) {
        	System.out.println("hi");
         return 6;
       }
     }
   }

   public void write(int a, int b) {
     synchronized(resourceB) { // May deadlock here
       synchronized(resourceA) {
    	   System.out.println("hi---------");
         
       }
     }
   }
   public static void main(String[] args){
	   DeadlockRisk d = new DeadlockRisk();
	   resourceA = new Resource();
	    resourceB = new Resource();
	   d.write(4, 5);
   }
 } 
