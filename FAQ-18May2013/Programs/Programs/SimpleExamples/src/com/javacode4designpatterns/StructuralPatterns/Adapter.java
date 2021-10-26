package com.javacode4designpatterns.StructuralPatterns;
/**
* The socket class has a specs for 15 AMP.
*/
interface Socket {
  /**
* This method is used to match the input to be
* given to the Plug
*
* @return Output of the Plug (Client)
*/
public String getOutput();
}// End of interface

/**
* The input for the plug is 5 AMP. which is a
* mismatch for a 15 AMP socket.
*
* The Plug is the client. We need to cater to
* the requirements of the Plug.
*/
class Plug {
  private String specification = "5 AMP";
public String getInput() {
return specification;
}


}// End of class

/**
* ConnectorAdapter has is the connector between
* the socket and plug so as to make the interface
* of one system to suit the client.
*/
public class Adapter implements Socket {
  /**
* Method coming from the interface
* Socket which we have to make to
* fit the client plug
*
* @return Desired output of 5 AMP
*/
public String getOutput() {
Plug plug = new Plug();
String output = plug.getInput();
return output;
}
}// End of class
