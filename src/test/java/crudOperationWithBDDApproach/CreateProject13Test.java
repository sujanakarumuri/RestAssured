package crudOperationWithBDDApproach;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProject13Test {
	
	@Test
	public void CreateProjectTest()
	{
		//JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Sujana23");
		jobj.put("projectName", "rmgtesting2");
		jobj.put("status", "completed");
		jobj.put("teamsize", 10);
		
		given()
		.body(jobj)
		.contentType(ContentType.XML)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
