
package com.javacode4designpatterns.CreationalPatterns;
abstract class Computer {

  /**
* Abstract method, returns the Parts ideal for
* Server
* @return Parts
*/
public abstract Parts getRAM();
/**
* Abstract method, returns the Parts ideal for
* Workstation
* @return Parts
*/
public abstract Parts getProcessor();

/**
* Abstract method, returns the Parts ideal for
* PC
* @return Parts
*/
public abstract Parts getMonitor();

}// End of class

class Parts {


  /**
* specification of Part of Computer, String
*/
public String specification;
/**
* Constructor sets the name of OS
* @param specification of Part of Computer
*/
public Parts(String specification) {
this.specification = specification;
}

/**
* Returns the name of the part of Computer
*
* @return specification of Part of Computer, String
*/
public String getSpecification() {
return specification;
}



}// End of class

class PC extends Computer {

  /**
* Method over-ridden from Computer, returns the Parts ideal for
* Server
* @return Parts
*/
public Parts getRAM() {
return new Parts("512 MB");
}
/**
* Method over-ridden from Computer, returns the Parts ideal for
* Workstation
* @return Parts
*/
public Parts getProcessor() {
return new Parts("Celeron");
}

/**
* Method over-ridden from Computer, returns the Parts ideal for
* PC
* @return Parts
*/
public Parts getMonitor() {
return new Parts("15 inches");
}


}// End of class

class Workstation extends Computer {
  /**
* Method over-ridden from Computer, returns the Parts ideal for
* Server
* @return Parts
*/
public Parts getRAM() {
return new Parts("1 GB");
}
/**
* Method over-ridden from Computer, returns the Parts ideal for
* Workstation
* @return Parts
*/
public Parts getProcessor() {
return new Parts("Intel P 3");
}

/**
* Method over-ridden from Computer, returns the Parts ideal for
* PC
* @return Parts
*/
public Parts getMonitor() {
return new Parts("19 inches");
}

}// End of class


class Server extends Computer{

  /**
* Method over-ridden from Computer, returns the Parts ideal for
* Server
* @return Parts
*/
public Parts getRAM() {
return new Parts("4 GB");
}
/**
* Method over-ridden from Computer, returns the Parts ideal for
* Workstation
* @return Parts
*/
public Parts getProcessor() {
return new Parts("Intel P 4");
}

/**
* Method over-ridden from Computer, returns the Parts ideal for
* PC
* @return Parts
*/
public Parts getMonitor() {
return new Parts("17 inches");
}


}// End of class

public class AbstractFactory {


  private Computer comp;
public static void main(String[] args) {


    AbstractFactory type = new AbstractFactory();
Computer computer = type.getComputer("Workstation");
System.out.println("Monitor: "+computer.getMonitor().getSpecification());
System.out.println("RAM: "+computer.getRAM().getSpecification());
System.out.println("Processor: "+computer.getProcessor().getSpecification());

  }
    /**
* Returns a computer for a type
*
* @param computerType String, PC / Workstation / Server
* @return Computer
*/


public Computer getComputer(String computerType) {
    if (computerType.equals("PC"))
comp = new PC();
else if(computerType.equals("Workstation"))
comp = new Workstation();
else if(computerType.equals("Server"))
comp = new Server();
return comp;


  }
}// End of class

