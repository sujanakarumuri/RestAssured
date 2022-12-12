package crudOperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetProjectTest {
	@Test
	public void getProjectTest()
	{
		//precondition
		RequestSpecification reqspec = RestAssured.given();
		
		//Action
		Response response = reqspec.get("http://rmgtestingserver:8084/projects/TY_PROJ_3883");
		response.getContentType();
		
		//validate
		ValidatableResponse validate = response.then();
		validate.assertThat().contentType(ContentType.JSON);
		validate.assertThat().statusCode(200);
		
		validate.log().all();
		
	}

}
