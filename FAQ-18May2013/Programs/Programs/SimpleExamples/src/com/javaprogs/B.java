package com.javaprogs;
class A
{
int i,j;
void showij()
{
System.out.println(j);
}

}

class B extends A
{
public static void main(String args[])
{
int k;
B obj1 = new B();
A obj2 = new A();

obj1.i = 8;
obj1.j = 10;

obj1.showij();
}
}
