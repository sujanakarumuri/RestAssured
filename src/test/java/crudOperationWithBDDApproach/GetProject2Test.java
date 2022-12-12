package crudOperationWithBDDApproach;

import static io.restassured.RestAssured.when;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetProject2Test {
	
	@Test
	public void getProjectTest()
	{
		//step1:precondition===>given
		//step2: Action===>when
		when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_4180")
		//.get("http://rmgtestingserver:8084/projects/TY_PROJ_4123")
		
		
		//step3:validation===>then
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L))
		.log().all();
	}

}
