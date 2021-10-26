/**
 * 
 */
package com.hasckerearth.test.mananddishes;

/**
 * @author kumadeep
 *
 */
public class ManAndDishesMain {

	boolean manDishes[][];
	//boolean dishes[];
	int numberoFMan;
	int numberOfDishes;
	int[] noOfDishesManlikes;
	
	public ManAndDishesMain(int numberOfMan,int numberOfDishes) {

		this.numberoFMan = numberOfMan;
		this.numberOfDishes = numberOfDishes;
		
		this.manDishes = new boolean[numberOfMan][numberOfDishes];
		this.noOfDishesManlikes = new int[numberOfMan];
		
		setManDishesPreference();
		updateManWithMinLikes();
	}
	
	public int getManWithMinLikes(boolean tempMan[]){
		int min=Integer.MAX_VALUE;
		int manWithMinLikes = -1;
		for(int i = 0; i< this.numberoFMan ; i++){
			if(this.noOfDishesManlikes[i] < min && tempMan[i] == false){
				min = this.noOfDishesManlikes[i];
				manWithMinLikes = i;
			}
		}
		
		this.noOfDishesManlikes[manWithMinLikes] = Integer.MAX_VALUE;
		
		return manWithMinLikes;
	}
	
	public void updateManWithMinLikes(){
		
		for(int i=0 ; i < this.numberoFMan ; i++){
			int count =0;
			for(int  j = 0 ; j < this.numberOfDishes ; j++){
				
				if(this.manDishes[i][j]){
					count++;
				}
			}
			this.noOfDishesManlikes[i] =count;
		}
		
	}
	
	public int findLeastDishesRequired(){
		
		boolean tempMan[] = new boolean[numberoFMan];
		boolean tempDishes[] = new boolean[numberOfDishes];
		
		//while all tempMan is true
		while(!checkAllManTrue(tempMan)){
			int minManLikes = getManWithMinLikes(tempMan);
			for(int i = 0;i<this.numberOfDishes ; i++){
				if(this.manDishes[minManLikes][i]){
					tempDishes[i] = true;
					tempMan = markMan(i, tempMan);
				}
			}
			tempMan[minManLikes] = true;
			
		}
		
		return 0;
		
	}
	
	public boolean[] markMan(int n,boolean[] tempMan){
		
		for(int i =0 ; i< numberoFMan ; i++){
			if(this.manDishes[i][n] && !tempMan[i]){
				tempMan[i] = true;
			}
		}
		return tempMan;
	}
	
	public boolean checkAllManTrue(boolean tempMan[]){
		for (int i = 0; i < tempMan.length; i++) {
			if(tempMan[i] == false){
				return false;
			}
		}
		
		return true;
	}
	
	public int countNumberOfDishesRequired(boolean tempDishes[]){
		int count = 0;
		for(int i=0 ; i<tempDishes.length ; i++){
			if(tempDishes[i]){
				count++;
			}
		}
		return count;
	}
	
	
	public void setManDishesPreference(){
		this.manDishes[0][0] = false;
		this.manDishes[0][1] = false;
		this.manDishes[0][2] = false;
		this.manDishes[0][3] = true;
		this.manDishes[1][0] = true;
		this.manDishes[1][1] = true;
		this.manDishes[1][2] = true;
		this.manDishes[1][3] = true;
		this.manDishes[2][0] = true;
		this.manDishes[2][1] = false;
		this.manDishes[2][2] = false;
		this.manDishes[2][3] = true;
		this.manDishes[3][0] = false;
		this.manDishes[3][1] = false;
		this.manDishes[3][2] = true;
		this.manDishes[3][3] = false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ManAndDishesMain manAndDishesMain = new ManAndDishesMain(4, 4);
		System.out.println(manAndDishesMain.findLeastDishesRequired());
	}

	
}
