/**
 * 
 */
package com.deepak.serialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.deepak.serialization.dto.SerializationDTO;

/**
 * @author kumadeep
 *
 */
class SerializationMain {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializationDTO sDTO = new SerializationDTO();
		sDTO.setAge(15);
		sDTO.setCompanyName("harman");
		sDTO.setName("Deepak");
		
		FileOutputStream fos = new FileOutputStream(new File("abc.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sDTO);
		
		FileInputStream fis = new FileInputStream(new File("abc.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationDTO s = (SerializationDTO) ois.readObject();
		System.out.println(s.toString());
	}

}
