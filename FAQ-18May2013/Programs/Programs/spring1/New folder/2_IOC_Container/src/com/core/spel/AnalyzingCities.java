package com.core.spel;

import java.util.List;

public class AnalyzingCities {
	
	
	City chosenCity;
	List<City> largeCities;
	String cityNames[];
	
	
	
	
	public String[] getCityNames() {
		return cityNames;
	}

	public void setCityNames(String[] cityNames) {
		this.cityNames = cityNames;
	}

	public List<City> getLargeCities() {
		return largeCities;
	}

	public void setLargeCities(List<City> largeCities) {
		this.largeCities = largeCities;
	}

	

	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		
		str = chosenCity.name;
		
		return str;
		
		
	}
	
	public City getChosenCity() {
		return chosenCity;
	}


	public void setChosenCity(City chosenCity) {
		this.chosenCity = chosenCity;
	}
	
	public void showLargeCities()
	{		
		System.out.println("Printing Large Cities");
		for(City c : this.getLargeCities())
		{
			System.out.println(c.getName());
		}
	}
	
	public void showNamesAllCities()
	{		
		System.out.println("Names of All Cities");
		for(String name : this.getCityNames())
		{
			System.out.println(name);
		}
	}
	
	
	
	
	
	
	
	

}
