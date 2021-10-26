package com.core.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[])
	{
		ApplicationContext context =  new ClassPathXmlApplicationContext("constructor.xml");
		
		C bean = (C)context.getBean("instanceC");
		
		bean.show();
		bean.getInstanceA().show();
		bean.getInstanceB().show();

			}

}
