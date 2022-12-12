package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmpSpouseDetails;
import pojoClassForParsing.EmployeeDetailsWithObject;

public class SerializationOfObjectTest {
	@Test
	public void SerializationOfObjectvalues() throws JsonGenerationException, JsonMappingException, IOException
	{
		EmpSpouseDetails empspouse=new EmpSpouseDetails("ss", "td01", 1111222333, "Banglore", "abc@gmail.com");
		
		//step1: create object for POJO class
		EmployeeDetailsWithObject empObj=new EmployeeDetailsWithObject("sujana", "ty011", 123456789, "Banglore", "abc@gmail/.com",empspouse);
		
		//step2:create object for the object mapper
		ObjectMapper obj=new ObjectMapper();
		
		//step3: write the values to json file
		obj.writeValue(new File("Object.json"), empObj);
	}

}
