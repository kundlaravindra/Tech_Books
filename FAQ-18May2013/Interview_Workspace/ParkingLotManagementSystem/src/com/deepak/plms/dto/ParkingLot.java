package com.deepak.plms.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class ParkingLot {
	
	
	String nameOfParkingLot;
	
	int noOfParkingSpaces;
	
	int noOfVacantParkingSpaces;
	
	List<ParkingSpace> listParkingSpaces;
	
	
	public ParkingLot(String name, int noOfParkingSpaces) {
		
		this.nameOfParkingLot = name;
		this.noOfParkingSpaces = noOfParkingSpaces;
		this.noOfParkingSpaces = noOfParkingSpaces;
		this.listParkingSpaces = new ArrayList<ParkingSpace>();
	}

	public String getNameOfParkingLot() {
		return nameOfParkingLot;
	}

	public void setNameOfParkingLot(String nameOfParkingLot) {
		this.nameOfParkingLot = nameOfParkingLot;
	}

	public int getNoOfParkingSpaces() {
		return noOfParkingSpaces;
	}

	public void setNoOfParkingSpaces(int noOfParkingSpaces) {
		this.noOfParkingSpaces = noOfParkingSpaces;
	}

	public int getNoOfVacantParkingSpaces() {
		return noOfVacantParkingSpaces;
	}

	public void setNoOfVacantParkingSpaces(int noOfVacantParkingSpaces) {
		this.noOfVacantParkingSpaces = noOfVacantParkingSpaces;
	}

	public List<ParkingSpace> getListParkingSpaces() {
		return listParkingSpaces;
	}

	public void setListParkingSpaces(List<ParkingSpace> listParkingSpaces) {
		this.listParkingSpaces = listParkingSpaces;
	}

	@Override
	public String toString() {
		return this.nameOfParkingLot + "Parking Spaces : " + this.listParkingSpaces.toString();
	}
	
}
