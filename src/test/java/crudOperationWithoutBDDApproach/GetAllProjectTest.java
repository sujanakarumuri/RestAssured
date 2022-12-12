package crudOperationWithoutBDDApproach;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetAllProjectTest {
	@Test
	public void getProjectTest()
	{
		//precondition
		RequestSpecification reqspec = RestAssured.given();
		
		//Actions
		Response response = reqspec.get("http://rmgtestingserver:8084/projects");
		response.getContentType();
		
		//validations
		ValidatableResponse validate = response.then();
		validate.assertThat().statusCode(200);
		validate.log().all();
		
	}

}
