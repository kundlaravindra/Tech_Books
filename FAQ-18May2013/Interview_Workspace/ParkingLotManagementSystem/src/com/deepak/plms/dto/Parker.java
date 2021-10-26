/**
 * 
 */
package com.deepak.plms.dto;

import com.deepak.plms.enums.VehicleType;

/**
 * @author kumadeep
 *
 */
public class Parker {

	String nameParker;
	
	ParkingSpace parkingSpaces;
	
	boolean needsAssistance;
	
	VehicleType vehicleType;
	
	public Parker(String name) {
		
		this.nameParker = name;
		this.parkingSpaces = null;
		this.needsAssistance = false;
		this.vehicleType=VehicleType.FOURWHEELER;
	}

	public Parker(String name,VehicleType vehicleType) {
		
		this.nameParker = name;
		this.parkingSpaces = null;
		this.needsAssistance = false;
		this.vehicleType=vehicleType;
	}
	
	public String getNameParker() {
		return nameParker;
	}

	public void setNameParker(String nameParker) {
		this.nameParker = nameParker;
	}

	public ParkingSpace getParkingSpaces() {
		return parkingSpaces;
	}

	public void setParkingSpaces(ParkingSpace parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}
	
	
	public boolean isNeedsAssistance() {
		return needsAssistance;
	}

	public void setNeedsAssistance(boolean needsAssistance) {
		this.needsAssistance = needsAssistance;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return this.nameParker;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.nameParker.equals(((Parker)obj).nameParker);
	}
}
