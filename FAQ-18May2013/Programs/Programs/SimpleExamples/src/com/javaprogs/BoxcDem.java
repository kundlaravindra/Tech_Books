package com.javaprogs;
class Boxc
{
double w,h,l;

   Boxc()
     {
       w=10;
       h=20;
       l=30;
     }

  double volume()
   {
    return w*h*l;

   }


}

class BoxcDem
{
   public static void main(String args[])
   {
     Boxc b = new Boxc();
     double vol;
     vol = b.volume();
     System.out.println(vol);
    }

}