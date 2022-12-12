package crudOperationWithBDDApproach;

import static io.restassured.RestAssured.when;

import org.hamcrest.Matchers;

import io.restassured.http.ContentType;

public class GetProject1Test {
	
	public void getProjectTest()
	{
		//step1:precondition===>given
		//step2: Action===>when
		when()
		.get("http://rmgtestingserver:8084/projects")
		
		//step3:validation===>then
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L))
		.log().all();
	}

}
