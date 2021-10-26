/**
 * 
 */
package com.deepak.plms.service.impl;

import java.util.List;

import com.deepak.plms.dto.Parker;
import com.deepak.plms.dto.ParkingLot;
import com.deepak.plms.dto.ParkingSpace;
import com.deepak.plms.service.ParkingLotService;
import com.deepak.plms.util.ParkingLotUtil;

/**
 * @author kumadeep
 *
 */
public class ParkingLotServiceimpl implements ParkingLotService{

	ParkingLot parkingLot;
	
	public ParkingLotServiceimpl() {
		this.parkingLot = null; 
	}
	
	
	/**
	 * Creates a virtual parking.
	 * 
	 */
	@Override
	public void createParkingSpace(String parkingLotName, int parkingSpaces) {
		System.out.println("Creating parking Space...");
		
		if(parkingSpaces == 0 ){
			System.out.println("Invalid entry for number of parking spaces.");
			return;
		}
		
			this.parkingLot = new ParkingLot(parkingLotName, parkingSpaces);
			
			ParkingSpace ps = null;
			List<ParkingSpace> listParkingSpaces = this.parkingLot.getListParkingSpaces();
			
			for (int i = 0; i < parkingSpaces; i++) {
				
				ps = new ParkingSpace(((Integer)i).toString(), this.parkingLot,Math.random()*10);
				
				listParkingSpaces.add(ps);
			}
			
			if(listParkingSpaces.size() == parkingSpaces){
				System.out.println("Parking Lot Created " + this.parkingLot.toString());
			}
			
	}

	/**
	 * Handle Parking.
	 * 
	 * 
	 */
	@Override
	public boolean park(Parker parker) {
		
		if(parker == null){
			System.out.println("Invalid parker.");
			return false;
		}else if(parker.getParkingSpaces() != null){
			System.out.println("Parker already Parked.");
			return false;
		}
		
		System.out.println("Parking the Vehicle : " + parker.getNameParker());
		ParkingSpace parkingSpace = ParkingLotUtil.getClosestParkingSpace(this.parkingLot, parker);
		
		if(parkingSpace == null){
			return false;
		}

		parker.setParkingSpaces(parkingSpace);
		
		System.out.println("Parked" + this.parkingLot.toString());
		return true;
	}

	
	/**
	 * Handles Unparking.
	 */
	@Override
	public boolean unPark(Parker parker) {
		
		if(parker == null){
			System.out.println("Invalid parker.");
			return false;
		}
		
		System.out.println("UnParking the vehicle : " + parker.getNameParker());
		parker.getParkingSpaces().setParker(null);;
		
		parker.getParkingSpaces().setFull(false);
		parker.setParkingSpaces(null);
		System.out.println("UnParked" + this.parkingLot.toString());
		return true;
	}

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}
	
}
