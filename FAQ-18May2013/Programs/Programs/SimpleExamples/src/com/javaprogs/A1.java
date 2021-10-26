package com.javaprogs;
class A1
{
int i,j;


void showij()
  {
    System.out.println(+i+j);
  }
void sum()
  {
   // System.out.println((i+j+k));
  }

}

 class B1 extends A1

{
	public static void main(String args[])
	{
   int k;
   A obj1 = new A();
   B obj2 = new B();

   obj1.i = 10;
   obj1.j = 20;

   obj1.showij();

  // obj2.k = 30;
  // obj2.sum();

}
}