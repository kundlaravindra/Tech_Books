package com.javacode4designpatterns.BehaviouralPatterns;
/**
* StockExchange – this is the mediator class
*/
public class StockExchange { 
  public static void doTransaction (String typeOfTransaction, int quantity, Scrip scrip, Trader trader) { 
    Transaction transaction = new Transaction(typeOfTransaction, quantity, scrip, trader);
// try and match the current transaction
// with the ones saved in DB and find out
// whether a counter transaction is there or
// are there many such transactions which could
// fulfill requirement of this transaction.
matchTransaction(transaction)
 
  }
public static getPrice (Scrip scrip) {  
    // try and match this transaction with all
// the saved ones. If they match till whatever extent
// trade for that. Then save, with status Traded for
// number of shares traded and save the rest as New. 
  }    
}// End of class 

/**
* Trader1 – this trader wants to sell 100 shares of company XYZ
*/

public class Trader1 { 
  public void doTransaction (String typeOfTransaction, int quantity) { 
    int expectedPrice = 320;
Scrip scrip = new Scrip(“XYZ”);
int price = StockExchange.getPrice(scrip); 
if(typeOfTransaction.equals(“SELL”)){

 
      if(price >= expectedPrice){
StockExchange.doTransaction(“SELL”, 100, scrip, trader1);
} 
    }else if(typeOfTransaction.equals(“BUY”)){ 
      if(price <= expectedPrice){
StockExchange.doTransaction(“BUY”, 100, scrip, trader1);
} 
    } 
  }   
}// End of class 

/**
* Trader2 – this trader wants to buyl 100 shares of company XYZ
*/

public class Trader2 { 
  public void doTransaction (String typeOfTransaction, int quantity) { 
    int expectedPrice = 320;
Scrip scrip = new Scrip(“XYZ”);
int price = StockExchange.getPrice(scrip);

if(typeOfTransaction.equals(“SELL”)){

 
      if(price >= expectedPrice){
StockExchange.doTransaction(“SELL”, 100, scrip, trader2);
} 
    }else if(typeOfTransaction.equals(“BUY”)){ 
      if(price <= expectedPrice){
StockExchange.doTransaction(“BUY”, 100, scrip, trader2);
} 
    } 
  }   
}// End of class 
