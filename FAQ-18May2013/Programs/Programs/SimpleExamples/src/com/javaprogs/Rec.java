package com.javaprogs;
class Factorial
{
  int fact(int n)
  {
    int result;
System.out.println(n);
    if(n==1) return 1;
    result=fact(n-1)*n;
    return result;
  }
}

class Rec
{
  public static void main(String args[])
  {
    Factorial f = new Factorial();

    System.out.println(f.fact(2));
  //  System.out.println(f.fact(1));
  }

}