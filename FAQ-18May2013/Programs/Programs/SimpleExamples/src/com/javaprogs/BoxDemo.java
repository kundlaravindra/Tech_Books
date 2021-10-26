package com.javaprogs;
class BoxDemo
{
	BoxDemo b3 = new BoxDemo();
public static void main(String args[])
{
Box b = new Box();
b.w = 10;
b.h = 20;
b.d = 30;
double vol;
Box b2 = new Box();
b2.w = 35;
b2.h = 15;
b2.d = 30;
vol = b.volume();
System.out.println(vol);
vol = b2.volume();
System.out.println(vol);
}
}