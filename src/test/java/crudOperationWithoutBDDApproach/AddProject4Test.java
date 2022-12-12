package crudOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProject4Test {
	
	@Test
	public void addProjectTest() {
		
		//As we are using POST http method------>creating the body
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "sujana123");
		jobj.put("projectName", "rmgTestYantra4");
		jobj.put("status", "created");
		jobj.put("teamSize", "Twenty");
		
		//preconditions(given())
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.body(jobj);
		reqSpec.contentType(ContentType.JSON);
		
		//Actions(when())
		Response response=reqSpec.post("http://rmgtestingserver:8084/addProject");
		//response.prettyPrint();
		//response.prettyPeek();
		
		//Validations(then())
		response.getContentType();
		ValidatableResponse valResponse=response.then();
		valResponse.assertThat().contentType(ContentType.JSON);
		valResponse.assertThat().statusCode(201);
		valResponse.log().all();
	}

}
