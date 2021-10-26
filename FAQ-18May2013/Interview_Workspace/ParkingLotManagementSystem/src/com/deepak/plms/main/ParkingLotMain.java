package com.deepak.plms.main;
import com.deepak.plms.dto.Parker;
import com.deepak.plms.service.ParkingLotService;
import com.deepak.plms.service.impl.ParkingLotServiceimpl;

/**
 * 
 */

/**
 * @author kumadeep
 *
 */
public class ParkingLotMain {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ParkingLotService parkingLotService = new ParkingLotServiceimpl();
		
		parkingLotService.createParkingSpace("ABC parking", 5);
		
		Parker abc = new Parker("ABC");
		Parker def = new Parker("DEF");
		
		parkingLotService.park(abc);
		parkingLotService.park(def);
		
		parkingLotService.unPark(abc);
		
	}

}
