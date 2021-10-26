package com.core.autowire.autodiscovery;

import org.springframework.stereotype.Component;


@StringedInstrument
public class Guitar implements Instrument{

	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
		System.out.println("The guitar is playing");
		
		
	}
	
	
	
	

}
