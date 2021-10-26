package com.javacode4designpatterns.StructuralPatterns;
/**
* Bank.java
* The class acts as the main object for which 
* the proxy has to be created. As described, going
* to bank for withdrawal is very costly time wise.
*/
public class Bank {
 
  private int numberInQueue;
/**
* Method getMoneyForPurchase
* This method is responsible for the entire banking
* operation described in the write-up
*/
public double getMoneyForPurchase(double amountNeeded) {

// get object for person
You you = new You("Prashant");
// get obj for account 
Account account = new Account();
// get person's account number
String accountNumber = you.getAccountNumber();
// passbook got.
boolean gotPassbook = you.getPassbook(); 
// get number in queue
int number = getNumberInQueue();

// the number will decrease every few mins
while (number != 0) {
number--; 
}

// now when the number = 0, check if balance is sufficient
boolean isBalanceSufficient = account.checkBalance(accountNumber, amountNeeded);

if(isBalanceSufficient) 
return amountNeeded;
else
return 0;
}

/**
* returns the number in the queue
*/
private int getNumberInQueue() {
return numberInQueue;
}

 
}// End of class 

public class ATMProxy {
 
  /**
* Method getMoneyForPurchase
* This method is responsible for the entire banking
* operation described in the write-up
*/
public double getMoneyForPurchase(double amountNeeded) {

// get obj of You to get card
You you = new You("Prashant");
// get obj for account 
Account account = new Account();

boolean isBalanceAvailable = false;
// if card there, go ahead
if(you.getCard()) {
isBalanceAvailable = account.checkBalance(you.getAccountNumber(), amountNeeded);
}

if(isBalanceAvailable)
return amountNeeded;
else
return 0;
}  
}// End of class 
