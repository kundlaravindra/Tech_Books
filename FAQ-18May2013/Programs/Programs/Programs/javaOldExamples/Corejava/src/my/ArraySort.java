package my;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {
public static void main(String[] args) {
Integer[] i=new Integer[7];
//	int[] i=new int[7];
i[0]=6;
i[1]=4;
i[2]=8;
i[3]=7;
i[4]=2;
i[5]=11;
i[6]=10;
Arrays.sort(i);
Scanner c=new Scanner(System.in);
int j=c.nextInt();
System.out.println("Required value is  :"+"  "+i[j]);
for (Integer a:i)
//for (int a:i)
{
	System.out.println(a);
}
Arrays.sort(i,Collections.reverseOrder());
for (int b:i)
	System.out.println(b);
	}

}
