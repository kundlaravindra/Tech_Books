/**
 * 
 */
package com.deepak.random.placeInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumadeep
 *
 */
public class StateInfo {
	
	String stateName;
	List<String> listOfCity;
	
	public StateInfo() {
		this.stateName = null;
		this.listOfCity = new ArrayList<String>();
	}
	
	public StateInfo(String name,List<String> listOfCity) {
		this.stateName = name;
		this.listOfCity = listOfCity;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<String> getListOfCity() {
		return listOfCity;
	}

	public void setListOfCity(List<String> listOfCity) {
		this.listOfCity = listOfCity;
	}
	
	@Override
	public String toString() {
		return "STATE : " + this.stateName + "CITY : {" + listOfCity + " }";
	}
	
	
}
