package com.javacode4designpatterns.CreationalPatterns;

class Person {
  // name string
	 public String name;
  // gender : M or F
	private String gender;

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
}// End of class

class Male extends Person {
  public Male(String fullName) {
	System.out.println("Hello Mr. "+fullName);
  }
}// End of class


class Female extends Person {
  public Female(String fullNname) {
	System.out.println("Hello Ms. "+fullNname);
  }
}// End of class


public class FactoryPattern {
  public static void main(String args[]) {
	FactoryPattern factory = new FactoryPattern();
	factory.getPerson(args[0], args[1]);
}

	public Person getPerson(String name, String gender) {
		if (gender.equalsIgnoreCase("M"))
			return new Male(name);
		else if(gender.equalsIgnoreCase("F"))
			return new Female(name);
		else
			return null;
	}
}// End of class