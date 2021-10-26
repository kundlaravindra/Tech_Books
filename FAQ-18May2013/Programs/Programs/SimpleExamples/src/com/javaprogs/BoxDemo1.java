package com.javaprogs;
class Box
{

double width;
double height;
double length;

 void volume()
 {
 System.out.println(width*height*length);
 System.out.println("hey");
 }
}
 class BoxDemo1
 {
 /*width = 10;
 height = 20;
 length = 30;
  */
  public static void main(String args[])
  {
Box mybox1 = new Box();
mybox1.width = 10;
 mybox1.height = 20;
 mybox1.length = 30;

 mybox1.volume();
 }
 }
