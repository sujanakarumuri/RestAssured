package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetails;

public class SerializationOfEmployeeDetailsTest {
	
	@Test
	public void employeeDetails() throws JsonGenerationException, JsonMappingException, IOException
	{
		//Step1: Create object for POJO class
		EmployeeDetails empdetails=new EmployeeDetails("Sujana", "abc1", 123456789, "Banglore", "abc@gmail.com");
		
		//Step2:Create the object for the object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//Step3: write the values to json file
		objm.writeValue(new File("empdet.json"), empdetails);
	}

}
