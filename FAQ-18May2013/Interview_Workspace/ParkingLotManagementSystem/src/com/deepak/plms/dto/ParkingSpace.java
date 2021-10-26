/**
 * 
 */
package com.deepak.plms.dto;

import com.deepak.plms.enums.VehicleType;

/**
 * @author kumadeep
 *
 */
public class ParkingSpace {
	
	String nameParkingSpace;
	
	boolean isFull;
	
	Parker parker;
	
	ParkingLot parkingLot;
	
	Double distanceFromEntrance;
	
	boolean hasAssistance;
	
	VehicleType vehicleType;

	public ParkingSpace(String nameParkingSpace,ParkingLot parkingLot,Double distanceFromEntrance) {

		this.nameParkingSpace = nameParkingSpace;
		this.isFull = false;
		this.parkingLot = parkingLot;
		this.distanceFromEntrance = distanceFromEntrance;
		this.parker = null;
		this.hasAssistance = false;
		this.vehicleType = VehicleType.FOURWHEELER;
	}
	
	public ParkingSpace(String nameParkingSpace,ParkingLot parkingLot,Double distanceFromEntrance, VehicleType vehicleType) {

		this.nameParkingSpace = nameParkingSpace;
		this.isFull = false;
		this.parkingLot = parkingLot;
		this.distanceFromEntrance = distanceFromEntrance;
		this.parker = null;
		this.hasAssistance = false;
		this.vehicleType = VehicleType.FOURWHEELER;
	}
	
	public String getNameParkingSpace() {
		return nameParkingSpace;
	}

	public void setNameParkingSpace(String nameParkingSpace) {
		this.nameParkingSpace = nameParkingSpace;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	public Parker getParker() {
		return parker;
	}

	public void setParker(Parker parker) {
		this.parker = parker;
	}

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	public Double getDistanceFromEntrance() {
		return distanceFromEntrance;
	}

	public void setDistanceFromEntrance(Double distanceFromEntrance) {
		this.distanceFromEntrance = distanceFromEntrance;
	}
	
	public boolean isHasAssistance() {
		return hasAssistance;
	}

	public void setHasAssistance(boolean hasAssistance) {
		this.hasAssistance = hasAssistance;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		
		String str = "Name : " + this.nameParkingSpace + "; Distance : " + this.distanceFromEntrance + "; IsFull : " + this.isFull ;
		
		if(this.parker != null){
			str = str + "Parker : " +  this.parker.toString();
		}
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		ParkingSpace pSpace = (ParkingSpace) obj;
		
		return this.nameParkingSpace.equals(pSpace.getNameParkingSpace());
	}
}
