package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemo {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/aop5.xml");
		//Instrumentalist singer = (Instrumentalist)context.getBean("singer");
		//Singer artist = (Singer)context.getBean("singer");
		
		Perform1 performer = (Perform1)context.getBean("performer");
		
		try {
				//singer.playInstrument();
				//((Singer)singer).sing("song  ");
				//artist.sing("some song");
			performer.perform();
				
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
