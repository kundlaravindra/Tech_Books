package Com.pavan;


/*	public class B {    
	    public static synchronized void printName(){
	        try{
	             System.out.println("printName");
	                Thread.sleep(5*1000);
	            
	            }catch(InterruptedException e){                
	            }
	    }
	    
	    public synchronized void printValue(){        
	             System.out.println("printValue");                
	    }
	}



	public class Test extends Thread{
	    B b = new B();
	public static void main(String argv[]) throws Exception{
	Test t = new Test();
	Thread t1 = new Thread(t,"t1");
	Thread t2 = new Thread(t,"t2");
	t1.start();
	t2.start();
	} 

	public void run(){     
	    if(Thread.currentThread().getName().equals("t1")){
	        b.printName();
	    }else{
	        b.printValue();
	    }     
	} 

	}
*/
class A extends Thread{
    int count = 0;
        public void run(){
            System.out.println("run");
            synchronized (this) {
                for(int i =0; i < 50 ; i++){
                    count = count + i;
                }
                notify();
        }
    }
}




public class Test{
    
public static void main(String argv[]) {
    A a = new A();
    a.start();
    synchronized (a) {
        System.out.println("waiting");
        try{
            a.wait();
        }catch(InterruptedException e){
            
        }
        System.out.println(a.count);
            
        }
   

}

}










