/**
 * 
 */
package com.deepak.serialization.dto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author kumadeep
 *
 */
public class SerializationDTO implements Serializable{
	
	private static final long serialVersionUID = -1322760418070541234L;

	private String name;
	
	private int age;
	
	private String companyName;
	
	
	public SerializationDTO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	@Override
	public String toString() {
		return this.name + " : " + this.age + " : " + this.companyName;
	}

	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
		System.out.println("ReadObject method called...");
		ois.defaultReadObject();
		
		SerializationDTO sDTO = new SerializationDTO();
		sDTO.setAge(ois.readInt());
		sDTO.setName(ois.toString());
		//sDTO.setCompanyName(ois.toString());
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException{
		System.out.println("writeObject method called...");
		
		oos.defaultWriteObject();
		oos.writeInt(this.age);
		oos.writeChars(name);
		//oos.writeChars(companyName);
	}
	
}
