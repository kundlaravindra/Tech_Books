package com.javacode4designpatterns.CreationalPatterns;
final class Singleton {

  private static Singleton s = new Singleton(47);

  private int i;

  private static int j=0;

  private Singleton(int x) { i = x; }

  public static Singleton getReference() {
    return s;
  }

  public int getValue() { return i; }
  public void setValue(int x) { i = x; }
}

public class SingletonPattern1{
	public static void main(String args[]) throws Exception
	{
		//Singleton s = Singleton.s;
		Singleton s = Singleton.getReference();

		int i = s.getValue();
	}

}