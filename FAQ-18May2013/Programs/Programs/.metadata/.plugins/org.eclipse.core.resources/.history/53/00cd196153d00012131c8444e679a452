package com.core.general;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle1 implements InitializingBean,DisposableBean {
	
	
	

	//Application context needs to be closed for this method to be invoked and the below mentioned line should be used
	// AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/core/constructors/box.xml");
	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Initialized using After properties set");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Bean Destroyed using disposable bean");
		
		
	}
	
	

}
