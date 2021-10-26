
package javacode4designpatterns.BehaviouralPatterns;
import java.util.jar.Attributes.Name;

class NotesInterpreter {

 
  private Name note;

/**
* This method gets the note from the keys pressed.
* Them, this sets it at a global level.
*/
public void getNoteFromKeys(Name note) {
Frequency freq = getFrequency(note);
sendNote(freq);
}

/**
* This method gets the frequency for the note.
* Say, if the note is “Sa”, it will return 256.
*/
private Frequency getFrequency(Note note) {
// Get the frequency from properties
// file using ResourceBundle
// and return it.
return freq;
}

/**
* This method forwards the frequency to the
* sound producer which is some electronic instrument which
* plays the sound.
*/
private void sendNote(Frequency freq) {
NotesProducer producer = new NotesProducer();
producer.playSound(freq);
}
 
}// End of class 


package com.javacode4designpatterns.BehaviouralPatterns; 
public class NotesProducer {

 
  private Frequency freq;

public NotesProducer() {
this.freq = freq;
}

/**
* This method produces the sound wave of the
* frequency it gets.
*/
public void playSound(Frequency freq) {
} 
}// End of class 



