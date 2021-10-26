/**
 * 
 */
package com.deepak.threadDemo.resource;


/**
 * @author kumadeep
 *
 */
public class Resource {

	String message = "EMPTY_STRING";
	boolean isEmpty = true;
	int count;
	
	public Resource() {
		this.count = 0;
	}
	
	public synchronized void getAll(){
			
			if(!isEmpty){
				this.message = "EMPTY_STRING";
				System.out.println("Get All : " + this.message);
				isEmpty = true;
				notify();
			}else{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	
	public synchronized void get(){
		
		if(!isEmpty){
			this.message = "EMPTY_STRING";
			System.out.println("Get : " + this.message);
			isEmpty = true;
			notify();
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void put(){
		if(isEmpty){
			this.message = "DATA_ADDED";
			System.out.println("Put : " + this.message);
			isEmpty = false;
			notify();
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public synchronized void putAll(){
		if(isEmpty){
			this.message = "DATA_ADDED";
			System.out.println("Put All: " + this.message);
			isEmpty = false;
			notify();
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
	
	
	public synchronized void printEven(){
		for(int i = 0; i< 10 ; i++){
			if(this.count%2 == 0){
				System.out.println(this.count);
				this.count++;
				notify();
			}else{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public synchronized void printOdd() {
		for(int i = 0 ; i<10; i++){
			if(this.count % 2 != 0){
				System.out.println(this.count);
				this.count++;
				notify();
			}else{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
