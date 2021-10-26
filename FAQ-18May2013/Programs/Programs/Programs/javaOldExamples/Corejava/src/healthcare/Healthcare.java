package healthcare;

import java.io.IOException;

public class Healthcare {
	public void sum()throws IOException{
		System.out.println("ITs execute");
	}
		public static void main(String args[]) throws IOException{
			System.out.println("it will call another method");
			Healthcare h=new Healthcare();
			h.sum();
	}

}
