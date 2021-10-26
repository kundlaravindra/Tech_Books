package com.javaexamples;

/*
 * Copyright (c) 1995-1998 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

import java.util.*;
import java.text.*;

public class NumberFormatDemo {

   static public void displayNumber(Locale currentLocale) {

      Integer quantity = new Integer(123456);
      Double amount = new Double(345987.246);
      NumberFormat numberFormatter;
      String quantityOut;
      String amountOut;

      numberFormatter = NumberFormat.getNumberInstance(currentLocale);
      quantityOut = numberFormatter.format(quantity);
      amountOut = numberFormatter.format(amount);
      System.out.println(quantityOut + "   " + currentLocale.toString());
      System.out.println(amountOut + "   " + currentLocale.toString());
   }

   static public void displayCurrency(Locale currentLocale) {

      Double currency = new Double(9876543.21);
      NumberFormat currencyFormatter;
      String currencyOut;

      currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
      currencyOut = currencyFormatter.format(currency);
      System.out.println(currencyOut + "   " + currentLocale.toString());
   }

   static public void displayPercent(Locale currentLocale) {

      Double percent = new Double(0.75);
      NumberFormat percentFormatter;
      String percentOut;

      percentFormatter = NumberFormat.getPercentInstance(currentLocale);
      percentOut = percentFormatter.format(percent);
      System.out.println(percentOut + "   " + currentLocale.toString());
   }

   static public void main(String[] args) {

      Locale[] locales = {
          new Locale("fr","FR"),
          new Locale("de","DE"),
          new Locale("en","US")
      };

      for (int i = 0; i < locales.length; i++) {
         System.out.println();
         displayNumber(locales[i]);
         displayCurrency(locales[i]);
         displayPercent(locales[i]);
      }
   }

}

