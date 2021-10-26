package com.deepak.trainReservation.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class Train {

	String trainName;
	int size;
	List<Row> rows;
	int noOfSeatsVacant;
	
	public Train(int n) {
		this.trainName = null;
		this.size = n;
		this.rows = new ArrayList<Row>();
		populateRow(n);
		this.noOfSeatsVacant=n;
	}
	
	public Train(String trainName, int n) {
		this.trainName = trainName;
		this.size = n;
		this.rows = new ArrayList<Row>();
		populateRow(n);
		this.noOfSeatsVacant=n;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	public int getNoOfSeatsVacant() {
		return noOfSeatsVacant;
	}

	public void setNoOfSeatsVacant(int noOfSeatsVacant) {
		this.noOfSeatsVacant = noOfSeatsVacant;
	}
	
	private void populateRow(int n){
		Row tempRow = null;
		for (int i = 0; i < n/5; i++) {
			tempRow = new Row("R" + i, 5);
			this.rows.add(tempRow);
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Train){
			Train that = (Train)obj;
			return this.trainName.equals(that.trainName);
		}
		return false;
	}
	
	@Override
	public String toString() {

		String str = this.trainName + "";
		System.out.println();
		for (int i = 0; i < this.rows.size(); i++) {
			str = str + this.rows.get(i).toString();
			System.out.println();
		}
		return str;
	}
}
