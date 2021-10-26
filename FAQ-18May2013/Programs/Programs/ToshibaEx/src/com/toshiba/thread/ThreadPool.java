package com.toshiba.thread;

public class ThreadPool implements Runnable {
	     
	    private String command;
	     
	    public ThreadPool(String s){
	        this.command=s;
	    }
	 
	    @Override
	    public void run() {
	        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
	        processCommand();
	        System.out.println(Thread.currentThread().getName()+" End.");
	    }
	 
	    private void processCommand() {
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	 
	    @Override
	    public String toString(){
	        return this.command;
	    }
	}


