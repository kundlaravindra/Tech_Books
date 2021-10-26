package com.javaprogs;
class Boxz
{
  double w,h,l;

  double volume()
  {
  return w*h*l;
  }

  void dim(double x,double y,double z)
  {
  w=x;
  h=y;
  l=z;
  }
}

class BoxzDem
{
    public static void main(String args[])
  {
     Boxz mybox = new Boxz();
     double vol;
     mybox.dim(10,20,30);
     vol=mybox.volume();
     System.out.println(vol);
     }
}