package crudOperationWithBDDApproach;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAllProject1Test {
	
	@Test
	public void getAllprojectTest()
	{
		//step1: preconditions===>given===> No preconditions for getall
		//step2: Actions====>when
		when()
		.get("http://rmgtestingserver:8084")
		
		//step3:validation===>then
		.then()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.log().all();
		
	}

}
