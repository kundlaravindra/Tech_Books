/**
 * 
 */
package com.deepak.sudoku.service;

import com.deepak.sudoku.dto.RowColumnDTO;

/**
 * @author kumadeep
 *
 */
public class SudokuService {

	int[][] originalSudoku;
	boolean[][] missedRowNum;
	int sudokuSize;
	
	public SudokuService(int n) {
		this.sudokuSize = n;
		this.originalSudoku = new int[sudokuSize][sudokuSize];
		this.missedRowNum = new boolean[sudokuSize][sudokuSize];
		populateValues();
		solveSudoku();
		
	}
	
	public void populateValues(){
		
	}

	public void solveSudoku(){
		
		/**
		 * WHile(isNextEmpty)
		 * getNextEmptyRowCol
		 * fetchValue
		 * if fetched value is null
		 * backTrack
		 * else place value
		 */

		
		RowColumnDTO rowColumnDTO = getNextEmptyCell();
		while(rowColumnDTO!=null){
			int value = fetchValue(rowColumnDTO);
			if(value == -1){
				backTrack(rowColumnDTO);
			}else{
				if(isSafe(rowColumnDTO, value)){
					placeNum(rowColumnDTO, value);
				}
			}
		}
		
	
		
	}
	
	/*public void solveSudoku(){
		
		RowColumnDTO rowColumnDTO = getNextEmptyCell();
		while(rowColumnDTO!=null){
			int value = fetchValue(rowColumnDTO);
			if(value == -1){
				backTrack(rowColumnDTO);
			}else{
				if(isSafe(rowColumnDTO, value)){
					placeNum(rowColumnDTO, value);
				}
			}
		}
		
	}*/
	
	public int fetchValue(RowColumnDTO rowColumnDTO){
		
		for(int i=0; i< this.sudokuSize ; i++){
			if(this.missedRowNum[rowColumnDTO.getRow()][i]){
				this.missedRowNum[rowColumnDTO.getRow()][i] = false;
				return i;
			}
		}
		return -1;
	}
	
	public RowColumnDTO getNextEmptyCell(){
		RowColumnDTO rowColumnDTO = null;
		
		for(int i=0; i<this.sudokuSize ; i++){
			for(int j=0 ; j< this.sudokuSize ; j++){
				if(originalSudoku[i][j] ==0){
					rowColumnDTO = new RowColumnDTO(i, j);
					return rowColumnDTO;
				}
			}
		}
		return rowColumnDTO;
	}
	
	public void placeNum(RowColumnDTO rowColumnDTO,int num){
		this.originalSudoku[rowColumnDTO.getRow()][rowColumnDTO.getColumn()] = num;
	}
	
	public boolean isSafe(RowColumnDTO rowColumnDTO,int num){
		
		for(int i = 0; i < this.sudokuSize ; i++){
			for(int j=0 ; j < this.sudokuSize ; j++){
				if(i == rowColumnDTO.getRow() || j == rowColumnDTO.getColumn()){
					if(this.originalSudoku[i][j] == num){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public void backTrack(RowColumnDTO rowColumnDTO){
		this.missedRowNum[rowColumnDTO.getRow()][this.originalSudoku[rowColumnDTO.getRow()][rowColumnDTO.getColumn()]] = true;
		//solveSudoku(row, col);
	}
}
