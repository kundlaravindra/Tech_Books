package com.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.Ordered;

public class AopDemo  {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/annotations/aop1.xml");
		Instrumentalist singer = (Instrumentalist)context.getBean("singer");
		//Singer artist = (Singer)context.getBean("westernSinger");
		//Perform artist = (Perform)context.getBean("performer");
		
		try {
				singer.playInstrument();
				//artist.sing("some song");
				//artist.perform();
				
				
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
