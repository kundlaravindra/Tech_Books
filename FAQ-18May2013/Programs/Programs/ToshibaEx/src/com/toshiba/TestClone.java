package com.toshiba;

//public class TestClone implements Cloneable{
	public class TestClone {
	int a;
	double b;
	TestClone cloneTest() {
		try {
			return (TestClone) super.clone();
					}
		catch(CloneNotSupportedException e) {
			return this;
		}
				
	}

}
