package org.arpit.javapostsforlearning;

public class Spring3HelloWorld {

    String name;
    
    public void printHello()
    {
        System.out.println("Hello World from "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}