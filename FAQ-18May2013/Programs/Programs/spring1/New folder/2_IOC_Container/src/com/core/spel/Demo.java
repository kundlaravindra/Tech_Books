package com.core.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[])
	{
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/core/spel/collections.xml");
		
		AnalyzingCities  bean3 = (AnalyzingCities)context.getBean("citiesTest");
		System.out.println(bean3);
		bean3.showLargeCities();
		bean3.showNamesAllCities();
		
		//SPEL3 bean = (SPEL3)context.getBean("bean3");
		
		//System.out.println(bean);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
