package sample;
public class FilesEx {
	
	public void check(int x ){
	if (x==9) {
		FilesEx filesEx =new FilesEx();
		filesEx.readFile();
		//System.out.println(t1.currentThread());
	}
	else if(x==8){
		FilesEx filesEx =new FilesEx();
		filesEx.secondFile();
		//t2.secondFile();
		
	}
	else if(x==6){
		FilesEx filesEx =new FilesEx();
		filesEx.compareFile();
		//t3.compareFile();
	}
	else{
		System.out.println("No thread executed..");
	}
	}
	public void readFile(){
		System.out.println("i am in read file");
	}
public void secondFile(){
	System.out.println("i am in second file");
}
public void compareFile(){
	System.out.println("i am in comparefile");
}

}
