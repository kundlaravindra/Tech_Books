package com.toshiba.sorting;

public class BubbleSort{
	  public static void main(String a[]){
	  int i;
	  int array[] = {12,9,4,99,120,1,3,10};
	  System.out.println("Values Before the sort:\n");
	  for(i = 0; i < array.length; i++)
	  System.out.print( array[i]+"  ");
	  System.out.println();
	  bubble_srt(array, array.length);
	  System.out.print("Values after the sort:\n");
	  for(i = 0; i <array.length; i++)
	  System.out.print(array[i]+"  ");
	  System.out.println();
	  System.out.println("PAUSE");
	  }

	  public static void bubble_srt( int a[], int n ){
	  int i, j,t=0;
	  for(i = 0; i < n; i++){
	  for(j = 1; j < (n-i); j++){
	  if(a[j-1] > a[j]){
	  t = a[j-1];
	  a[j-1]=a[j];
	  a[j]=t;
	  }
	  }
	  }
	  }
	}