package eprism;

public class BobEx2 implements BobInterface{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(BobInterface.my.i);
int i=0,j=2;
do {
	i=i+1;
	j--;
}while(j>0);
System.out.println("i is :"+i+" & J ia :"+j);
//char c='d';
int g=5;
//double f=g>5?9.9:9;
System.out.println(g>5?9.9:9.8);
	}

}
