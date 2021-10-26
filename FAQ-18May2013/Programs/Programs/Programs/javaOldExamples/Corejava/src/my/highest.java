package my;

public class highest {
public static void main(String[] args) {
String str="1937482";int c=97;
//int y=Character.forDigit(97, c);
int y=Character.digit(str.charAt(4), 1);
System.out.println(y);

int i=str.length();
int n=i;
//System.out.println(n);
int b[]=new int[i];
for (int a=0;a<n;a++) {
	//System.out.println(a);
int s=Character.digit(str.charAt(--i), 10);
System.out.println(s);
b[a]=s;
}
for (int j=0;j<i;j++)
System.out.println(b[j]);

	}

}
