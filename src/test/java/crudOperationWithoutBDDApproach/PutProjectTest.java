package crudOperationWithoutBDDApproach;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutProjectTest {
	@Test
	public void putProjectTest()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Raghu");
		jobj.put("projectName", "Fin_abc");
		jobj.put("status", "created");
		jobj.put("team", 40);
		
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(jobj);
		reqspec.contentType(ContentType.JSON);
		
		//Actions
		Response response = reqspec.put("http://rmgtestingserver:8084/projects/TY_PROJ_3883");
		response.getContentType();
		
		//validation
		ValidatableResponse validate = response.then();
		validate.assertThat().contentType(ContentType.JSON);
		validate.assertThat().statusCode(200);
		validate.log().all();
	}

}
