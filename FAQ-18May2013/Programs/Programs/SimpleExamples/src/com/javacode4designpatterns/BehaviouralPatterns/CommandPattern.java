//: command:CommandPattern.java
package com.javacode4designpatterns.BehaviouralPatterns;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

interface CommandPattern {
  void execute();
}

class Hello implements CommandPattern {
  public void execute() {
    System.out.print("Hello ");
  }
}

class World implements CommandPattern {
  public void execute() {
    System.out.print("World! ");
  }
}

class IAm implements CommandPattern {
  public void execute() {
    System.out.print("I'm the command pattern!");
  }
}

// An object that holds commands:
class Macro {
  private List commands = new ArrayList();
  public void add(CommandPattern c) { commands.add(c); }
  public void run() {
    java.util.Iterator it = commands.iterator();
    while(it.hasNext())
      ((CommandPattern)it.next()).execute();
  }
}

  class Command extends TestCase  {
  Macro macro = new Macro();
  public void test() {
    macro.add(new Hello());
    macro.add(new World());
    macro.add(new IAm());
    macro.run();
  }
  public static void main(String args[]) {
    //junit.textui.TestRunner.run(CommandPattern.class);
  }
} ///:~
