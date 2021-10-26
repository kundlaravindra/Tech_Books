package bobTech;

public class Example3 {
    int i=0;
	public static void main(String[] args) throws CloneNotSupportedException{
		Example3 e=new Example3();
		e.i=1;
		Example3 e1=(Example3) e.clone();
		System.out.println(e1.i);
		
		
	}

}
