package com.core.general;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextAwareExample implements ApplicationContextAware {
	ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		
		this.context = arg0;
		

	}
	
	public void showBeans()
	{
		String name[] = context.getBeanNamesForType(Box.class);
		for(String str: name)
		{
			System.out.println(str);
		}
			
	
	}
	
	

	
}
