package com.javaprogs;
class Test
{
  int a;
  public int b;
  private int c;

  void setc(int i)
  {
    c=i;

  }
   int getc()
  {
   return c;

  }
}

class Access
{
 public static void main(String args[])
 {
 Test t = new Test();
 t.a = 20;
 t.b = 30;
 t.setc(40);
 System.out.println(t.getc());
 System.out.println(t.a);
 System.out.println(t.b);
 }
}
