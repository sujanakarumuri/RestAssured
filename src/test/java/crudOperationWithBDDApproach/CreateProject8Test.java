package crudOperationWithBDDApproach;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import io.restassured.http.ContentType;

public class CreateProject8Test {
	
	public void CreateProjectTest()
	{
		//JavaLibrary_RandomNumber jran=new JavaLibrary_RandomNumber();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","sujana");
		jobj.put("projectName","testyanta_rmg12" );
		jobj.put("status","open" );
		jobj.put("teamsize",23.6 );
		
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		
		.then()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
	}





}
