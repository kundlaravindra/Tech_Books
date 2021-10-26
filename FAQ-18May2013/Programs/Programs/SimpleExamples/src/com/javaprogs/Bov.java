package com.javaprogs;
class Bo
{
  double width,height,length;
  Bo(double w,double h,double l)
  {
  width = w;
  height = h;
  length = l;
  }

  double vol()
  {
  return width*height*length;
  }
}

class Bov{

public static void main(String args[])
{
Bo b = new Bo(10,20,30);
System.out.println(b.vol());
}

}