package com.core;

public class Performer1 implements Perform1{

	@Override
	public String perform() throws Exception{
		// TODO Auto-generated method stub
		
		System.out.println("The performer is performing");
			if("hello".length()<5)
			throw new Exception();
		return "finished";
		
		
	}

}
