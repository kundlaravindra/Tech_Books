
package com.javacode4designpatterns.BehaviouralPatterns;
/**
* Iterator interface has method declarations for iterating through
* TV channels. All remote controls implement Iterator.
*/
public interface Iterator { 
  public Channel nextChannel(int currentChannel);
public Channel prevChannel(int currentChannel); 
}// End of interface 

/**
* ChannelSurfer is a part of remote control which implements the Iterator
* interface. This class overrides the nextChannel and prevChannel methods.
*/

public ChannelSurfer implements Iterator { 
  /**
* nextChannel – method which takes the current channel number
* and returns the next channel.
*/
public Channel nextChannel (int currentChannel) {  
    Channel channel = new Channel(currentChannel+1);
return channel; 
   }     
  /**
* prevChannel – method which takes the current channel number
* and returns the previous channel.
*/
public Channel prevChannel (int currentChannel) { 
      Channel channel = new Channel(currentChannel-1);
return channel; 
  }   
}// End of class 

/**
* RemoteControl class is the actual remote control and it behaves and makes
* use of ChannelSurfer.
*/
public class RemoteControl { 
  private ChannelSurfer surfer;
private Settings settings; 
public RemoteControl() {

 
    surfer = new ChannelSurfer();
settings = new Settings(); 
   }   
  /**
* getProgram returns the program for that channel.
*
*/
public getProgram(ChannelSurfer surfer) { 
    return new Program(surfer.nextChannel()); 
   }     
}// End of class 
