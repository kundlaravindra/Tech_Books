package com.javacode4designpatterns.StructuralPatterns;
/**
* Just two methods. on and off.
*/
interface Switch { 
  // Two positions of switch.
public void switchOn();
public void switchOff(); 
}// End of interface 


/**
* Implement the switch for Fan
*/
class Fan implements Switch { 
  // Two positions of switch.
public void switchOn() {
System.out.println("FAN Switched ON");
} 
public void switchOff() {
System.out.println("FAN Switched OFF");
}

 
}// End of class 

/**
* Implement the switch for Fan
*/
class Bulb implements Switch { 
  // Two positions of switch.
public void switchOn() {
System.out.println("BULB Switched ON");
} 
public void switchOff() {
System.out.println("BULB Switched OFF");
}

 
}// End of class 

