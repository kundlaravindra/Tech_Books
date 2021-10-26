package bobTech;

public class Example extends Thread{
int i=3;
Example(){
	i=12;
	start();
}
	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
  new Example().modify();
	}
	public void modify() throws InterruptedException{
		join();
		i=i-1;
		System.out.println(i);
	}
	public void run(){
		i*=2;
	}

}
