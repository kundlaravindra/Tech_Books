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
public class PlaceInfoUtil {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> listOfCityUP = new ArrayList<String>();
		listOfCityUP.add("Agra");
		listOfCityUP.add("Varanai");
		listOfCityUP.add("Kanpur");
		listOfCityUP.add("Lucknow");
		
		StateInfo sUP = new StateInfo("UP",listOfCityUP);
		
		List<String> listOfCityRJ = new ArrayList<String>();
		listOfCityRJ.add("Jaipur");
		listOfCityRJ.add("Jodhpur");
		listOfCityRJ.add("Udaipur");
		listOfCityRJ.add("Alwar");
		StateInfo sRJ = new StateInfo("Rajasthan",listOfCityRJ);
		
		List<StateInfo> listOfStateInd = new ArrayList<StateInfo>();
		listOfStateInd.add(sUP);
		listOfStateInd.add(sRJ);
		
		CountryInfo cIndia = new CountryInfo("India",listOfStateInd);
		
		List<CountryInfo> listOfCountry = new ArrayList<CountryInfo>();
		listOfCountry.add(cIndia);
		
		System.out.println(getPlaceInfo("Kanpur", listOfCountry));
		
	}

	public static String getPlaceInfo(String place, List<CountryInfo> listOfCountry){
		
		for(CountryInfo ci : listOfCountry){
			if(ci.getCountryName().equalsIgnoreCase(place)){
				return ci.toString();
			}else{
				for(StateInfo si : ci.getListOfState()){
					if(si.getStateName().equalsIgnoreCase(place)){
						return "Country : " + ci.getCountryName() + " : State : " + si.toString();
					}else{
						for(String city : si.getListOfCity()){
							if(city.equalsIgnoreCase(place)){
								return "Country : " + ci.getCountryName() + " : State : " 
										+ si.getStateName() + " : City : " + city;
							}
						}
					}
				}
			}
		}
		
		return "Place not found";
	}
}
