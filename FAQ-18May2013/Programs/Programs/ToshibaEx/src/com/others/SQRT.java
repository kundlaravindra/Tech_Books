package com.others;

public class SQRT {
	public static void main(String[] args)
	{
	    //Number for which square root is to be found
	    double number =10;// Double.parseDouble(args[0]);

	    //This method finds out the square root
	    findSquareRoot(number);

	}

	/*This method finds out the square root without using
	any built-in functions and displays it */
	public static void findSquareRoot(double number)
	{

	    double g1;

	    //if the number given is a 0
	    if(number==0)
	    {
	        System.out.println("Square root of "+number+" = "+0);
	    }

	    //If the number given is a -ve number
	    else {  
	 
	    //Proceeding to find out square root of the number
	    double squareRoot = number/2;
	    do
	    {
	        g1=squareRoot;
	        squareRoot = (g1 + (number/g1))/2;
	        System.out.println(g1+"---------"+squareRoot);
	    }
	    while((g1-squareRoot)!=0);
	    System.out.println(squareRoot);

	}}

}
