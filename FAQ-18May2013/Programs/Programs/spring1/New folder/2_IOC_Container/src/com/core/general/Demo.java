package com.core.general;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String args[])
	{
		
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/core/general/left-overs.xml");
	
		context.registerShutdownHook();
		//BeanPostProcessorExample bean = (BeanExample)context.getBean("contextAware");
		
		//bean.showBeans();
		
		//System.out.println(bean.getBeanName());
	
		
		
		//LifeCycle  bean = (LifeCycle)context.getBean("life");
	
		//System.out.println(bean.breadth+bean.length+bean.height);
		
		//LifeCycle1  b = (LifeCycle1)context.getBean("life1");
		
		//ApplicationContextAwareExample  example = (ApplicationContextAwareExample)context.getBean("contextAware");
		//example.showBeans();
		//BeanNameAwareExample  example = (BeanNameAwareExample)context.getBean("nameAware");
		//System.out.println(example.getBeanName());
		
		
		
		
		
		
		
		
		
	}

}
