package crudOperationWithBDDApproach;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class GetAllProjectTest {
	
	@Test
	public void getAllprojectTest()
	{
		//step1: preconditions===>given===> No preconditions for getall
		//step2: Actions====>when
		when()
		.get("http://rmgtestingserver:8084/projects")
		
		//step3:validation===>then
		.then()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.log().all();
		
	}

}
