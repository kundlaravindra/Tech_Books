package com.paper1;

public class CloneIMp {
int x;
CloneIMp(int x){
	this.x = x;
}
	public Object clone(){
		System.out.println(this.x);
		return new Object();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneIMp c = new CloneIMp(5);
		//CloneIMp c1 = (CloneIMp)c.clone();
		c.clone();
	}

}
