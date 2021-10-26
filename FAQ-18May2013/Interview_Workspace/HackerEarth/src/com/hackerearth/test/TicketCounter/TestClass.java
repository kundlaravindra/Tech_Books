package com.hackerearth.test.TicketCounter;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int  noOfJunction = in.nextInt();
        int noOfQueues = in.nextInt();
        int[][] queue = new int[noOfQueues][4];
        for (int i = 0; i < noOfQueues; i++) {
        	queue[i][0] = in.nextInt();
        	queue[i][1] = in.nextInt();
        	queue[i][2] = in.nextInt();
        	queue[i][3] = -1;
        }
        getOptimalPath(noOfJunction, noOfQueues, queue);
	}
	
	public static void getOptimalPath(int noOfJunction, int noOfQueues, int[][] queue){
		int temp = queue[0][1];
		int index = 0;
		while(true){
			for(int i = 0 ; i < noOfQueues ; i++){
				if(temp == queue[i][0]){
					queue[index][3] = i;
					break;
				}
			}
			index++;
			if(index == noOfQueues){
				break;
			}
			temp = queue[index][1];
		}
		
		
		for(int i = 0 ; i< noOfQueues ; i++){

			System.out.println(queue[i][3]);
		}
		
		
	}
	
	public static boolean checkLastIndex(int[][] queue){
		for (int i = 0; i < queue.length; i++) {
			if(queue[i][3] == -1){
				return false;
			}
		}
		return true;
	}

}
