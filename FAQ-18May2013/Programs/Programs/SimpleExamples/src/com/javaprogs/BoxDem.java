package com.javaprogs;
public class BoxDem
{
double width;
double height;
double depth;

BoxDem(BoxDem ob)
  {
   width = ob.width;
   height = ob.height;
   depth = ob.depth;
  }

BoxDem(double w,double h,double d)
  {
   width = w;
   height = h;
   depth = d;
  }

  double vol()
  {
    return width*height*depth;
  }
}

class Boxw extends Box
{

  double weight;
  Boxw(double w, double h, double d, double m)
  {
   width = w;
   height = h;
   depth = d;
   weight = m;
   }
}

class BoxDem
{

  public static void main(String args[])
   {

      Boxw m1 = new Boxw(10,12,15,35);
      double vol;

      vol = m1.vol();

      System.out.println(vol);
      System.out.println(m1.weight);
   }

 }
