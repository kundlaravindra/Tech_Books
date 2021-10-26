package com.core.autowire.autodiscovery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[])
	{
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/core/autowire/autodiscovery/autodiscovery.xml");
	
		
		Artist  artist = (Artist)context.getBean("eddie");
		artist.instrument.play();
		//Drums  drums = (Drums)context.getBean("drums");
		//drums.play();
		
		
		
		
	}

}
