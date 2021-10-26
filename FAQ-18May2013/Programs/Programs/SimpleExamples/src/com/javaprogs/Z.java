package com.javaprogs;
class X
{
int i,j;
 void showij()
 {
 System.out.println(+i+" "+j);
 }
}

class Y extends X
{
  int k;

  void showk()
  {
    System.out.println(k);
  }

  void sum()
  {
   System.out.println((i+j+k));
  }
}

class Z
{
  public static void main(String args[])
  {

  X x = new X();
  Y y = new Y();

  x.i = 10;
  x.j = 20;
  x.showij();

  y.i = 10;
  y.j = 22;
  y.showij();
  y.k = 30;
  y.showk();
  y.sum();
}
}