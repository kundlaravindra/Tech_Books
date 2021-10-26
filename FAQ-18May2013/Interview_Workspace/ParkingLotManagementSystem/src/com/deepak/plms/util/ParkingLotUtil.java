/**
 * 
 */
package com.deepak.plms.util;

import com.deepak.plms.dto.Parker;
import com.deepak.plms.dto.ParkingLot;
import com.deepak.plms.dto.ParkingSpace;

/**
 * @author kumadeep
 *
 */
public class ParkingLotUtil {
	
	
	public static ParkingSpace getClosestParkingSpace(ParkingLot parkingLot,Parker parker){
		
		double minDistance = Integer.MAX_VALUE;
		ParkingSpace pSpace = null;
		
		if(parker.isNeedsAssistance()){

			for(ParkingSpace parkingSpace : parkingLot.getListParkingSpaces()){
				
				if(parkingSpace.isHasAssistance() && 
						!parkingSpace.isFull() && 
						minDistance > parkingSpace.getDistanceFromEntrance() && 
						parkingSpace.getVehicleType().equals(parker.getVehicleType())){
					
					minDistance = parkingSpace.getDistanceFromEntrance();
					pSpace = parkingSpace;
				}
			}
		}else{
		
				for(ParkingSpace parkingSpace : parkingLot.getListParkingSpaces()){
				
					if(!parkingSpace.isFull() && 
							!parkingSpace.isHasAssistance() && 
							minDistance > parkingSpace.getDistanceFromEntrance() &&
							parkingSpace.getVehicleType().equals(parker.getVehicleType())){
						
						minDistance = parkingSpace.getDistanceFromEntrance();
						pSpace = parkingSpace;
					}
				}
		}
		pSpace.setParker(parker);
		pSpace.setFull(true);
		return pSpace;
	}

}
