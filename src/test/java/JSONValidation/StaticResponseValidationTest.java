package JSONValidation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class StaticResponseValidationTest {
	
	@Test
	public void staticvalidation()
	{
		//prerequisites
		String expData="TY_PROJ_1013";
		baseURI="http://rmgtestingserver:8084";
		port=8084;
		
		//action
		Response resp = when()
		                 .get("/projects");
		
		//validation
		String actdata = resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(expData, actdata);
		System.out.println("verified");
		
		resp.then().log().all();
		
		
		
		
	}

}
