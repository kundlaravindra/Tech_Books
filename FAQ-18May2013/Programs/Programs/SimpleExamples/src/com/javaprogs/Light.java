package com.javaprogs;
class Light
{
public static void main(String args[])
{
int lightspeed;
long days;
long distance;
long seconds;

days = 100;
lightspeed = 186000;
seconds = days*24*60*60;
distance = lightspeed*seconds;
System.out.println(distance);
}
}
