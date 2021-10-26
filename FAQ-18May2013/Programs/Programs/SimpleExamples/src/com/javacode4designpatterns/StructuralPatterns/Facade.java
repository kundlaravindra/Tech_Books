package com.javacode4designpatterns.StructuralPatterns;
interface Store {
 
  public Goods getGoods(); 
}// End of interface 

class FinishedGoodsStore implements Store {

 
  public Goods getGoods() {
FinishedGoods finishedGoods = new FinishedGoods();
return finishedGoods;
} 
}// End of class 

class StoreKeeper {
 
  /**
* The raw materials are asked for and
* are returned
*
* @return raw materials
*/
public RawMaterialGoods getRawMaterialGoods() {
RawMaterialStore store = new RawMaterialStore();
RawMaterialGoods rawMaterialGoods = (RawMaterialGoods)store.getGoods();
return rawMaterialGoods;
} 

/**
* The packaging materials are asked for and
* are returned
*
* @return packaging materials
*/
public PackingMaterialGoods getPackingMaterialGoods() {
PackingMaterialStore store = new PackingMaterialStore();
PackingMaterialGoods packingMaterialGoods = (PackingMaterialGoods)store.getGoods();
return packingMaterialGoods;
}


/**
* The finished goods are asked for and
* are returned
*
* @return finished goods
*/
public FinishedGoods getFinishedGoods() {
FinishedGoodsStore store = new FinishedGoodsStore();
FinishedGoods finishedGoods = (FinishedGoods)store.getGoods();
return finishedGoods;
}
 
}// End of class 


public class Client {
 
  /**
* to get raw materials
*/
public static void main(String[] args) {
StoreKeeper keeper = new StoreKeeper();
RawMaterialGoods rawMaterialGoods = keeper.getRawMaterialGoods();
} 
}// End of class 
