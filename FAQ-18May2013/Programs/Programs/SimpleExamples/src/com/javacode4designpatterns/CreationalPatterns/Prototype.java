package com.javacode4designpatterns.CreationalPatterns;
class PlantCell implements Cloneable {


  public Object split() {
    try {
      return super.clone();
}catch(Exception e) {
System.out.println("Exception occured: "+e.getMessage());
return null;
}
    }
}// End of class
public class Prototype {

  public static void main(String[] args) {
PlantCell cell = new PlantCell();
// create a clone
PlantCell newPlantCell = (PlantCell)cell.split();
}


}// End of class
