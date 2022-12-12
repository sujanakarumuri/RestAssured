package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetailsWithObject;

public class DeserializationOfObjectTest {
	@Test
	public void DeserializationOfObject() throws Throwable, JsonMappingException, IOException
	{
		//step1: create object for object mapper
		ObjectMapper objm=new ObjectMapper();
		
		//step2:read value from object mapper
		EmployeeDetailsWithObject value = objm.readValue(new File("./Object.json"), EmployeeDetailsWithObject.class);
		System.out.println("empname="+value.geteName());
		System.out.println("empid="+value.geteId());
		System.out.println("emp-mailid="+value.getMailId());
		System.out.println("emp address="+value.getAddress());
		System.out.println("spouse details="+value.getEmpSpouseDetails());
		
		
	}

}
