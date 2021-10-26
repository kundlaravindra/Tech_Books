package com.javaprogs;
class Star
{
public static void main(String args[])
{
int i,j,k;
//for(k=0;k<5;k++)
{
for(i=1;i<=5;i+=2)
{
for(j=1;j<=i;j+=1)

System.out.print('*');
System.out.println("");

}
for(i=3;i<=5;i+=2)
{
for(j=5;j>=i;j-=1)
System.out.print('*');
System.out.println();
}

}
}
}