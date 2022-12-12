package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetailsWithIntArray;

public class SerializationOfIntArrayTest {
	@Test
	public void SerializationOfIntegerArray() throws JsonGenerationException, JsonMappingException, IOException
	{
		int[] phoneno= {123456789,987654321};
		
		//Step1:Create Object for the POJO class
		EmployeeDetailsWithIntArray empIntArr=new EmployeeDetailsWithIntArray("Sujana","ty0111",phoneno,20000,"abc@gmail.com");
		
		//Step2: create the object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//Step3: Write the values to json file
		objm.writeValue(new File("empArr.json"), empIntArr);
	}

}
