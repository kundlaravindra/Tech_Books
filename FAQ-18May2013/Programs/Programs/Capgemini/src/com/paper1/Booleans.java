package com.paper1;

/*public class Booleans {

	public static void main(String[] args) {
 boolean a = true;
 boolean b = false;
 int x = 4;
 if(x==4 && !b){
	 System.out.println("hi");
 }
 if (b = true){
	 System.out.println("hi");
	 
 }
 if (b | a){
	 System.out.println("hi");
	 
 }
	}

}
*/

public class Booleans {
public static void main(String[] args) {
int n = 1;
int k = 0;
int loop = 15;
for (int i = 1; i <= loop; i++) {
for (int j = 1; j < i + 1; j++)
k++;
if (i % 2 == 0)
for (int l = k; l >= n; l--)
System.out.print(l + " ");
else
for (int l = n; l <= k; l++)
System.out.print(l + " ");
n = k + 1;
if (k == loop)
break;
System.out.println();
}
}

}












