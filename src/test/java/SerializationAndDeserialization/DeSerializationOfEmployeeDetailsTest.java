package SerializationAndDeserialization;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetails;

public class DeSerializationOfEmployeeDetailsTest {

	@Test
	public void DeserializationOfEmp() throws JsonParseException, JsonMappingException, IOException
	{
		//step1: create Object for ObjectMapper
		ObjectMapper objm=new ObjectMapper();
		
		//step2:read the value from object mapper
		 EmployeeDetails value = objm.readValue(new File("./empdet.json"), EmployeeDetails.class);
		 System.out.println("empname="+value.geteName());
		 System.out.println("empid="+value.geteId());
	}
}
