/**
 * 
 */
package com.deepak.queen.service;

/**
 * @author kumadeep
 *
 */
public class QueenService {

	public boolean[] queen;
	public boolean chessBoard[][];
	
	public QueenService(int n) {
		this.queen = new boolean[n];
		this.chessBoard = new boolean[n][n];
		
		solveQueensProblem(0,0);
	}
	
	public boolean solveQueensProblem(int row,int col){
		if(col >= this.queen.length){
			this.print();
			return true;
		}
		
		for(int i = row ;i <this.queen.length ; i++ ){
			if(canPlaceQueen(i,col)){
				placingQueen(i, col);
				
				if(solveQueensProblem(0,++col)){
					return true;
				}
			}
		}

		col--;
		backTrack(col);
	
		
		return true;
	}
	
	public void backTrack(int col){
		for(int i=0 ; i< this.queen.length ; i++){
			if(this.chessBoard[i][col]){
				this.chessBoard[i][col] = false;
				System.out.println("BackTracking :");
				i++;
				
				if(i+1>=this.queen.length){
					col--;
					backTrack(col);
				}else{
					solveQueensProblem(i, col);
					return;
				}
			}
		}
		
	}
	
	public void placingQueen(int row,int col){
		
		this.chessBoard[row][col] = true;
		this.queen[col] = true;
		
	}
	
	public boolean canPlaceQueen(int r ,int c){
		
		for (int i = 0; i < this.queen.length; i++) {
			for(int j = 0; j<c ; j++){
				if(this.chessBoard[i][j]){
					if(i==r || j ==c || i+j == r+c || i-j == r-c ){
						return false;
					}
				}
			}
		}
		return true;
		
	}
	
	public void print(){
		for(int i = 0 ; i< this.queen.length ;i++){
			for(int j = 0 ; j < this.queen.length ; j++){
				System.out.print(this.chessBoard[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
