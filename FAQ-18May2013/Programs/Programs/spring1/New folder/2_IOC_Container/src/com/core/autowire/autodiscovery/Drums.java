package com.core.autowire.autodiscovery;

import org.springframework.stereotype.Component;

@SkipIt
public class Drums implements Instrument{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("The drums are playing");
		
	}

}
