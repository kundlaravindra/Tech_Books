package com.core.general;

public class LifeCycle2 {
	
	
	public void init(){
		System.out.print("Bean Initialized");
		
	}

	//Application context needs to be closed for this method to be invoked and the below mentioned line should be used
	// AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/core/constructors/box.xml");
	
	public void destroy(){
		System.out.print("Bean Destroyed");
		
		
	}
	public void init2(){
		System.out.print("Bean Initialized 2");
		
	}

	//Application context needs to be closed for this method to be invoked and the below mentioned line should be used
	// ConfigurableApplicationContext context =  new ClassPathXmlApplicationContext("com/core/constructors/box.xml");
	
	public void destroy2(){
		System.out.print("Bean Destroyed 2");
		
		
	}
	
	

}
