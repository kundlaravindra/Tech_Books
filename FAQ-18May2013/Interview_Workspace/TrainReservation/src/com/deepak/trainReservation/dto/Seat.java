/**
 * 
 */
package com.deepak.trainReservation.dto;

/**
 * @author kumadeep
 *
 */
public class Seat {

	String name;
	boolean isEmpty;
	
	public Seat() {
		this.name = null;
		this.isEmpty = true;
	}
	
	public Seat(String name,boolean isEmpty) {
		this.name = name;
		this.isEmpty = isEmpty;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	@Override
	public String toString() {
		return this.name + ":" + this.isEmpty;
	}
}
