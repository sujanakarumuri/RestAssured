package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForParsing.EmployeeDetailsWithIntArray;

public class DeserializationOfIntArrayTest {
	
@Test
public void DeserializationOfIntArray() throws JsonParseException, JsonMappingException, IOException
{
	//step1:create object for object mapper
	ObjectMapper objm=new ObjectMapper();
	
	//step2:read the value from object mapper
	EmployeeDetailsWithIntArray value = objm.readValue(new File("./empArr.json"), EmployeeDetailsWithIntArray.class);
	
	System.out.println(value.getEname());
	int[] size = value.getPhoneno();
	for(int val:size)
    System.out.println(val);
}
}
