package FormParameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class FormParameterTest {
	@Test
	public void formParameter()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.formParam("createdBy","sujana")
		.formParam("projectName","Application")
		.formParam("status","Delivered")
		.formParam("teamSize",22)
		
		.when()
		.post("/addProjects")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		
		
		
		
		
		
	}

}
