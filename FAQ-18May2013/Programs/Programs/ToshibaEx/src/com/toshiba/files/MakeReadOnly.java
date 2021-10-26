package com.toshiba.files;

import java.io.File;

public class MakeReadOnly {
   public static void main(String[] args) {
      File file = new File("E:/Bakup/java.txtRaj_java_with_3_years.doc");
      System.out.println(file.setReadOnly());
      System.out.println(file.canWrite());
   }
}
