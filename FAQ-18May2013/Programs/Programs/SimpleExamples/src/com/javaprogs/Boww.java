package com.javaprogs;
class Bow
{
  double width,height,length;

  Bow(double w,double h,double l)
  {
    width=w;
    height=h;
    length=l;
  }

  Bow()
  {
    width = -1;
    height = -1;
    length = -1;
  }

  Bow(double len)
  {
    width = height = length = len;

  }

  double vol()
  {

    return width*height*length;
  }

}

class Boww
{
  public static void main(String args[])
  {
  Bow b1 = new Bow(10,20,30);
  Bow b2 = new Bow();
  Bow b3 = new Bow(7);
  System.out.println(b1.vol());
  System.out.println(b2.vol());
  System.out.println(b3.vol());

  }
}