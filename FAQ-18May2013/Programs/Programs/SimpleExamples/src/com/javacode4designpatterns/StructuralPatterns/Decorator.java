package com.javacode4designpatterns.StructuralPatterns;
abstract class Decorator {

 
  /*
* The method places each decorative item
* on the tree.
*/
public abstract void place(Branch branch); 
}// End of class 

class ChristmasTree {

 
private Branch branch; 
public Branch getBranch() {
return branch;
} 
 
}// End of class 

/**
* Decorates the branch of the tree with
* coloured balls.
*/
public class BallDecorator extends Decorator {

 
  // Default Constructor
public BallDecorator(ChristmasTree tree) {
Branch branch = tree.getBranch();
place(branch);
} 
/*
* The method places each decorative item
* on the tree.
*/
public void place(Branch branch) {
branch.put("ball");
} 

 
}// End of class 
