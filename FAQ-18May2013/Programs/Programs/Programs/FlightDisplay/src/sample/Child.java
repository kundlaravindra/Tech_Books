package sample;

public class Child extends Parent {
	public static void main(String[] args) {
		Child ch = new Child();
		Parent ch1 = new Child();
		ch1.method();
		ch.method();
	}

}
