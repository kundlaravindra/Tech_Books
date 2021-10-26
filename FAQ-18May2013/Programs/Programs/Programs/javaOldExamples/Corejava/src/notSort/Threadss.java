package notSort;

public class Threadss extends Thread{
public synchronized void sum(){
	System.out.println("vinod");
}
public void run(){
	System.out.println("rsreddy");
}
public static void main(String[] args) {
Integer i=10;
Integer j=15;
System.out.println(i.compareTo(j));
//System.out.println(0/0==0);
Threadss t=new Threadss();
Threadss t1=new Threadss();
t.sum();
t1.sum();
t.start();
t1.start();
	}
}
