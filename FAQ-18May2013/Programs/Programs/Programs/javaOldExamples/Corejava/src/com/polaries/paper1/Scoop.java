package com.polaries.paper1;

public class Scoop {

	static int thrower() throws Exception{
		return 42;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int x=thrower();
			System.out.println(x);
		}
		catch(Exception e){
			//x++;
		}
		finally{
			//System.out.println(x);
		}

	}

}
