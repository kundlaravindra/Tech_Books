/**
 * 
 */
package com.deepak.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.TypeReference;

/**
 * @author kumadeep
 *
 */
public class Test extends Demo{

	public static void method(){
		System.out.println("m2");
	}
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String str = "{\"taskId\":32,\"taskValue\":[\"test\"],\"comments\":null,\"image\":null,\"audio\":null,\"video\":null,\"file\":null,\"gpsTrack\":null}";
		System.out.println(str);
		System.out.println(str.subSequence(str.indexOf("taskId\":")+ "taskId\":".length(), str.indexOf(",\"taskValue")));
		
		
		String str1 = "qd123";
		if(null == str1){
			System.out.println("Its null");
		}else
		if(str1.trim().matches("^[0-9]+$")){
			System.out.println(str1.trim().matches("^[0-9]+$"));
		}else{
			System.out.println("Its null");
		}
		
		
		
		String str2 = "\"taskid & comm ID : 88 & 116765; request_input_string :[{ \\\"latitude\\\": 51.23423423, \\\"longitude\\\": 51.2342311 } ]\"";
		String taskandCmmissionID = str2.subSequence(str2.indexOf("taskid & comm ID : ") + "taskid & comm ID : ".length(),
				str2.indexOf("; request_input_string")).toString();
		System.out.println(taskandCmmissionID.subSequence(0, taskandCmmissionID.indexOf(" & ")));
		
		/*try {
			Map<String, String> result = new ObjectMapper().readValue(
					str, TypeFactory.mapType(HashMap.class, String.class, String.class));
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*Map<String,String> map = new HashMap<String,String>();
		ObjectMapper mapper = new ObjectMapper();
			
		try {
			
			//convert JSON string to Map
			map = mapper.readValue(str, 
			    new TypeReference<HashMap<String,String>>(){});
				
			System.out.println(map);
				 
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

}
