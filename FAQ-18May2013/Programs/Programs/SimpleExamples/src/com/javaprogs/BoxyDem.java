package com.javaprogs;
class Boxy
{
   double w,h,l;

   double volume()
   {
     return w*h*l;
   }

}

class BoxyDem
{
public static void main(String args[])
{
Boxy myboxy = new Boxy();
double vol;
myboxy.w = 10;
myboxy.h = 20;
myboxy.l = 30;

 vol = myboxy.volume();
 System.out.println(vol);
}
}