package com.javacode4designpatterns.CreationalPatterns;
final class Singleton {

  private static Singleton s = new Singleton(47);

  private int i;

  private static int j=0;

  private Singleton(int x) { i = x; }

  public static Singleton getReference() {
    return s;
  }

  Singleton()
  {

	  try
	  {
		  if(j==1)
		  	throw new Exception("Already Object Created");
		  else {
		  	System.out.println("created");
		  	j++;
		  }
		}catch(Exception e) {
			System.out.println(e);
		}
	}

  public int getValue() { return i; }
  public void setValue(int x) { i = x; }
}

public class SingletonPattern{
	public static void main(String args[]) throws Exception
	{
		//Singleton s = Singleton.s;
		Singleton.getReference();

		//int i = s.getValue();

		Singleton s1 = new Singleton();

		Singleton s2 = new Singleton();

		Singleton s3 = new Singleton();
	}

}