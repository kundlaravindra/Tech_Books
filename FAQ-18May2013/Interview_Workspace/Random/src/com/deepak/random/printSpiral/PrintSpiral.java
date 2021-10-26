/**
 * 
 */
package com.deepak.random.printSpiral;

/**
 * @author kumadeep
 *
 */
public class PrintSpiral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][] = {
			      { 0,  1,  2,  3, 4},
			      {15, 16, 17, 18, 5},
			      {14, 23, 24, 19, 6},
			      {13, 22, 21, 20, 7},
			      {12, 11, 10, 9, 8}};
		
		int array1[][] = {
				  { 0,  1,  2,  3, 4},
			      {13, 14, 15, 16, 5},
			      {12, 19, 18, 17, 6},
			      {11, 10, 9, 8, 7}};
		
		//printSpiral(array, 5, 5);
		printSpiral(array);
	}
	
	public static void printSpiral(int array[][],int row,int col){
		int tempCol = 0 ;
		int tempRow = 0;
		while(col > 0 || row > 0){
			for(int i=0; i <row;i++){
				System.out.println(array[tempCol][i]);
			}
			//col--;
			for(int j=1; j <col+1;j++){
				System.out.println(array[j][col]);
			}
			tempCol++;
			
			
			for(int i=row-1;i>=0;i--){
				System.out.println(array[i][col]);
			}
			for(int i=col-1;i>0;i--){
				System.out.println(array[i][tempRow]);
			}
			col--;
			row--;
			tempRow--;
		}
	}
	
	/*public static void printSpiral(int[][] A) {
		int rowStart = 0;
		int colStart = 0;
		int rowEnd = A.length;
		int colEnd = A[0].length;
		do {
			for (int i = colStart; i < rowEnd; i++) {
				System.out.print(A[rowStart][i] + ", ");
			}
			// current row is done and no more need to process it
			rowStart++;
			for (int i = rowStart; i < colEnd; i++) {
				System.out.print(A[i][colEnd - 1] + ", ");
			}
			// current column is done and no more need to process it
			colEnd--;

			if (rowStart < rowEnd) {
				for (int i = colEnd - 1; i >= colStart; i--) {
					System.out.print(A[rowEnd - 1][i] + ", ");
				}
				rowEnd--;
			}
			if (colStart < colEnd) {
				for (int i = rowEnd - 1; i >= rowStart; i--) {
					System.out.print(A[i][colStart] + ", ");
				}
				colStart++;
			}

		} while (rowStart < rowEnd && colStart < colEnd);
	}
	*/
	
	public static void printSpiral(int[][] A) {

		int rowStart = 0;
		int colStart = 0;
		int rowEnd = A.length;
		int colEnd = A[0].length;
		do {
			for (int i = rowStart; i < rowEnd; i++) {
				System.out.print(A[rowStart][i] + ", ");
			}
			// current row is done and no more need to process it
			//rowStart++;
			for (int i = colStart; i < colEnd; i++) {
				System.out.print(A[i][colEnd - 1] + ", ");
			}
			// current column is done and no more need to process it
			//colEnd--;

			if (rowStart < rowEnd) {
				rowEnd = rowEnd -1;
				for (int i = rowEnd; i >= rowStart; i--) {
					System.out.print(A[i][rowStart] + ", ");
				}
				//rowEnd--;
			}
			if (colStart < colEnd) {
				colEnd = colEnd-1;
				for (int i = colEnd; i >= colStart; i--) {
					System.out.print(A[colStart][colStart] + ", ");
				}
				//colStart++;
			}
			rowStart++;
			colStart++;

		} while (rowStart < rowEnd && colStart < colEnd);
	
	}

}
