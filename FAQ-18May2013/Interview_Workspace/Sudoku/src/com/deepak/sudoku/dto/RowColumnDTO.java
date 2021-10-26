/**
 * 
 */
package com.deepak.sudoku.dto;

/**
 * @author kumadeep
 *
 */
public class RowColumnDTO {

	int row;
	int column;
	
	public RowColumnDTO() {
	}

	public RowColumnDTO(int row, int column){
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	
}
