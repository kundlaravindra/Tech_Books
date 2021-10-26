package com.core.general;

import java.util.List;
import java.util.Set;

public class Owner {
	String firstName;
	String lastName;
	List cars;
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
	
	
	
	public List getCars() {
		return cars;
	}
	public void setCars(List cars) {
		this.cars = cars;
	}
	public String toString()
	{
		return firstName + ":"  + lastName + ":" + ":" + cars.size() + ":" + ((Car)cars.get(0)).getMake();
		
		
	}

	
	

}
