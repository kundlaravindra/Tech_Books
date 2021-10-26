package eprism;
public class Mysat {
static int i;
{
++i;
System.out.println(i);
}

public static void main(String[] args) {
	//static int i;
	Mysat g=new Mysat();
	g.sum();
System.out.println(++i);
		// TODO Auto-generated method stub

	}
void sum(){
	i=9;
}

}
