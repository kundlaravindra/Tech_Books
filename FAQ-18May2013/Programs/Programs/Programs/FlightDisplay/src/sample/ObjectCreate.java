package sample;
public class ObjectCreate {
static int i=0;
ObjectCreate(){
	if(i==5){
		System.out.println("you are wrong");
	}
	if(i==4){
		System.out.println("you can't create");
		System.exit(0);
	}
	i++;
	}
	public static void main(String[] args) {
		ObjectCreate f=new ObjectCreate();
		ObjectCreate f1=new ObjectCreate();
		ObjectCreate f2=new ObjectCreate();
		ObjectCreate f3=new ObjectCreate();
		ObjectCreate f4=new ObjectCreate();
		ObjectCreate f5=new ObjectCreate();
		
	}

}
