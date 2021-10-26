/**
 * 
 */
package com.deepak.plms.service;

import com.deepak.plms.dto.Parker;

/**
 * @author kumadeep
 *
 */
public interface ParkingLotService {

	public void createParkingSpace(String parkingLotName, int parkingSpaces);
	
	public boolean park(Parker parker);
	
	public boolean unPark(Parker parker);
}
