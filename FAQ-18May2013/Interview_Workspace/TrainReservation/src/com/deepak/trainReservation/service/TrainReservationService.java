/**
 * 
 */
package com.deepak.trainReservation.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.deepak.trainReservation.dto.Row;
import com.deepak.trainReservation.dto.Seat;
import com.deepak.trainReservation.dto.Train;

/**
 * @author kumadeep
 *
 */
public class TrainReservationService {

	List<Train> listTrain;
	int commonRowSize;
	
	public TrainReservationService(int n) {
		this.listTrain = new ArrayList<Train>();
		this.commonRowSize = n;
	}
	
	public TrainReservationService(int n, List<Train> listTrain) {
		this.listTrain = listTrain;
		this.commonRowSize = n;
	}
	
	public boolean seatAllocate(int noOfSeatsRequired, List<String> names,String trainName){
		
		Train train = getTrain(trainName);
		if(null == train){
			System.out.println("Train Name is not valid");
			return false;
		}
		
		if(noOfSeatsRequired > train.getNoOfSeatsVacant()){
			System.out.println("The number of seats required is not available");
			return false;
		}
		
		int noOfFullRowRequried = noOfSeatsRequired / this.commonRowSize;
		int extraRow = noOfSeatsRequired % this.commonRowSize;
		
		for(Row row : train.getRows()){
			if(noOfFullRowRequried > 0 ){
				if((row.getSize() - row.getLastOccupied() - this.commonRowSize) == 0){
					allocate(row,train);
					noOfFullRowRequried--;
				}
			}
		}
		
		
		return allocateExtraSeats(noOfFullRowRequried * this.commonRowSize + extraRow, train);
	}
	
	private Train  getTrain(String trainName){
		
		Train train = null;
		for(Train tempTrain : listTrain){
			if(trainName.equals(tempTrain.getTrainName())){
				return tempTrain;
			}
		}
		return train;
	}
	
	private void allocate(Row row, Train train){
		
		for(Seat seat : row.getSeat()){
			seat.setEmpty(false);
			row.setLastOccupied(row.getLastOccupied()+1);
		}
	}
	
	private boolean allocateExtraSeats(int n,Train train){
		
		if(n == 0){
			return true;
		}
		Collections.sort(train.getRows());
		int noOfvacantSeat = train.getRows().get(0).getSize() - train.getRows().get(0).getLastOccupied();
		if(n >= noOfvacantSeat){
			allocate(train.getRows().get(0), train, noOfvacantSeat);
			allocateExtraSeats(noOfvacantSeat-noOfvacantSeat, train);
		}else{
			findMatchForlastSetOfSeats(n, train);
		}
		
		return false;
	}
	
	private boolean findMatchForlastSetOfSeats(int count, Train train){
		int min  = Integer.MAX_VALUE;
		int minIndex = -1;
		for(int i = 0; i< train.getRows().size() ; i++){
			int vacantCount = train.getRows().get(i).getSize() - train.getRows().get(i).getLastOccupied();
			if(vacantCount - count < min){
				min = vacantCount -count;
				minIndex = i;
			}
		}
		
		return allocate(train.getRows().get(minIndex), train, count);
	}
	
	private boolean allocate(Row row, Train train , int count){
		
		for(int i = row.getLastOccupied();i < row.getSize() && count >0 ; i++){
			row.getSeat().get(i).setEmpty(false);
			row.setLastOccupied(i+1);
			count--;
		}
		if(count !=0){
			return false;
		}
		//row.setLastOccupied(row.getLastOccupied()+count);
		return true;
	}
}
