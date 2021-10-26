package sample;

import java.util.ArrayList;
import java.util.List;

public class ClaaIlp implements InterfaceEx {
	public void run(){
		System.out.println("i am at interface");
	}
public void Demo(){
	System.out.println("class method");
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx i=new ClaaIlp();
		i.run();
		List l=new ArrayList();
		ArrayList a=new ArrayList();
	}

}
