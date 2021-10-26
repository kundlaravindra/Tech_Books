
package com.javacode4designpatterns.CreationalPatterns;
interface Item {
 
  /**
* pack is the method, as every item will be packed
* in a different way.
* E.g.:- The burger will be packed as wrapped in a paper
* The cold drink will be given in a glass
* The medium fries will be packed in a card box and
* The toy will be put in the bag straight.
* The class Packing is an interface for different types of
* for different Items.
*/

public Packing pack(); 
/**
* price is the method as all the items
* burger, cold drink, fries will have a price.
* The toy will not have any direct price, it will
* be given free with the meal.
*
* The total price of the meal will be the combined
* price of the three items.
*
* @return price, int in rupees.
*/

public int price();


 
}// End of class 
abstract class Burger implements Item { 
  /**
* A burger is packed in a wrapper. Its wrapped
* in the paper and is served. The class Wrapper is 
* sub-class of Packing interface.
* @return new Wrapper for every burger served.
*/
public Packing pack() {
return new Wrapper();
} 
/**
* This method remains abstract and cannot be
* given an implementation as the real implementation
* will lie with the type of burger.
*
* E.g.:- Veg Burger will have a different price from
* a fish burger.
*
* @return price, int.
*/
public abstract int price();
 
}// End of class 

class VegBurger extends Burger { 
  /**
* This is the method implementation from
* the super class Burger.
*
* @return price of a veg burger in rupees.
*/
public int price() {
return 39;
} 
}// End of class 

class Fries implements Item {

 
  /**
* Packing in which fries are served.
*
* @return new Packing for every fries.
* Envelop is a packing in which fries are given
*/
public Packing pack() {
return new Envelop();
} 
/**
* Price of the medium fries.
*
* @return int , price of medium fries in rupees
*/
public int price() {
return 25;
}
 
}// End of class 

public class Builder {

 
  public Packing additems() {
Item[] items = {new VegBurger(), new Fries(), new Cola(), new Doll()} 
return new MealBox().addItems(items);
}

public int calculatePrice() {
int totalPrice = new VegBurger().price() + new Cola().price() + new Fries().price() + new Doll().price();

return totalPrice;
}

 
}// End of class 
