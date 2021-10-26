/**
 * 
 */
package com.deepak.trainReservation.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class Row implements Comparable<Row>{

	String rowName;
	List<Seat> seat;
	int size;
	int lastOccupied;
	
	public Row(int n) {
		this.rowName = null;
		this.size = n;
		seat = new ArrayList<Seat>();
		populateSeat(n);
		this.lastOccupied = 0;
	}

	public Row(String rowName, int n) {
		this.rowName = rowName;
		this.size = n;
		seat = new ArrayList<Seat>();
		populateSeat(n);
		this.lastOccupied = 0;
	}
	
	public List<Seat> getSeat() {
		return seat;
	}

	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLastOccupied() {
		return lastOccupied;
	}

	public void setLastOccupied(int lastOccupied) {
		this.lastOccupied = lastOccupied;
	}

	public String getRowName() {
		return rowName;
	}

	public void setRowName(String rowName) {
		this.rowName = rowName;
	}

	private void populateSeat(int n){
		Seat tempSeat = null;
		for(int i = 0 ; i < n ; i++){
			tempSeat = new Seat("S"+i, true);
			this.seat.add(tempSeat);
		}
	}
	
	@Override
	public int compareTo(Row o) {
		return Integer.valueOf(this.size - this.lastOccupied).compareTo(Integer.valueOf(o.size - o.lastOccupied));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Row){
			Row that = (Row) obj;
			return this.rowName.equals(that.rowName);
		}
		return false;
	}

	@Override
	public String toString() {
		String str = "" + this.getRowName() + "";
		for (int i = 0; i < this.seat.size(); i++) {
			str=str + this.seat.get(i).toString() + " ; " ;
		}
		return str;
	}
}

