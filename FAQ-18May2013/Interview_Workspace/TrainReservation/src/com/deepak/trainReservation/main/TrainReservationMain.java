package com.deepak.trainReservation.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.deepak.trainReservation.dto.Train;
import com.deepak.trainReservation.service.TrainReservationService;

public class TrainReservationMain {

	public static void main(String[] args){
		Train train = new Train("T"+1, 27);
		List<Train> listTrain = new ArrayList<Train>();
		listTrain.add(train);
		
		System.out.println(train.toString());
		TrainReservationService trainService = new TrainReservationService(5, listTrain);
		trainService.seatAllocate(3, null, "T1");
		System.out.println(train.toString());
		
		trainService.seatAllocate(10, null, "T1");
		System.out.println(train.toString());
		
		trainService.seatAllocate(7, null, "T1");
		System.out.println(train.toString());
		
	}
}
