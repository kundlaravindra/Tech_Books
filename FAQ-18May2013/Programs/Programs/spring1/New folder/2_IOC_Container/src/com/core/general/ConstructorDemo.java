package com.core.general;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDemo {
	public static void main(String args[])
	{
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/core/general/properties.xml");
		

		  
		Owner b = (Owner)context.getBean("owner1");

		System.out.println(b);
		
		//OwnerMap owner = (OwnerMap)context.getBean("owner2");
		
		//System.out.println(owner);
		
		//OwnerProp  bb = (OwnerProp)context.getBean("owner3");
		
		//System.out.println(bb);

		
		
		
		
		
		
	}

}
