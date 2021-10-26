package com.toshiba;

public class CloneingObject implements Cloneable {

	public CloneingObject clone() throws CloneNotSupportedException {
		//public Object clone() throws CloneNotSupportedException {
	
		return (CloneingObject) super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneingObject c = new CloneingObject();
		//CloneingObject d = c.clone();
		CloneingObject d = (CloneingObject)c.clone();
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(c);
		System.out.println(d);
		
	}

}
