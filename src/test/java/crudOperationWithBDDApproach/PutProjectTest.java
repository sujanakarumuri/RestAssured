package crudOperationWithBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutProjectTest {
	
	@Test
	public void putProjectTest()
	{
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","Sujana111");
		jobj.put("projectName", "RestAssured");
		jobj.put("status", "Completed");
		jobj.put("teamSize",20);
		
		//step1:precondition
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		//step2: Action====>when
		.when()
		.put("http://rmgtestingserver:8084/projects/TY_PROJ_4168")
		
		//step3: validation===>then
		.then()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
	}

}
