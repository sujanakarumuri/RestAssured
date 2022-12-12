package crudOperationWithBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import CRUDWithBDD.JavaLibrary_RandomNumber;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class CreateProject2Test {
	
	@Test
	public void CreateProjectTest()
	{
		//JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Sujana2");
		jobj.put("projectName", "rmgtesting2");
		jobj.put("status", "completed");
		jobj.put("teamsize", 10);
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
