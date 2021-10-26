package com.core.general;

import java.util.Properties;

public class OwnerProp {
	String firstName;
	String lastName;
	Properties cars;
	
	
	public Properties getCars() {
		return cars;
	}
	public void setCars(Properties cars) {
		this.cars = cars;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	public String toString()
	{
		return firstName + ":"  + lastName + ":" + ":" + cars.size() + ":" + cars.get("Audi");
		
		
	}

	
	


	

}
