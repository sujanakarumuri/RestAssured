package DifferentWaysToPostRequest;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import CRUDWithBDD.JavaLibrary_RandomNumber;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateRequestByUsingHashMapTest {
	
	@Test
	public void CreateRequest() 
	{
		JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber(); 
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("createdBy", "Sujana");
		map.put("projectName", "Rmg_Testy1"+jran.getRandomNumber());
		map.put("status", "new");
		map.put("team size", 20);
		
		//step1: precondition
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
		//step2:
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		//step3:
		.then()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
		
		
		
		
		
		
	}

}
