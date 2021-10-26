package com.javaprogs.javaprogs;
class Menu
{
  public static void main(String args[])throws java.io.IOException
  {
    char choice;

    do
     {
       System.out.println("Help on:");
       System.out.println(" 1.if");
       System.out.println(" 2.switch");
       System.out.println(" 3.while\n");
       choice = (char) System.in.read();
      }while( choice < '1'|| choice > '3');

      System.out.println("\n");

      switch(choice)
      {
       case '1':
         System.out.println("The if:\n");
         System.out.println("if(condition) statement;");
         System.out.println("else statement;");
         choice = (char) System.in.read();
         break;
       case '2':
         System.out.println("The switch:\n");
         System.out.println("switch(expression) {");
         System.out.println(" case constant:");
         System.out.println(" statement sequence");
         System.out.println(" break;");
         System.out.println(" // ...");
         System.out.println("}");
         choice = (char) System.in.read();
         break;
       case '3':
         System.out.println("The while:\n");
         System.out.println("while(condition) statement");
         choice = (char) System.in.read();
         break;
       }
    }
}