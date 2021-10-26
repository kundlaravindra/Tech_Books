package sample;

public class ThreadExample implements Runnable {
	
	FilesEx fe;
	public ThreadExample(FilesEx fe) {
		this.fe=fe;
		
		// TODO Auto-generated constructor stub
	}
	public void run(){
		fe.check(9);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilesEx fe=new FilesEx ();
		ThreadExample threadExample=new ThreadExample(fe);
		Thread t1 =new Thread(threadExample);
		//t1.setPriority(9);
		Thread t2= new Thread(threadExample);
		//t2.setPriority(8);
		Thread t3 = new Thread(threadExample);
		//t3.setPriority(6);
		t1.start();
		int x=t1.getPriority();
		System.out.println("first thread"+x);
		t2.start();
		t3.start();
		

	}

}
