package eprism;
class Myt
{
	public void sum(){
		System.out.println("vinod");
	}
}

public class MyConstuctor extends Myt {

	public void sum(){
		System.out.println("vinodrsreddy");
		return ;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	float f=7.8f;
	int i=(int)f;
	Myt b=new Myt();
	//MyConstuctor a=(MyConstuctor)b;
	System.out.println(i);
	System.out.println(f);
b.sum();
	}

}
