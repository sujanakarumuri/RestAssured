package PathParameter;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PathParameterUsingGet {
	
	@Test
	public void pathParameter() {
	
		baseURI ="http://rmgtestingserver";
		port=8084;
		given()
		
		.pathParam("pid", "TY_PROJ_4168")
		.contentType(ContentType.JSON)
		
		.when()
		.get("/projects/{pid}")
		
		
		.then()
		.contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.log().all();
	}

}
