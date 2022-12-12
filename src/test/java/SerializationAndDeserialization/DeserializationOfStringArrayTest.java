package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetailsWithStringArray;

public class DeserializationOfStringArrayTest {
	
	@Test
	public void DeserializationOfString() throws JsonParseException, JsonMappingException, IOException
	{
		//step1: create object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//step2:read values from object manner
		EmployeeDetailsWithStringArray val = objm.readValue(new File("./stringArray.json"), EmployeeDetailsWithStringArray.class);
		System.out.println("ename="+val.getename());
		String[] mail = val.getmailid();
		for(String s:mail)
		{
			System.out.println("mailid="+s);
		}
		
		System.out.println("id="+val.geteid());
	}

}
