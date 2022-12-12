package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetailsWithStringArray;

public class SerializationOfStringArrayTest {
	@Test
	public void SerializationOfStringArray() throws JsonGenerationException, JsonMappingException, IOException
	{
		String[] mailid= {"abc@gmail.com","mno@gmail.com"};
		//step1: Create Object for POJO class
		EmployeeDetailsWithStringArray empString=new EmployeeDetailsWithStringArray("Sujana","ty03",1234567890,mailid,"Banglore");
		
		//step2: create the object for object mapper
	    ObjectMapper objm=new ObjectMapper();
	    
		//step3:write the values to json file
	    objm.writeValue(new File("stringArray.json"),empString );
	}

}
