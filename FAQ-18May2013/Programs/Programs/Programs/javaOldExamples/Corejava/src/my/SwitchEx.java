package my;

import java.util.Scanner;

public class SwitchEx {
static void sum(){
	System.out.println("i am in sum");
}
static void sum1(){
	System.out.println("i am in sum111");
}
public static void main(String[] args) {
Scanner c=new Scanner(System.in);
int i=c.nextInt();
switch(i){
case 11:sum();
break;
case 22: sum1();
   break;
   default :System.out.println("its not a number");
}
	}

}
