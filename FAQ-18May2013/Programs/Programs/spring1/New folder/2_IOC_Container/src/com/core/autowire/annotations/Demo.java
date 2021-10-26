package com.core.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[])
	{
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/core/autowire/annotations/annotations.xml");
		
		//B  bb = (B)context.getBean("instanceB");
		
		//bb.show();
		//bb.getInstanceA().show();
		
		
		
		Artist  artist = (Artist)context.getBean("artist");
		artist.instrument.play();
		
		
		
		
	}

}
