package com.deepak.random.placeInfo;

import java.util.ArrayList;
import java.util.List;

public class CountryInfo {

	String countryName;
	List<StateInfo> listOfState;
	
	public CountryInfo() {
		this.countryName = null;
		this.listOfState = new ArrayList<StateInfo>();
	}
	
	public CountryInfo(String name,List<StateInfo> listOfState) {
		this.countryName = name;
		this.listOfState = listOfState;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<StateInfo> getListOfState() {
		return listOfState;
	}

	public void setListOfState(List<StateInfo> listOfState) {
		this.listOfState = listOfState;
	}
	
	@Override
	public String toString() {
		return "Country : " + this.countryName + "State : {" + this.listOfState + " }";
	}
	
}
